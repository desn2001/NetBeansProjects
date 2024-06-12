/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Farmacia;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class SMS {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        Central.listarPacientes();
        System.out.println("");
        Central.listarMedicos();
        String opcion;
        do {
            System.out.println("===================== SMS ARCAS =====================");
            System.out.print("Introduce un NUSS / Nª Colegiado: ");
            opcion = teclado.nextLine();
            if (opcion.equals("exit")) {
                System.out.println("SALIENDO...");
                return;
            }
            try {
                int opcionInt;
                opcionInt = Integer.parseInt(opcion);
                if (Central.identificarMedico(opcionInt)) {
                    Medico medico = Central.getMedico(opcionInt);
                    menuMedico(medico);
                } else if (Central.identificarPaciente(opcionInt)) {
                    Paciente paciente = Central.getPaciente(opcionInt);
                    menuPaciente(paciente);
                }
                
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Opción invalida");
            }
            System.out.println("=====================================================");
        } while (!opcion.equals("exit"));
        
    }//Main   

    public static void pedirCita(Paciente paciente) {
        int numeroColegiado;
        System.out.println("********************************");
        System.out.println("  CITA PREVIA SMS ARCAS");
        System.out.println("*********************************");
        System.out.println("Selecciona un medico:");
        int num = Integer.parseInt(teclado.nextLine());
        Medico medico = Central.getMedico(num);
        System.out.println("");
        
        System.out.println("Dia[L,M,X,J,V]> ");
        String dia = teclado.nextLine();
        int posDia = 0;
        switch (dia) {
            case "L" ->
                posDia = 0;
            case "M" ->
                posDia = 1;
            case "X" ->
                posDia = 2;
            case "J" ->
                posDia = 3;
            case "V" ->
                posDia = 4;
        }
        System.out.println("Hora[10,11,12]> ");
        int hora = Integer.parseInt(teclado.nextLine());
        int posHora = 0;
        switch (hora) {
            case 10 ->
                posHora = 0;
            case 11 ->
                posHora = 1;
            case 12 ->
                posHora = 2;
        }
        Central.añadirCita(medico, posDia, posHora, paciente);
        System.out.println(Central.getPacienteCita(medico, posDia, posHora));
        
    }
    
    private static void menuMedico(Medico medico) {
        Central.imprimirCalendario(medico);
        System.out.println("Dia[L,M,X,J,V]> ");
        String dia = teclado.nextLine();
        int posDia = 0;
        switch (dia.toUpperCase()) {
            case "L" ->
                posDia = 0;
            case "M" ->
                posDia = 1;
            case "X" ->
                posDia = 2;
            case "J" ->
                posDia = 3;
            case "V" ->
                posDia = 4;
        }
        System.out.println("Hora[10,11,12]> ");
        int hora = Integer.parseInt(teclado.nextLine());
        int posHora = 0;
        switch (hora) {
            case 10 ->
                posHora = 0;
            case 11 ->
                posHora = 1;
            case 12 ->
                posHora = 2;
        }
        Paciente paciente = Central.getPacienteCita(medico, posDia, posHora);
        generarReceta(medico, paciente);
    }
    
    private static void menuPaciente(Paciente paciente) {
        int opcion;
        do {
            System.out.println("***************************************************");
            System.out.println("Bienvenido/a Sr./Sra. " + paciente.getNombre());
            System.out.println("***************************************************");
            System.out.println("1. Cita previa");
            System.out.println("2. Farmacia");
            System.out.println("3. Volver");
            System.out.println("Opción>");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    pedirCita(paciente);
                    break;
                case 2:
                    irFarmacia(paciente);
                    break;
                case 3:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("Opción no encontrada");
            }
        } while (opcion != 3);
        
    }
    
    private static void generarReceta(Medico medico, Paciente paciente) {
        String fechaStr;
        Medicamento medicamento = Medicamento.ANTIBIOTICO;
        int opcion;
        double cantidadDiaria;
        int duracion;
        System.out.printf("Receta:\n");
        System.out.println("  Fecha: ");
        fechaStr = teclado.nextLine();
        LocalDate fecha = LocalDate.parse(fechaStr);
        System.out.println("Selecciones medicamneto:");
        if (medico.getEspecialidad() == Especialidad.GENERAL) {
            System.out.println("1. " + Medicamento.PARACETAMOL);
            System.out.println("2. " + Medicamento.IBUPROFENO);
            System.out.println("3. " + Medicamento.ANTIBIOTICO);
            System.out.println("Medicamento> ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    medicamento = Medicamento.PARACETAMOL;
                    break;
                case 2:
                    medicamento = Medicamento.IBUPROFENO;
                    break;
                case 3:
                    medicamento = Medicamento.ANTIBIOTICO;
                    break;
                default:
                    System.out.println("Opcion introducida fuera del rango");
                    ;
            }
            System.out.println("Cantidad diaria (mg): ");
            cantidadDiaria = Double.parseDouble(teclado.nextLine());
            System.out.println("Duracion (dias): ");
            duracion = Integer.parseInt(teclado.nextLine());
            
            Central.altaReceta(medico, paciente, fecha, medicamento, duracion, cantidadDiaria);
//            Receta nuevaReceta = new Receta(medico, paciente, medicamento, LocalDate.parse(fecha), duracion, cantidadDiaria);
        } else if (medico.getEspecialidad() == Especialidad.ALERGIA) {
            System.out.println("1. " + Medicamento.PARACETAMOL);
            System.out.println("2. " + Medicamento.IBUPROFENO);
            System.out.println("3. " + Medicamento.ANTIESTAMINICO);
            System.out.println("Medicamento> ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    medicamento = Medicamento.PARACETAMOL;
                    break;
                case 2:
                    medicamento = Medicamento.IBUPROFENO;
                    break;
                case 3:
                    medicamento = Medicamento.ANTIESTAMINICO;
                    break;
                default:
                    System.out.println("Opcion introducida fuera del rango");
                    ;
            }
            System.out.println("Cantidad diaria (mg): ");
            cantidadDiaria = Double.parseDouble(teclado.nextLine());
            System.out.println("Duracion (dias): ");
            duracion = Integer.parseInt(teclado.nextLine());

//            Receta nuevaReceta = new Receta(medico, paciente, medicamento, LocalDate.parse(fecha), duracion, cantidadDiaria);
            Central.altaReceta(medico, paciente, fecha, medicamento, duracion, cantidadDiaria);
            
        }
        
    }
    
    public static void irFarmacia(Paciente paciente) {
        Central.mostrarRecetas(paciente);
    }
    
} //SMS
