/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio11v2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class app {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Factura factura1 = new Factura("B30341111", LocalDate.now());

        factura1.añadirLinea("REF004", "Barra de pan", 2, 0.80);
        factura1.añadirLinea("REF001", "Leche", 1, 1.5);
        
        factura1.imprimirFactura();
    }

}
