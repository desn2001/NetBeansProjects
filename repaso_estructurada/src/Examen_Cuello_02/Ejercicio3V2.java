package Examen_Cuello_02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author desn2
 */
public class Ejercicio3V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String datos[][] = {{"Pepe", "Juan", "Marta", "Alicia", "Leo"}, {"30", "35", "35", "20", "18"}};
        System.out.println("Ejercicio03 - Mayores");
        System.out.println("======================================");
        System.out.println("");
        int contador = 0;
        int edadMax = Integer.parseInt(datos[1][0]);

        for (int i = 0; i < datos.length; i++) {
            if (edadMax <= Integer.parseInt(datos[1][i])) {
                edadMax = Integer.parseInt(datos[1][i]);
                contador++;
            }
        }
        System.out.printf("Hay %d personas de %d años.\n", contador, edadMax);

        //Sacar los Nombres de los mayores
        String nombres[] = new String[contador];
        int posicion = 0;
        for (int i = 0; i < datos[0].length; i++) {
            if (Integer.parseInt(datos[1][i]) == edadMax) {
                nombres[posicion] = datos[0][i];
                posicion++;
            }
        }
        
        System.out.print("Nombres(s): ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]);
            if (i < nombres.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println("");

    }

}
