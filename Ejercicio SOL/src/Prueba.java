
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class Prueba {

    private static Connection conexion;
    private static Statement sta;

    public static void main(String[] args) {
        HashMap<Integer, String> mapaGrupo = new HashMap<>();
        HashMap<String, String> notasNum = new HashMap<>();
        cargarDriver();
        conectar();
        //Leemos el fichero Alumnos.csv e imprimimos
        FileReader fr;
        try {
            fr = new FileReader("Alumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            String listaCabecera[] = linea.split(";");
//            String cabecera = String.format("%-10s %10s %15s  %15s\n", listaCabecera[0], listaCabecera[1], listaCabecera[2],listaCabecera[3]);
//            System.out.print(cabecera);

            while ((linea = br.readLine()) != null) {
                String lista[];
                lista = linea.split(";");
                int id = Integer.parseInt(lista[0]);
                String apellido = lista[1];
                String nombre = lista[2];
                String grupo = lista[3];
//                System.out.printf("%-10d %8s %15s %18s\n",id,apellido,nombre,grupo);
                mapaGrupo.put(id, grupo);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Leemos el fichero Notas.csv e imprimimos
        try {
            FileReader fileReader = new FileReader("Notas.csv");
            BufferedReader br = new BufferedReader(fileReader);

            String linea = br.readLine();
            String listaCabecera[] = linea.split(";");
            String cabecera = String.format("%s %10s %10s %10s\n", listaCabecera[0], listaCabecera[1], "Grupo", listaCabecera[2]);
            System.out.print(cabecera);
            while ((linea = br.readLine()) != null) {
                String lista[];
                lista = linea.split(";");

                int id = Integer.parseInt(lista[0]);
                String asignatura = lista[1];
                String grupo = mapaGrupo.get(id);
                String nota = lista[2];
                System.out.printf("%2d %6s %10s %12s\n", id, asignatura, grupo, nota);
                 String sql = "INSERT INTO tu_tabla (columna1, columna2) VALUES (?, ?)";

            }

            br.close();
            fileReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR: Fichero no encontrado " + ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
    }
    
    public static void cargarDriver(){
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("DRIVER OK!!!");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("ERROR: AL CARGAR DRIVER "+ex.getMessage());
        }
    }

    public static void conectar() {
        String url = "jdbc:mariadb://localhost:3306/smsarcas";
        String user = "root";
        String password = "";
        try {
            conexion = DriverManager.getConnection(url,user,password);
            System.out.println("CONEXION OK!!!");
        } catch (SQLException ex) {
            System.out.println("ERROR: AL CONECTAR "+ex.getMessage());
        }
    }
    
    public static void desconectar(){
        try {
            conexion.close();
            System.out.println("DESCONEXIÓN OK!!!");
        } catch (SQLException ex) {
            System.out.println("ERROR: AL DESCONECTAR "+ex.getMessage());
        }
    }

    //CREACION DE BBDD
//DROP DATABASE IF EXISTS control_alumnos;
//
//CREATE DATABASE control_alumnos;
//USE control_alumnos;
//
//CREATE TABLE alumnos (
//    id INT,
//    asignatura VARCHAR(255),
//    grupo VARCHAR(255),
//    nota VARCHAR(255)
//);
}
