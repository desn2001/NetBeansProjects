/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio01;

import java.time.LocalDate;

/**
 *
 * @author desn2
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Medico medico = new Medico("Diego", "Sánchez", LocalDate.parse("2001-10-04"));
        System.out.println(medico.toString());
    }
    
}
