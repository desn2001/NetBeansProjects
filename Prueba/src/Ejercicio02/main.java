/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author desn2
 */
public class main {

    static String url = "jdbc:mariadb://localhost:3306/control03";
    static String usuario = "root";
    static String password = "";
    static Connection conexion;
    private static Statement sta;

    public static void main(String[] args) {
        try {
            conectar();
            String fichero = "productos.csv";
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String descripcion = datos[2];
                Double standar_cost = Double.parseDouble(datos[3]);
                Double lista_price = Double.parseDouble(datos[4]);
                int category_id = Integer.parseInt(datos[5]);

                String cadena = String.format("%-3d %-40s %-65s %11.2f %11.2f %2d", id, nombre, descripcion, standar_cost, lista_price, category_id);
                System.out.println(cadena);

                String sql = String.format(Locale.US, "INSERT INTO products VALUES(%d,'%s','%s','%f','%f',%d)", id, nombre, descripcion, standar_cost, lista_price, category_id);
                sta = conexion.createStatement();
                sta.executeUpdate(sql);
            }
            br.close();

        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void conectar() {
        try {
            //CARGAMOS EL DRIVER
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("DRIVER CARGADO CON EXITO");
            //CONECTAR CON LA BBDD
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("CONECTADO A LA BBDD");
        } catch (SQLException ex) {
            System.out.println("ERROR DE SQL(CONECTAR): " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("ERROR DE CLASE NO ENCONTRADA: " + ex.getMessage());
        } catch (InstantiationException ex) {
            System.out.println("ERROR DE INSTANCIA: " + ex.getMessage());
        } catch (IllegalAccessException ex) {
            System.out.println("ERROR DE ACCESO: " + ex.getMessage());
        }
    }

    public static void desconetar() {
        try {
            conexion.close();
            System.out.println("DESCONECTADO A LA BBDD");
        } catch (SQLException ex) {
            System.out.println("ERROR SQL(DESCONECTAR): " + ex.getMessage());
        }
    }

}
