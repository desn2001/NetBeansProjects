/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Agenda;

import EjercicioControl.Prueba01;
import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author desn2
 */
public class App {

    static Scanner teclado = new Scanner(System.in);
    static Connection conexion;
    static String url = ("jdbc:mariadb://localhost:3306/agenda");
    static String username = "root";
    static String password = "";
    static Statement sta;

    public static void main(String[] args) {
        cargarDriver();
        conectarBBDD();
        int opcion;
        do {
            mostrarMenu();
            System.out.println("Introduce una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    String nombre;
                    String apellido;
                    String fecha;
                    System.out.println("=============== AÑADIR CONTACTO ===============");
                    System.out.print("Introduce el nombre: ");
                    nombre = teclado.nextLine();
                    System.out.print("Introduce el apellido: ");
                    apellido = teclado.nextLine();
                    System.out.print("Introduce la fecha de nacimiento[yyyy-MM-dd]: ");
                    fecha = teclado.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, apellido, LocalDate.parse(fecha));
                    System.out.println(nuevoContacto.getEmail());
                    insertar(nuevoContacto.getId(), nombre, apellido, nuevoContacto.getEmail(), LocalDate.parse(fecha));
                    System.out.println("===============================================");
                    break;
                case 2:
                    System.out.println("===================== BORRAR CONTACTO =====================");
                    System.out.print("Introduce el id del contacto a eliminar: ");
                    int id = Integer.parseInt(teclado.nextLine());
                    borrar(id);
                    System.out.println("===========================================================");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR: Opción fuera de rango");
            }
        } while (opcion != 5);

        desconectarBBDD();

    }

    public static void cargarDriver() {
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("DRIVERS OK!!!");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("ERROR: AL CARGAR DRIVERS " + ex.getMessage());
        }
    }

    public static void conectarBBDD() {
        try {
            System.out.println("CONEXIÓN OK!!!");
            conexion = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println("ERROR: AL CONECTAR CON LA BBDD " + ex.getMessage());
        }
    }

    public static void desconectarBBDD() {
        try {
            conexion.close();
            System.out.println("DESCONEXIÓN OK!!!");
        } catch (SQLException ex) {
            System.out.println("ERROR: AL DESCONECTAR LA BBDD " + ex.getMessage());
        }
    }

    private static void mostrarMenu() {
        System.out.println("1. Insertar contacto.");
        System.out.println("2. Borrar contacto.");
        System.out.println("3. Listar contactos por letra comienzo.");
        System.out.println("4. Listar contactos por mes.");
        System.out.println("5. Salir.");

    }

    public static void insertar(int id, String nombre, String apellidos, String email, LocalDate fecha) {
        try {

            sta = conexion.createStatement();
            String sql = String.format("INSERT INTO contactos VALUES(%d,'%s','%s','%s','%s')", id, nombre, apellidos, email, fecha);
            sta.executeUpdate(sql);
            sta.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private static void borrar(int id) {
        try {
            sta = conexion.createStatement();
            sta.executeUpdate("DELETE FROM contactos WHERE id = '"+id+"'");
            sta.close();

        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
