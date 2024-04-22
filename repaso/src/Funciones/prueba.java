/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Funciones;

/**
 *
 * @author desn2
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "hola me llamo Juan";
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.contentEquals(" ")) {
                contador++;
            }
        }
        System.out.println(contador);
    }
    
}
