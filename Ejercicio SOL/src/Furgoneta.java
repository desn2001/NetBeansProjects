
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class Furgoneta extends Vehiculo {

    private static Scanner teclado = new Scanner(System.in);
    private int kilometrosInicio;
    private int kilometrosFin;
    private double precioKilometro = 0.5;

    public Furgoneta(String matricula, String marca_modelo) {
        super(matricula, marca_modelo);
        this.tipo = TipoVehiculo.FURGONETA;
    }

    @Override
    public void alquilar() {
        System.out.print("Introduce los Kilometros que tenia en un Inicio: ");
        this.kilometrosInicio = Integer.parseInt(teclado.nextLine());
        this.setAlquilado(true);
    }

    @Override
    public void devolver() {
        System.out.print("Introduce los Kilometros al final: ");
        this.kilometrosFin = Integer.parseInt(teclado.nextLine());
        this.setAlquilado(false);

        System.out.println("**********************************************");
        System.out.printf("%10s %5s",this.getMatricula(),this.getMarca_modelo());
        System.out.println("Km realizados: "+(this.kilometrosFin+this.kilometrosInicio)+" km");
        System.out.println("Precio: "+this.precioKilometro);
        double importe = this.kilometrosInicio + this.kilometrosFin;
        System.out.printf("IMPORTE ALQUILER: %.1f");
        System.out.println("**********************************************");

    }

}
