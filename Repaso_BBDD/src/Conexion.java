
import java.awt.image.BufferedImageOp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class Conexion {

    static Connection conexion;
    static Statement st;
    static String url = "jdbc:mariadb://127.0.0.1:3306/control03";
    static String user = "root";
    static String pass = "";

    public static void main(String[] args) {
        cargarDriver();
        conectar();
        //IMPRIMIR POR PANTALLA EL CSV
        try {
            String fichero = "productos.csv";
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            //TRATAMOS PRIMERO LA CABECERA
            String linea = br.readLine();
            System.out.printf("%2s    %-40s  %-65s   %9s   %9s \n", "id", "product_name", "descripcion", "standar_cost", "list_price", "category_id");
            while ((linea = br.readLine()) != null) {
                String datos[] = linea.split(";");
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String descripcion = datos[2];
                Double standar_cost = Double.parseDouble(datos[3]);
                Double lista_price = Double.parseDouble(datos[4]);
                int category_id = Integer.parseInt(datos[5]);

                String cadena = String.format("%-3d %-40s %-65s %11.2f %11.2f %2d", id, nombre, descripcion, standar_cost, lista_price, category_id);
                System.out.println(cadena);
                
                //Introducir en BBDD
                String sql = String.format(Locale.US, "INSERT INTO products VALUES (%d,'%s','%s','%f','%f',%d)", id, nombre, descripcion, standar_cost, lista_price, category_id);
                Statement sta = conexion.createStatement();
                sta.executeUpdate(sql);
            }
            br.close();

        } catch (FileNotFoundException ex) {
            System.out.println("ERROR: ARCHIVO NO ENCONTRADO "+ex.getMessage());
        } catch (IOException ex) {
            System.out.println("ERROR: IO "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("ERROR: SQL (Introducir en BBDD) "+ex.getMessage());
        }
        desconectar();

    }

    private static void cargarDriver() {
        //Cargar Driver
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("DRIVERS CARGADOS CORRECTAMENTE!!!");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("ERROR: AL CARGAR DRIVERS " + ex.getMessage());
        }
    }

    private static void conectar() {
        //conectar
        try {
            conexion = DriverManager.getConnection(url, user, pass);
            System.out.println("CONEXIÓN OK!!!");
        } catch (SQLException ex) {
            System.out.println("ERROR SQL (CONECTAR)" + ex.getMessage());
        }
    }

    private static void desconectar() {
        //Desconectar
        try {
            conexion.close();
            System.out.println("DESCONEXIÓN OK!!!");
        } catch (SQLException ex) {
            System.out.println("ERROR SQL (DESCONECTAR)" + ex.getMessage());
        }
    }

}
