/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_SMS;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author desn2
 */
public class Central {

    private static HashMap<Integer, Medico> mapaMedicos = new HashMap();
    private static HashMap<Integer, Paciente> mapaPacientes = new HashMap();
    private static HashMap<Medico, Paciente[][]> mapaCitas = new HashMap();
    private static ArrayList<Receta> listaRecetas = new ArrayList<>();
    //private static Connection conexion = null;

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
        for (Medico medico : mapaMedicos.values()) {
            System.out.println(medico);
        }

    }

    public static void listarPacientes() {
        System.out.println("** PACIENTES ***********************************");
        for (Paciente paciente : mapaPacientes.values()) {
            System.out.println(paciente);
        }

    }

    public static void altaReceta(Medico medico, Paciente paciente, LocalDate fecha, Medicamento medicamento, int duracion, double dosis) {

    }

    public static void mostrarRecetas(Paciente paciente) {

    }

    public static boolean añadirCita(Medico medico, int dia, int hora, Paciente paciente) {
        return false;
    }

    public static boolean liberarCita(Medico medico, int dia, int hora) {
        return false;
    }

    public static Paciente getPacienteCita(Medico medico, int dia, int hora) {
        return null;
    }

    public static void imprimirCalendario(Medico medico) {
        Paciente[][] horarioPacientes = mapaCitas.get(medico);
        System.out.println("** Calendario de citas **");

        System.out.println("-------------------------------------");
    }

    private static void cargarDriverBBDD() {
        // Cargar driver

//      Class.forName("org.mariadb.jdbc.Driver");
    }

    private static void conectar() {

        // Conectar
        String url = "jdbc:mariadb://localhost:3306/smsarcas";
        String user = "root";
        String password = "";

//      conexion = DriverManager.getConnection(url, user, password);
    }

    private static void desconectar() {

    }

}
