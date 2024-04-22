
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tablero[][] = new String[4][4];
        int mov1;
        int mov2;
        int contadormov = 0;
        String jugador1 = "X";
        String jugador2 = "O";

        // Inicializar tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (j == 0) {
                    if (i == 0) {
                        tablero[i][j] = " ";
                    } else {
                        tablero[i][j] = Integer.toString(i);
                    }
                } else {
                    if (i == 0) {
                        tablero[i][j] = Integer.toString(j);
                    } else {
                        tablero[i][j] = " ";
                    }
                }
            }
        }

        // Imprimir tablero inicial
        imprimirTablero(tablero);

        // Juego
        do {
            // Turno del jugador
            System.out.println("Turno del jugador:");
            System.out.print("Introduce tu coordenada de movimiento ⬆: ");
            mov1 = Integer.parseInt(teclado.nextLine());
            System.out.print("Introduce tu coordenada de movimiento ➡: ");
            mov2 = Integer.parseInt(teclado.nextLine());
            System.out.println("");

            if (mov1 >= 1 && mov1 <= 3 && mov2 >= 1 && mov2 <= 3 && tablero[mov1][mov2].equals(" ")) {
                tablero[mov1][mov2] = jugador1;
            } else {
                System.out.println("Movimiento inválido. Introduce otras coordenadas.");
            }

            imprimirTablero(tablero);
            contadormov++;
            System.out.println("");

            if (hayGanador(tablero, jugador1)) {
                System.out.println("¡Felicidades! Has ganado.");
                break;
            } else if (contadormov == 9) {
                System.out.println("El juego ha terminado en empate.");
                break;
            }

            
            // Turno del ordenador
            System.out.println("Turno del ordenador:");
            do {
                mov1 = generarMovimientoAleatorio();
                mov2 = generarMovimientoAleatorio();
            } while (!tablero[mov1][mov2].equals(" "));
            tablero[mov1][mov2] = jugador2;

            imprimirTablero(tablero);
            contadormov++;

            if (hayGanador(tablero, jugador2)) {
                System.out.println("¡El ordenador ha ganado!");
                break;
            }

        } while (contadormov < 9);

    }

    public static void imprimirTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("| " + tablero[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------------------");
    }

    public static int generarMovimientoAleatorio() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(3) + 1;
    }

    public static boolean hayGanador(String[][] tablero, String jugador) {
        // Compruebo las filas y las columnas
        for (int i = 1; i <= 3; i++) {
            if (tablero[i][1].equals(jugador) && tablero[i][2].equals(jugador) && tablero[i][3].equals(jugador)) {
                return true; 
            }
            if (tablero[1][i].equals(jugador) && tablero[2][i].equals(jugador) && tablero[3][i].equals(jugador)) {
                return true; 
            }
        }
        // Compruebo las diagonales
        if (tablero[1][1].equals(jugador) && tablero[2][2].equals(jugador) && tablero[3][3].equals(jugador)) {
            return true; 
        }
        if (tablero[1][3].equals(jugador) && tablero[2][2].equals(jugador) && tablero[3][1].equals(jugador)) {
            return true; 
        }
        return false; 
    }
}
