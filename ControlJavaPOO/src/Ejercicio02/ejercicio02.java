/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
public class ejercicio02 {

    static String url = "jdbc:mariadb://localhost:3306/control03";
    static String user = "root";
    static String password = "";
    static Connection conexion;

    public static void main(String[] args) {
        conectar();

        //IMPRIMIR PANTALLA CSV
        try {
            String fichero = "productos.csv";
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            //CABECERA
            String linea = br.readLine();
            System.out.printf("%2s    %-40s  %-65s   %9s   %9s \n","id","product_name","descripcion","standar_cost","list_price","category_id");

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String descripcion = datos[2];
                Double standar_cost = Double.parseDouble(datos[3]);
                Double lista_price = Double.parseDouble(datos[4]);
                int category_id = Integer.parseInt(datos[5]);

                String cadena = String.format("%-3d %-40s %-65s %11.2f %11.2f %2d" , id,nombre,descripcion,standar_cost,lista_price,category_id);
                System.out.println(cadena);
                //Introducir en BBDD
                String sql = String.format(Locale.US, "INSERT INTO products VALUES(%d,'%s','%s','%f','%f',%d)", id, nombre, descripcion, standar_cost, lista_price, category_id);
                Statement sta = conexion.createStatement();
                sta.executeUpdate(sql);
            }
            br.close();

        } catch (FileNotFoundException ex) {
            System.out.println("ERROR ARCHIVO NO ENCONTRADO " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("ERROR IO. " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("ERROR SQL. " + ex.getMessage());
        }
        desconectar();

    }

    public static void conectar() {
        try {
            //CARGAR EL DRIVER
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("DRIVER CARGADO CON EXITO!!!");
            //CONECTO A LA BBDD
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("CONECTADO A LA BBDD");
        } catch (ClassNotFoundException ex) {
            System.out.println("ERROR DE CLASE. " + ex.getMessage());
        } catch (InstantiationException ex) {
            System.out.println("ERROR DE INSTANCIA. " + ex.getMessage());
        } catch (IllegalAccessException ex) {
            System.out.println("ERROR DE ACCESO. " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("ERROR DE SQL(conectar). " + ex.getMessage());
        }
    }

    public static void desconectar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("ERROR DE SQL(desconectar). " + ex.getMessage());
        }
    }

}
