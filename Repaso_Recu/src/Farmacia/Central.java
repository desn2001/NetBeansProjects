/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Farmacia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.Locale;
import java.util.concurrent.locks.StampedLock;

/**
 *
 * @author desn2
 */
public class Central {

    private static HashMap<Integer, Medico> mapaMedicos = new HashMap();
    private static HashMap<Integer, Paciente> mapaPacientes = new HashMap();
    private static HashMap<Medico, Paciente[][]> mapaCitas = new HashMap();
    private static ArrayList<Receta> listaRecetas = new ArrayList<>();
    private static Connection conexion;
    private static Statement st;

    private static Central central = new Central();

    private Central() {
        // Añadir médicos
        Medico medico = new Medico("Alfonso", "López", LocalDate.parse("1980-02-20"));
        mapaMedicos.put(medico.getNumeroColegiado(), medico);
        mapaCitas.put(medico, new Paciente[3][5]);
        medico = new Medico("Rocio", "Belmonte", LocalDate.parse("1985-10-02"));
        medico.setEspecialidad(Especialidad.ALERGIA);
        mapaMedicos.put(medico.getNumeroColegiado(), medico);
        mapaCitas.put(medico, new Paciente[3][5]);

        //Añadir pacientes
        Paciente paciente = new Paciente("José", "Sánchez", LocalDate.parse("1998-05-05"));
        mapaPacientes.put(paciente.getNuss(), paciente);
        paciente = new Paciente("Mario", "Ponce", LocalDate.parse("2015-03-14"));
        mapaPacientes.put(paciente.getNuss(), paciente);

        //cargarDriverBBDD();
    }

    public static Medico getMedico(int colegiado) {
        Medico medico = null;
        for (Integer num : mapaMedicos.keySet()) {
            if (num == colegiado) {
                medico = mapaMedicos.get(num);
            }
        }

        return medico;
    }

    public static boolean identificarMedico(int colegiado) {
        for (Integer num : mapaMedicos.keySet()) {
            if (num == colegiado) {
                return true;
            }
        }
        return false;
    }

    public static boolean identificarPaciente(int nuss) {
        for (Integer num : mapaPacientes.keySet()) {
            if (num == nuss) {
                return true;
            }
        }
        return false;
    }

    public static Paciente getPaciente(int nuss) {
        Paciente paciente = null;
        for (Integer num : mapaPacientes.keySet()) {
            if (num == nuss) {
                paciente = mapaPacientes.get(num);
            }
        }

        return paciente;

    }

    public static void listarMedicos() {
        System.out.println("** MEDICOS *************************************");
        for (Medico m : mapaMedicos.values()) {
            System.out.println(m);
        }

    }

    public static void listarPacientes() {
        System.out.println("** PACIENTES ***********************************");
        for (Paciente p : mapaPacientes.values()) {
            System.out.println(p);
        }

    }

    public static void altaReceta(Medico medico, Paciente paciente, LocalDate fecha, Medicamento medicamento, int duracion, double dosis) {
        cargarDriverBBDD();
        conectar();
        String fechaStr = String.format("%s",fecha);
        try {
            String sql = String.format(Locale.US,"INSERT INTO receta VALUES (null,%d,%d,'%s','%s',%d,%.2f)", medico.getNumeroColegiado(),paciente.getNuss(),medicamento,fechaStr,duracion,dosis);
            st = conexion.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("ERROR: SQL "+ex.getMessage());
        }
        desconectar();
        

    }

    public static void mostrarRecetas(Paciente paciente) {
        cargarDriverBBDD();
        conectar();
        try {
            String sql = "SELECT * FROM receta";
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while ((rs.next())) {
                
                int numeroColegiado = rs.getInt(2);
                Medico medico = Central.getMedico(numeroColegiado);
                int nuss = rs.getInt(3);
                Paciente p = Central.getPaciente(nuss);
                String medicamento = rs.getString(4);
                Medicamento me = Medicamento.valueOf(medicamento);
                String fechaStr = rs.getString(5);
                LocalDate fecha = LocalDate.parse(fechaStr);
                int dia = rs.getInt(6);
                double dosis = rs.getDouble(7);
                
                Receta receta = new Receta(medico, p, me, fecha, dia, dosis);
                listaRecetas.add(receta);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: OBTENER RECETAS "+ex.getMessage());
        }
        desconectar();
        for (Receta receta : listaRecetas) {
            if (receta.getPaciente().getNuss() == paciente.getNuss()) {
                System.out.println(receta);
            }
        }

    }

    public static boolean añadirCita(Medico medico, int dia, int hora, Paciente paciente) {
        for (Medico m : mapaCitas.keySet()) {
            if (m.getNumeroColegiado() == medico.getNumeroColegiado()) {
                Paciente[][] listaPacientes = mapaCitas.get(medico);
                listaPacientes[hora][dia] = paciente;
                return true;
            }
        }
        return false;
    }

    public static boolean liberarCita(Medico medico, int dia, int hora) {
        Paciente[][] listaPacientes = mapaCitas.get(medico);
        listaPacientes[hora][dia] = null;
        mapaCitas.replace(medico, listaPacientes);
        return true;
    }

    public static Paciente getPacienteCita(Medico medico, int dia, int hora) {
        Paciente[][] listaPacientes = mapaCitas.get(medico);
        Paciente paciente = listaPacientes[hora][dia];
        return paciente;
    }

    public static void imprimirCalendario(Medico medico) {
        Paciente[][] horarioPacientes = mapaCitas.get(medico);
        System.out.println("** Calendario de citas **");
        System.out.println("              L         M         X         J         V");
        for (int i = 0; i < 3; i++) {
            System.out.printf("1%d:00AM", i);
            for (int j = 0; j < 5; j++) {
                if (horarioPacientes[i][j] == null) {
                    System.out.printf(" %8s ", " - ");
                } else {
                    String nombre = horarioPacientes[i][j].getNombre().substring(horarioPacientes[i][j].getNombre().length() - 2, horarioPacientes[i][j].getNombre().length());
                    System.out.printf(" %8s ", nombre);
                }
            }
            System.out.println("");
        }

        System.out.println("--------------------------------------------------------");
    }

    private static void cargarDriverBBDD() {
        try {
            // Cargar driver
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("Driver OK!!!");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("ERROR: Al CARGAR LOS DRIVERS " + ex.getMessage());
        }
    }

    private static void conectar() {

        // Conectar
        String url = "jdbc:mariadb://localhost:3306/smsarcas";
        String user = "root";
        String password = "";
        try {
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("CONEXION OK!!!");
        } catch (SQLException ex) {
            System.out.println("ERROR: SQL(CONECTAR) " + ex.getMessage());
        }

    }

    private static void desconectar() {
        try {
            conexion.close();
            System.out.println("DESCONEXIÓN");
        } catch (SQLException ex) {
            System.out.println("ERROR: SQL(DECONECTAR) " + ex.getMessage());

        }

    }

}
