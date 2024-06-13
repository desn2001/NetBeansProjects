/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author desn2
 */
public class BD {

    static Connection conexion;
    static Statement sta;
    static String url = "jdbc:mariadb://127.0.0.1:3306/agenda";
    static String user = "root";
    static String pass = "";
//    "org.mariadb.jdbc.Driver"

    public static void cargarDriver() {
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("DRIVER OK!!!");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("ERROR AL CARGAR EL DRIVER " + ex.getMessage());
        }
    }

    public static void conectar() {
        try {
            conexion = DriverManager.getConnection(url, user, pass);
            System.out.println("CONEXIÓN OK!!!");
            sta = conexion.createStatement();
        } catch (SQLException ex) {
            System.out.println("ERROR AL CONECTAR CON LA BBDD " + ex.getMessage());
        }
    }

    public static void desconectar() {
        try {
            sta.close();
            conexion.close();
            System.out.println("DESCONEXIÓN OK!!!");
        } catch (SQLException ex) {
            System.out.println("ERROR AL DESCONECTAR LA BBD");
        }
    }

    public static void insertar(Contacto c) {
        try {
            String sql = String.format(Locale.US, "INSERT INTO contacto VALUES (%d,'%s','%s','%s','%s')", c.getId(), c.getNombre(), c.getApellido(), c.getEmail(), c.getFecha());
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("ERROR AL INTRODUCIR CONTACTO " + ex.getMessage());
        }
    }

    public static int calcularEdad(Contacto c) {
        String sql = String.format("SELECT fecha FROM contacto WHERE id = %d;", c.getId());
        int edad = 0;
        try {
            ResultSet rs = sta.executeQuery(sql);
            rs.next();
            Date fecha = rs.getDate(1);
            LocalDate fechaLocal = fecha.toLocalDate();
            edad = (int) ChronoUnit.YEARS.between(fechaLocal, LocalDate.now());
            rs.close();
        } catch (SQLException ex) {
            System.out.println("ERROR AL CALCULAR EDAD " + ex.getMessage());
        }
        return edad;
    }

    public static void eliminar(int id) {
        String sql = String.format("DELETE FROM contacto WHERE id = %d", id);
        try {
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("ERROR AL ELIMINAR CONTACTO " + ex.getMessage());
        }
    }

    public static ArrayList<Contacto> listaCompleta() {
        try {
            String sql = "SELECT * FROM contacto";
            ResultSet rs = sta.executeQuery(sql);
            ArrayList<Contacto> listaCompleta = new ArrayList<>();
            while ((rs.next())) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String fecha = rs.getString(5);
                Contacto contacto = new Contacto(id, nombre, apellido, LocalDate.parse(fecha));
                listaCompleta.add(contacto);
            }
            rs.close();
            return listaCompleta;

        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static ArrayList<Contacto> listaPorLetra(char letra) {
        try {
            String sql = "SELECT * FROM contacto WHERE nombre LIKE '" + letra + "%'";
            ResultSet rs = sta.executeQuery(sql);
            ArrayList<Contacto> listaCompleta = new ArrayList<>();
            while ((rs.next())) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String fecha = rs.getString("fecha");
                Contacto contacto = new Contacto(id, nombre, apellido, LocalDate.parse(fecha));
                listaCompleta.add(contacto);
            }
            rs.close();
            return listaCompleta;
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
