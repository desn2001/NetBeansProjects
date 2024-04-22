/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen_Cuello_02;

/**
 *
 * @author desn2
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] listaNumeros = {5,2,3,9,7};
        
        for (int i = 0; i < listaNumeros.length; i++) {
            for (int j = 0; j < listaNumeros.length-i-1; j++) {
                if (listaNumeros[j] >listaNumeros[j+1]) {
                    int tmp = listaNumeros[j+1];
                    listaNumeros[j+1] =listaNumeros[j];
                    listaNumeros[j] = tmp;
                    System.out.println(tmp);
                }
                
            }
        }
        
        
        
    }
    
    
}
