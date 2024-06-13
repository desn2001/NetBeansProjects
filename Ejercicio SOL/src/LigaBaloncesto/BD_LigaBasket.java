/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LigaBaloncesto;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author desn2
 */
public class BD_LigaBasket {

    private static Scanner teclado = new Scanner(System.in);
    private static Connection conexion;
    private static Statement sta;
    private static String url = "jdbc:mariadb://localhost:3306/horas_trabajo";
    private static String user = "root";
    private static String password = "";

    public static void cargarDriver() {
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("DRIVER OK!!!");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("ERROR: AL CARGAR EL DRIVER " + ex.getMessage());
        }
    }

    public static void conectar() {
        try {
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("CONEXIÓN OK!!!");
        } catch (SQLException ex) {
            System.out.println("ERROR: AL CONECTAR CON LA BASE DE DATOS");
        }
    }

    public static void desconectar() {
        try {
            conexion.close();
            System.out.println("DESCONEXIÓN OK!!!");
        } catch (SQLException ex) {
            System.out.println("ERROR: EN LA DESCONEXIÓN");
        }
    }

    public static ArrayList<Equipo> getEquiposSQL() {
        ArrayList<Equipo> listaEquipos = new ArrayList<>();
        try {
            sta = conexion.createStatement();
            String sql = String.format("SELECT id,nombre,puntos FROM equipo");
            ResultSet rs = sta.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int puntos = rs.getInt("puntos");
                
                listaEquipos.add(new Equipo(id,nombre,puntos));
            }
            rs.close();
            sta.close();
            return listaEquipos;
        } catch (SQLException ex) {
            Logger.getLogger(BD_LigaBasket.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    

}
