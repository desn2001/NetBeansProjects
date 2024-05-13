/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio01;

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
        Empleado nuevo_empleado = new Empleado("11111A", "Pedro Acosta");
        Contable nuevo_contable = new Contable("22222B", "Miguel Gutierrez");
        Director nuevo_director = new Director("33333C", "Diego Sánchez", 4);

        //Añadimos 5 horas extras a cada uno
        nuevo_empleado.añadirHorasExtras(5);
        nuevo_contable.añadirHorasExtras(5);
        nuevo_director.añadirHorasExtras(5);

        //Imprimimos los tres
        System.out.println(nuevo_empleado.toString() + " " + nuevo_empleado.CalcularSueldo() + "€");
        System.out.println("");
        System.out.println(nuevo_contable.toString() + " " + nuevo_contable.CalcularSueldo() + "€");
        nuevo_contable.contabilizar();
        System.out.println("");
        System.out.println(nuevo_director.toString() + " " + nuevo_director.CalcularSueldo() + "€");
        nuevo_director.analizarDatos();
    }

}
