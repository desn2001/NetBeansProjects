
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String correo;
        boolean arroba = false;
        boolean punto = false;
        int posicionA = 0, posicionP = 0;
        System.out.println("-----------VALIDADOR DE CORREOS-----------------------");
        do {
            arroba = false;
            punto = false;

            System.out.print("Introduce un correo para validar[INTRO para salir]: ");
            correo = teclado.nextLine();

            for (int i = 1; i < correo.length(); i++) {
                if (correo.contains("@")) {
                    arroba = true;
                }
                if (correo.contains(".")) {
                    punto = true;
                }
//            System.out.println(correo.charAt(i) +" posición ---> "+ i);
                if (correo.charAt(i) == '@') {
                    posicionA = i + 1;
//                System.out.println("La posición de la @ es ---> " + posicionA);
                }
                if (correo.charAt(i) == '.') {
                    posicionP = i + 1;
//                System.out.println("La posicion del . es ---> " + posicionP);
                }

            }
            System.out.println("-----------------------SOLUCION-----------------------");
//        System.out.println("Tiene arroba --> " + arroba);
//        System.out.println("Tiene punto --> " + punto);
            if (correo.equals("")) {
                System.out.println("SALIENDO...");
                break;
            }
            //COMPROBAMOS 
            if (posicionA < posicionP && arroba == true && punto == true) {
                System.out.printf("Nuestro correo ---> %s ES CORRECTO\n", correo);

            } else {
                System.out.printf("Nuestro correo ---> %s NO ES CORRECTO\n", correo);

            }
            System.out.println("------------------------------------------------------");

        } while (!correo.equals(""));

    }

}
