/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen_SMS;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class SMS {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

    }//Main   

    public static void pedirCita(Paciente paciente) {

    }

    private static void menuMedico(Medico medico) {
        System.out.println("** Calendario de citas **");
        System.out.println("Doctor: " + medico.getApellido());
        System.out.println("Especilidad: " + medico.getEspecialidad());

    }

    private static void menuPaciente(Paciente paciente) {
        int opcion;
        System.out.println("*****************************************************************");
        System.out.printf(" Bienvenido/a Sr/Sra. %s \n", paciente.getNombre());
        System.out.println("*****************************************************************");
        do {
            System.out.println("1. Cita Previa.");
            System.out.println("2. Farmacia.");
            System.out.println("3. Volver.");
            System.out.print("Opción> ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("Opción no reconocida");
            }
        } while (opcion != 3);

    }

    private static void generarReceta(Medico medico, Paciente paciente) {

    }

    public static void irFarmacia(Paciente paciente) {

    }

} //SMS

