/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Agenda;

import java.time.LocalDate;

/**
 *
 * @author desn2
 */
public class mainPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BD.cargarDriver();
        BD.conectar();
        Contacto nuevoContacto = new Contacto(1, "Diego", "Sánchez", LocalDate.parse("2001-10-04"));
//        System.out.println(nuevoContacto);
        Contacto nuevoContacto2 = new Contacto(2, "Juan", "Perez", LocalDate.parse("1999-12-21"));
//        System.out.println(nuevoContacto2);
        Contacto nuevoContacto3 = new Contacto(12, "Alicia", "Lopez", LocalDate.parse("1990-04-22"));
//        System.out.println(nuevoContacto3);
//        BD.insertar(nuevoContacto);
//        BD.insertar(nuevoContacto2);
//        BD.insertar(nuevoContacto3);
        System.out.println(BD.calcularEdad(nuevoContacto2));
//        BD.eliminar(1);

        for (Contacto contacto : BD.listaCompleta()) {
            System.out.println(contacto);
        }
        BD.desconectar();
    }

}
