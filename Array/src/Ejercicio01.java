/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author desn2
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] animales = {"perro", "gato", "conejo", "pollo", "león"};
        System.out.println("----Lista de animales usando 5 print----");
        System.out.println(animales[0]);
        System.out.println(animales[1]);
        System.out.println(animales[2]);
        System.out.println(animales[3]);
        System.out.println(animales[4]);
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("------Lista de animales usando for------");
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("--------Lista de enteros inverso--------");
        int[] enteros = {2,4,6,8,10};
        for (int i = enteros.length-1; i >= 0; i--) {
            System.out.println(enteros[i]);
        }
        System.out.println("----------------------------------------");

    }

}
