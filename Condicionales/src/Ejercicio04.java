
import java.time.LocalDateTime;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner teclado = new Scanner(System.in);
        LocalDateTime horaActual = LocalDateTime.now();
        int hora = horaActual.getHour();
        int minutos = horaActual.getMinute();
//        System.out.println("Introduce una hora en formato 24H");
//        hora = Integer.parseInt(teclado.nextLine());
        System.out.println("Hora actual "+hora+":"+minutos);
        if (hora >= 6 && hora <= 11) {
            System.out.println("BUENOS DIAS");
        } else if (hora >= 12 && hora <= 20) {
            System.out.println("BUENAS TARDES");
        } else {
            System.out.println("BUENAS NOCHES");
        }
    }

}
