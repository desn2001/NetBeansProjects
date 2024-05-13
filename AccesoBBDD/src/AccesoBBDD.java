
import java.sql.*;
import java.util.Scanner;
import javax.swing.tree.ExpandVetoException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class AccesoBBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Primero cargar el driver
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("Conexión OK");
        } catch (Exception ex) {
            System.out.println("Error, no se ha podido cargar el Driver");
        }
        //segundo conexion con la BBDD
        String urlmariadb = "jdbc:mariadb://127.0.0.1/personas";
        String username = "root";
        String password = "";
        try {
            Connection connection = (Connection) DriverManager.getConnection(urlmariadb, username, password);
            Statement statement = connection.createStatement();
            int opcion;
            do {
                System.out.println("====================================");
                System.out.println("                AGENDA              ");
                System.out.println("====================================");
                System.out.println("1. ALTA");
                System.out.println("2. LISTAR");
                System.out.println("3. SALIR");
                System.out.println("");
                System.out.print("ELige una Opción: ");
                opcion = Integer.parseInt(teclado.nextLine());

                switch (opcion) {
                    case 1 -> {
                        //INSERT
                        String nombre;
                        String apellido;
                        int edad;
                        System.out.println("====== ALTA DEL CONTACTO ======");
                        System.out.print("Introduce el nombre: ");
                        nombre = teclado.nextLine();
                        System.out.print("Introduce el apellido: ");
                        apellido = teclado.nextLine();
                        System.out.print("Introduce la edad: ");
                        edad = Integer.parseInt(teclado.nextLine());
                        String sql = String.format("INSERT INTO personas VALUES (NULL,'%s','%s',%d)", nombre, apellido, edad);
                        statement.executeUpdate(sql);
                    }
                    case 2 -> {
                        //SELECT
                        System.out.println("======= LISTA DE CONTACTOS =======");
                        ResultSet rs = statement.executeQuery("SELECT * FROM personas");
                        System.out.println("ID NOMBRE   APELLIDO    EDAD");
                        while (rs.next()) {

                            int id = rs.getInt("id");
                            String nombre = rs.getString("nombre");
                            String apellido = rs.getString("apellidos");
                            int edad = rs.getInt("edad");
                            System.out.printf("%-2d %-8s %-8s %5d\n", id, nombre, apellido, edad);
                        }
                        System.out.println("");
                        rs.close();
                        statement.close();
                        connection.close();

                    }
                    case 3 -> {
                        System.out.println("SALIENDO...");
                    }
                    default ->
                        System.out.println("ERROR. Opcion Invalida");
                }
            } while (opcion != 3);


        } catch (SQLException ex) {
            System.out.println("ERROR. No conecta a BBDD");
            System.out.println(ex.getMessage());
        }
    }

}
