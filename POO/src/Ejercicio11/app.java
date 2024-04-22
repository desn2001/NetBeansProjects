/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio11;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factura myFact = new Factura("B123123123", LocalDate.of(2024, 2, 29), 21);

        myFact.añadirLinea("REF004", "Barra de pan", 2, 0.8);
        myFact.añadirLinea("REF001", "Leche 1 litro", 1, 1.5);
        myFact.añadirLinea("REF004", "Cerveza 1 litro", 10, 1);

        myFact.imprimirFactura();
    }

}
