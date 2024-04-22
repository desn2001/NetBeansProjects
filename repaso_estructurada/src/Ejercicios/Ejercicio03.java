/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Creamos un arrayBidimensional 3x3
        String[][] tablero = new String[3][3];

        //Rellenamos este array con "."
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = ".";
            }
        }

        //Le ponemos una "c" en el centro
        tablero[1][1] = "c";

        //Imprimimos el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
        String movimiento;

        do {
            System.out.println("Elige un movimiento[A-W-S-D]: ");
            movimiento = teclado.nextLine();
            switch (movimiento) {
                case "A":
                    for (int i = 0; i < tablero.length - 1; i++) {
                        for (int j = 0; j < tablero.length; j++) {
                            if (tablero[i][j].equals("c")) {
                                tablero[i][j - 1] = "c";
                                tablero[i][j] = ".";
                                break;
                            }
                        }
                    }
                    imprimirTablero(tablero);
                    break;
                case "W":
                    for (int i = 0; i < tablero.length - 1; i++) {
                        for (int j = 0; j < tablero.length; j++) {
                            if (tablero[i][j].equals("c")) {
                                tablero[i - 1][j] = "c";
                                tablero[i][j] = ".";
                                break;
                            }
                        }
                    }
                    imprimirTablero(tablero);
                    break;
                case "S":
                    for (int i = 0; i < tablero.length-1; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            if (tablero[i][j].equals("c")) {
                                tablero[i + 1][j] = "c";
                                tablero[i][j] = ".";
                                break;
                            }
                        }
                    }
                    imprimirTablero(tablero);
                    break;
                case "D":
                    for (int i = 0; i < tablero.length - 1; i++) {
                        for (int j = 0; j < tablero.length; j++) {
                            if (tablero[i][j].equals("c")) {
                                tablero[i][j + 1] = "c";
                                tablero[i][j] = ".";
                                break;
                            }
                        }
                    }
                    imprimirTablero(tablero);
                    break;
                default:
                    System.out.println("ERROR. Opción invalida");
            }
        } while (!movimiento.equals(""));

    }

    private static void imprimirTablero(String[][] tablero) {
        //Imprimimos el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
