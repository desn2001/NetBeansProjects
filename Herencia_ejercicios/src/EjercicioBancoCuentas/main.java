/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioBancoCuentas;

/**
 *
 * @author diego.sanchez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona juan = new Persona("juan", "arcas");
        Persona alicia = new Persona("alicia", "meca");

        System.out.println("Nombre: " + juan.getNombre());
        System.out.println("Apellido: " + juan.getApellido());
        System.out.println("Dni: " + juan.getDni());
        System.out.println("Email: " + juan.getEmail());

        System.out.println("");

        System.out.println("Nombre: " + alicia.getNombre());
        System.out.println("Apellido: " + alicia.getApellido());
        System.out.println("Dni: " + alicia.getDni());
        System.out.println("Email: " + alicia.getEmail());

        System.out.println("");

        CuentaCorriente ccjuan = new CuentaCorriente(juan, 500);
        ccjuan.imprimirDatos();
//        ccjuan.reintegro(500);
//        ccjuan.imprimirDatos();
//        ccjuan.reintegro(1_000);
//        ccjuan.imprimirDatos();
//        ccjuan.reintegro(1);
//        ccjuan.imprimirDatos();

        CuentaCorriente ccalicia = new CuentaCorriente(0, alicia, 200);
        
        ccjuan.transferencia(ccalicia, 100);
        ccjuan.imprimirDatos();
        ccalicia.imprimirDatos();
        System.out.println("");
        ccjuan.transferencia(ccjuan, 200);
        ccjuan.imprimirDatos();
        
        CuentaAhorro cajuan = new CuentaAhorro(juan, 1000);
        cajuan.calcularInteres();

    }

}
