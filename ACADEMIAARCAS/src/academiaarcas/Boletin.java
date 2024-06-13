/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACADEMIAARCAS;

import java.util.HashMap;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maxim
 */
public class Boletin {

    private HashMap<Integer, Nota[]> mapaNotas;
    private Estudiante estudiante;
    private static int contador = 0;

    public Boletin(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.mapaNotas = new HashMap<>();
    }

    public HashMap<Integer, Nota[]> getMapaNotas() {
        return mapaNotas;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void imprimirBoletin(Estudiante estudiante) {
        System.out.println("** BOLETIN DE NOTAS ***");
        System.out.printf("** ALUMNO/A %s **\n", estudiante.getNombre());
        Nota[] listaNotas = mapaNotas.get(estudiante.getNRE());
        for (int i = 0; i < listaNotas.length-1; i++) {
            if (listaNotas[i]!=null) {
                System.out.println(listaNotas[i]);
            }
            
            
        }
    }

    public void addNotas(Boletin boletin) {
        BBDD.conectarBBDD();
        
        Nota[] listaNotas = new Nota[9];
        try {
            BBDD.st = BBDD.conexion.createStatement();
            String sql = "SELECT * FROM notas";
            ResultSet rs = BBDD.st.executeQuery(sql);
            while ((rs.next())) {
                int idProfesor = rs.getInt(2);
                Profesor profesor = BBDD.getProfesor(idProfesor);
                int NREalumno = rs.getInt(3);
                Matricula matricula = BBDD.getMatricula(boletin.getEstudiante(), profesor);
                String evaluacion = rs.getString(5);
                Evaluacion eva;
                if (evaluacion.equals("Ordinaria")) {
                    eva = Evaluacion.O;
                } else {
                    eva = Evaluacion.E;
                }
                double calificacion = rs.getDouble(6);
                
                if (NREalumno== boletin.getEstudiante().getNRE()) {
                    Nota nota = new Nota(matricula, eva, calificacion);                   
                    listaNotas[contador] = nota;
                    
                    
                    
                }
                

                

                contador++;

            }
            boletin.getMapaNotas().put(boletin.getEstudiante().getNRE(), listaNotas);
        } catch (SQLException ex) {
            System.out.println("Error al obtener datos de la BBDD" + ex.getMessage());
        }

        BBDD.desconectarBBDD();
    }

}
