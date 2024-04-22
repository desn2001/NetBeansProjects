/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen2º;

/**
 *
 * @author desn2
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] alumnos = {
            {"Pepe", "Juan", "Marta", "Alicia", "Leo"},
            {"30", "35", "35", "20", "18"}
        };
        System.out.println("Ejercicio03 - Mayores");
        System.out.println("=============================");
        System.out.println("");
        System.out.println("Alumnos:");
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[i].length; j++) {
                System.out.print(alumnos[i][j]);
            }
            System.out.println();
        }

    }

}
