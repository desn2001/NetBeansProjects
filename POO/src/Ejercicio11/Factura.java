/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author desn2
 */
public class Factura {

    private String cif;
    private LocalDate fechaActual;
    private ArrayList<LineaFactura> lineas;
    private int iva;

    //CONSTRUCTOR
    public Factura(String cif, LocalDate fechaActual, int iva) {
        this.cif = cif;
        this.fechaActual = fechaActual;
        this.iva = iva;
        this.lineas = new ArrayList<>();
    }

    //METODOS GETTER Y SETTER
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
        this.fechaActual = fechaActual;
    }

    public ArrayList<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaFactura> lineas) {
        this.lineas = lineas;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    //METODOS PROPIOS
    public void añadirLinea(String referencia, String descripcion, int cantidad, double precioUnitario) {
        lineas.add(new LineaFactura(referencia, descripcion, cantidad, precioUnitario));
    }

    private double getSubtotal() {
        double subtotal = 0;
        for (LineaFactura linea : lineas) {
            subtotal = subtotal + linea.getImporteLinea();
        }
        return subtotal;
    }

    private double getImporteIva() {
        return iva * getSubtotal() / 100;
    }

    private double getTotal() {
        return getSubtotal() + getImporteIva();
    }
    

    public void imprimirFactura() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("===============================================================");
        System.out.println("                                FACTURA");
        System.out.printf("CIF:   %s\n", cif);
        System.out.println("Fecha: " + fechaActual.format(dtf));
        System.out.println("");
        System.out.println("CANT    DESCRIPCIÓN    PRECIO U    IMPORTE    ");
        System.out.println("----------------------------------------------");
        for (LineaFactura linea : lineas) {
            linea.imprimirLinea();
        }
        System.out.println("");
        System.out.printf("                            Subtotal: %.2f €\n", getSubtotal());
        System.out.printf("                            IVA 21:   %.2f €\n", getImporteIva());
        System.out.printf("                            TOTAL:    %.2f €\n", getTotal());

        System.out.println("===============================================================");

    }

}
