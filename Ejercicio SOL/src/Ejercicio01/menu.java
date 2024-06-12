/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio01;

import java.io.IOException;
import java.util.Scanner;
import java.sql.*;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author desn2
 */
public class menu {

    private static Scanner teclado = new Scanner(System.in);
    private static Connection conexion;
    private static Statement sta;

    public static void main(String[] args) {
        int opcion;
        cargarDriver();
        conectar();
        do {
            System.out.println("*********************************************");
            System.out.println("                    MENU                     ");
            System.out.println("*********************************************");
            System.out.println("1. Mostrar Horas.");
            System.out.println("2. Introducir horas.");
            System.out.println("3. Salir.");
            System.out.print("Opcion> ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:

                    break;
                case 2:
                    introducirHoras();
                    break;
                case 3:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("Opción introducida no válida.");
            }
        } while (opcion != 3);
        desconectar();
    }

    public static void cargarDriver() {
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("DRIVER OK!!!");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("ERROR: AL CARGAR EL DRIVER " + ex.getMessage());
        }
    }

    public static void conectar() {
        String url = "jdbc:mariadb://localhost:3306/horas_trabajo";
        String user = "root";
        String password = "";
        try {
            System.out.println("CONEXIÓN OK!!!");
            conexion = DriverManager.getConnection(url, user, password);
            sta = conexion.createStatement();
        } catch (SQLException ex) {
            System.out.println("ERROR AL CONECTAR CON LA BBDD " + ex.getMessage());
        }
    }

    public static void desconectar() {
        try {
            System.out.println("DESCONEXIÓN OK!!!");
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("ERROR AL DESCONECTAR CON LA BBDD " + ex.getMessage());
        }
    }

    private static void introducirHoras() {
        LocalTime horaEntrada = LocalTime.now(), HoraSalida = LocalTime.now();
        System.out.println("===============================");
        System.out.println("        INTRODUCIR HORA        ");
        System.out.println("===============================");

        System.out.print("hora de entrada: ");
        horaEntrada = horaEntrada.parse(teclado.nextLine());
        System.out.print("hora de salida: ");
        HoraSalida = HoraSalida.parse(teclado.nextLine());

        int segundosTrabajados;
        segundosTrabajados = (int) ChronoUnit.SECONDS.between(horaEntrada, HoraSalida);
        System.out.println(segundosTrabajados);
        int horas, minutos;
        horas = segundosTrabajados / 3600;
        minutos = Math.abs((horas * 3600 - segundosTrabajados) / 60);
        System.out.printf("%dh y %02dmin\n", horas, minutos);
        try {
            String sql = String.format(
                    Locale.US,"INSERT INTO registro_horas (fecha, hora_de_entrada, hora_de_salida, horas_totales, minutos_totales) VALUES (CURDATE(), '%s', '%s', %d, %d)",
                    horaEntrada, HoraSalida, horas, minutos
            );
            sta.executeUpdate(sql);
            conexion.commit();
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

//-- Eliminar la base de datos si ya existe
//DROP DATABASE IF EXISTS horas_trabajo;
//
//-- Crear la base de datose
//CREATE DATABASE horas_trabajo;
//
//-- Usar la nueva base de datos
//USE horas_trabajo;
//
//-- Crear la tabla
//CREATE TABLE registro_horas (
//    id INT AUTO_INCREMENT PRIMARY KEY,
//    fecha DATE NOT NULL,
//    hora_de_entrada TIME NOT NULL,
//    hora_de_salida TIME NOT NULL,
//    horas_totales INT NOT NULL,
//    minutos_totales INT NOT NULL
    //);
