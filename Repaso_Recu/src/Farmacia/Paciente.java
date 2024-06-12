/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Farmacia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author desn2
 */
public class Paciente extends Persona {

    private int nuss;

    public Paciente(String nombre, String apellido, LocalDate fechaNacimiento) {
        super(nombre, apellido, fechaNacimiento);
        nuss = generarNUSS(getDni());
    }

    @Override
    public String generaEmail() {
        String email;
        String nombreSinAcentos = Util.limpiarAcentos(getNombre());
        String apellidosSinAcentos = Util.limpiarAcentos(getApellido());
        email = String.format("%s%s@arcas.es", nombreSinAcentos, apellidosSinAcentos);
        return email;
    }

    public int generarNUSS(String dni) {
        dni = getDni();
        String dniSinLetra;
//        dniSinLetra = String.format("30%s%s%s%s%s", dni.charAt(0), dni.charAt(1), dni.charAt(2), dni.charAt(3), dni.charAt(4));
        dniSinLetra= dni.substring(0,dni.length()-1);
        String resultado = String.format("30%s", dniSinLetra);

        int dniSinLetraInt;
        dniSinLetraInt = Integer.parseInt(resultado);
        return dniSinLetraInt;
    }

    @Override
    public String toString() {
        String cadena = String.format("[NUSS %d] %s %s [%s]", generarNUSS(generaDNI()), getNombre(), getApellido(), getDni());
        return cadena;
    }

    public int getNuss() {
        return nuss;
    }

    public void setNuss(int nuss) {
        this.nuss = nuss;
    }

    public void mostrarFicha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaConFormato = getFechaNacimiento().format(dtf);
        int edad;
        LocalDate fecha;
        fecha = getFechaNacimiento();
        edad = (int) ChronoUnit.YEARS.between(fecha, LocalDate.now());

        System.out.println("========================================");
        System.out.printf("|Nombre:%s               NUSS:%d|\n", getNombre(), getNuss());
        System.out.printf("|Apellidos:%s            DNI: %s|\n", getApellido(), getDni());
        System.out.printf("|F. nac: %s             Edad: %d|\n", fechaConFormato, edad);
        System.out.printf("|correo-e: %s                    |\n", generaEmail());
        System.out.println("========================================");
    }

}
