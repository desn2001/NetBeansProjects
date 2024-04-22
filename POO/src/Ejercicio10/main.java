/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Hacer esto con un menu teniendo en cuenta el try y el catch en la zona de elige opcion.
        Scanner teclado = new Scanner(System.in);
        Coche volvo = new Coche("VOLVO", "XC60", 140, TipoCombustible.DIESEL, TipoCambio.AUTOMATICO, 19);
        Coche porche = new Coche("PORSCHE", "911", 250, TipoCombustible.GASOLINA, TipoCambio.MANUAL, 22);

        int opcion = 0;
        System.out.println("======================================================================");
        System.out.println("                                MENU DE COCHES                        ");
        System.out.println("======================================================================");
        System.out.println("1. Añadir coche");
        System.out.println("2. Cambiar rueda");
        System.out.println("3. Recorrer");
        System.out.println("4. Imprimir ficha");
        System.out.println("5. Imprimir ficha simplificada");
        System.out.println("6. Salir");
        try {
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("ERROR. "+e.getMessage());
                
        }

        switch (opcion) {
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.out.println("SALIENDO...");
                break;
            default:
                System.out.println("ERROR. Opción introducida no es valida.");
        }
    }

}
