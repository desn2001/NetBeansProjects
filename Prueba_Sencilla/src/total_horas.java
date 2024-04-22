
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class total_horas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);

        int hora = 0;
        int minuto = 0;
        int acumuladorHora = 0;
        int acumuladorMinuto = 0;
        String respuesta;
        boolean salir = false;

        do {
            System.out.print("Introduce la hora: ");
            hora = Integer.parseInt(teclado.nextLine());
            System.out.print("Introduce los minutos: ");
            minuto = Integer.parseInt(teclado.nextLine());
            System.out.println("¿Quieres salir?");
            respuesta = teclado.nextLine();
            if (respuesta.equals("si")) {
                salir = true;
                System.out.println("SALIENDO...");
            } else {
                salir = false;
            }
            acumuladorHora += hora;
            acumuladorMinuto += minuto;
            if (acumuladorMinuto >= 60) {
                acumuladorHora += acumuladorMinuto / 60;
                acumuladorMinuto %= 60;
            }

        } while (!salir);
        System.out.println(acumuladorHora + " horas " + acumuladorMinuto + " minutos");
    }
}
