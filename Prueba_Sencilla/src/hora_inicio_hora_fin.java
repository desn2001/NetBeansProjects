
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class hora_inicio_hora_fin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la hora de inicio (formato de 24 horas): ");
        int horaInicio = teclado.nextInt();
        System.out.print("Ingrese los minutos de inicio: ");
        int minutosInicio = teclado.nextInt();

        System.out.print("Ingrese la hora de fin (formato de 24 horas): ");
        int horaFin = teclado.nextInt();
        System.out.print("Ingrese los minutos de fin: ");
        int minutosFin = teclado.nextInt();

        // Calcular las horas y minutos trabajados
        int horasTrabajadas = horaFin - horaInicio;
        int minutosTrabajados = minutosFin - minutosInicio;

        // Manejar el caso en el que los minutos trabajados sean negativos
        if (minutosTrabajados < 0) {
            horasTrabajadas--; // Restar una hora
            minutosTrabajados += 60; // Sumar 60 minutos para obtener el valor positivo
        }

        System.out.println("Total de horas trabajadas: " + horasTrabajadas + " horas y " + minutosTrabajados + " minutos.");
    }
}
