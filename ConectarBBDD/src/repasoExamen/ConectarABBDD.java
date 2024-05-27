/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoExamen;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author desn2
 */
public class ConectarABBDD {

    static String url = "jdbc:mariadb://localhost:3306/control03"; //Te lo da el profesor.
    static String user = "root";
    static String password = "";
    static Connection conexion;

    public static void main(String[] args) {

        conectar();
        desconectar();

    }

    public static void conectar() {
        try {
            //CARGO EL DRIVER
            Class.forName("org.mariadb.jdbc.Driver").newInstance(); //Te lo da el profesor y te da un error para que lo metas en un try catch, Tambien en este punto tendremos que añadir el sarchivo.jar de mariadb
            System.out.println("DRIVERS CARGADOS CORRECTAMENTE");
            //CONECTO A LA BBDD
            conexion = DriverManager.getConnection(url, user, password); //Te lo da el profesor y tambien nos dara un error hasta que añadamos el try catch
            System.out.println("CONECTADO A LA BBDD");
        } catch (ClassNotFoundException ex) {
            System.out.println("ERROR de class. " + ex.getMessage());
        } catch (InstantiationException ex) {
            System.out.println("ERROR de instancia. " + ex.getMessage());
        } catch (IllegalAccessException ex) {
            System.out.println("ERROR de acceso. " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("ERROR de SQL(conectar). " + ex.getMessage());
        }
    }

    public static void desconectar() {
        try {
            conexion.close();//Lo mismo nos dara un error hasta que lo metamos dentro de un try catch
            System.out.println("DESCONEXION DE LA BBDD");
        } catch (SQLException ex) {
            System.out.println("ERROR de SQL(desconectar). " + ex.getMessage());
        }

    }

}
