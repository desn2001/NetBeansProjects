/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACADEMIAARCAS;

import ACADEMIAARCAS.BBDD;
import ACADEMIAARCAS.Materia;

/**
 *
 * @author maxim
 */
public class pruebitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BBDD.addProfesor("Paco", Materia.MATES);
        BBDD.addProfesor("Antonio", Materia.INGLES);
        BBDD.addProfesor("Morientes", Materia.LENGUA);
        BBDD.addEstudiante("Perico");
        BBDD.addEstudiante("Mbappe");
        BBDD.addEstudiante("Ancelloti");
        BBDD.addMatricula(201, 5001);
        BBDD.addMatricula(201, 5002);
        BBDD.addMatricula(201, 5003);
        BBDD.addMatricula(202, 5001);
        BBDD.addMatricula(202, 5002);
        BBDD.addMatricula(202, 5003);
        BBDD.addMatricula(203, 5001);
        BBDD.addMatricula(203, 5002);
        BBDD.addMatricula(203, 5003);
        
        
       
    }
    
}
