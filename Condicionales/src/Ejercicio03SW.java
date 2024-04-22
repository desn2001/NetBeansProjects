
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio03SW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
//        int opcion = 0;
//        System.out.println("-----SEMAFORO-----");
//        System.out.println("1-Verde");
//        System.out.println("2-Ambar");
//        System.out.println("3-Rojo");
//
//        System.out.print("Seleccione una opción ---> ");
//        opcion = Integer.parseInt(teclado.nextLine());
//
//        switch (opcion) {
//            case 1:
//                System.out.println("El semaforo es verde, Puedes pasar");
//                break;
//            case 2:
//                System.out.println("El semaforo esta ambar, Pasa con cuidado o para");
//                break;
//            case 3:
//                System.out.println("El semaforo esta rojo, Debes parar");
//                break;
//            default:
//                System.out.println("ERROR la opción seleccionada no es correcta");
//        }
        String color;
        int edad;
        System.out.print("Escribe un color: ");
        color = teclado.nextLine();
        color = color.toLowerCase();
        switch (color) {
            case "verde":
                System.out.println("Puedes pasar");
                break;
            case "ambar":
                System.out.print("Introduce tu edad: ");
                edad = Integer.parseInt(teclado.nextLine());
                if (edad<20) {
                    System.out.println("Eres menor, para!!");
                }else{
                    System.out.println("Acelera y pasa");
                }
                break;
            case "rojo":
                System.out.println("STOP!!!");
            default:
                System.out.println("ERROR el color introducido no es correcto");
        }
        

    }

}
