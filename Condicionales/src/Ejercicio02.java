
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String usuario = null;
        String contraseña = null;

        System.out.print("Introduce su usuario: ");
        usuario = teclado.nextLine();
        System.out.println("");
        System.out.print("Introduce la contraseña: ");
        contraseña = teclado.nextLine();
        //Primera forma usando condición doble
//        if (usuario.equals("root")) {
//            System.out.println("El usuario es correcto");
//        }
//        else{
//            System.out.println("El usuario es incorrecto");
//        }
//        if (contraseña.equals("toor")) {
//            System.out.println("La contraseña es correcto");
//        }
//        else{
//            System.out.println("La contraseña es incorrecta");
//        }
        //Segunda forma if..else anidado
//        if (usuario.equals("root")) {
//            if (contraseña.equals("toor")) {
//                System.out.println("El usuario y contraseña son correctos");
//            }
//            else{
//                System.out.println("El usuario es correcto pero la contraseña no");
//            }
//        }
        //Tercera forma usando booleanos
        boolean contraseñaCorrecta = false;
        boolean usuarioCorrecto = false;

        if (usuario.equals("root")) {
            usuarioCorrecto = true;

        }
        if (contraseña.equals("toor")) {
            contraseñaCorrecta = true;
        }
        
        if (usuarioCorrecto == true && contraseñaCorrecta == true ) {
            System.out.println("El usuario y contraseña son correctos");
        }else{
            System.out.println("ERROR. Usuario o contraseña son incorrectos");
        }

    }
}
