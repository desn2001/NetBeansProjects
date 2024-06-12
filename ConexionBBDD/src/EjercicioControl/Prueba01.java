/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioControl;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author desn2
 */
public class Prueba01 {

    static Connection conexion;
    static String url = ("jdbc:mariadb://localhost:3306/control03");
    static String username = "root";
    static String password = "";
    
    public static void main(String[] args) {
        cargarDriver();
        conectarBBDD();
        desconectarBBDD();
        
    }
    
    public static void cargarDriver(){
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("DRIVERS CARGADOS CON EXITO!!!");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("ERROR: AL CARGAR DRIVERS "+ex.getMessage());
        }
    }
    
    public static void conectarBBDD(){
        try {
            conexion = DriverManager.getConnection(url,username,password);
            System.out.println("CONEXIÓN OK!!!");
        } catch (SQLException ex) {
            System.out.println("ERROR: AL CONECTAR CON LA BBDD "+ex.getMessage());
        }
    }
    
    public static void desconectarBBDD(){
        try {
            conexion.close();
            System.out.println("DESCONEXIÓN OK!!!");
        } catch (SQLException ex) {
            System.out.println("ERROR: AL DESCONECTAR CON LA BBDD "+ex.getMessage());
        }
    }
    
}
