
import java.util.HashMap;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String, Integer> nombresSalarios = new HashMap<>();
        nombresSalarios.put("Diego", 30_000);
        nombresSalarios.put("Pepe", 10_000);
        nombresSalarios.put("Ana", 25_000);
        String nombre = "";
        int salario = 0;
        do {
            System.out.print("Introduce el nombre del nuevo empleado: ");
            nombre = teclado.nextLine();
            if (nombre.equals("exit")) {
                System.out.println("SALIENDO...");
                break;
            } else {
                System.out.print("Introduce el salario del nuevo empleado: ");
                salario = Integer.parseInt(teclado.nextLine());
                System.out.println("");
                nombresSalarios.put(nombre, salario);
            }
        } while (!nombre.equals("exit"));
        System.out.println("Imprimimos el hashMap");
        System.out.println(nombresSalarios);

    }

}
