/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11v2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author desn2
 */
public class Factura {

    private String cif;
    private LocalDate fechaFactura;
    private ArrayList<LineaFactura> lineas;
    private double IVA;

    //CONSTRUCTOR
    public Factura(String cif, LocalDate fechaFactura) {
        this.cif = cif;
        this.fechaFactura = fechaFactura;
        this.lineas = new ArrayList<>();
        this.IVA = 21;
    }

    //GETTER Y SETTER
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    //METODOS PROPIOS
    public void añadirLinea(String ref, String descripcion, int cantidad, double precioUnitario) {
        this.lineas.add(new LineaFactura(descripcion, descripcion, cantidad, precioUnitario));
    }

    private double getSubtotal() {
        double subtotal = 0;
        for (LineaFactura linea : lineas) {
            subtotal = linea.getImporteLinea() + subtotal;
        }
        return subtotal;
    }

    private double getIva() {
        return this.getSubtotal() * (this.IVA / 100);
    }

    private double getTotal() {
        return this.getSubtotal() + this.getIva();
    }

    public void imprimirFactura() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("===================================================");
        System.out.println("                 FACTURA");
        System.out.println("CIF:   " + this.cif);
        System.out.println("Fecha: " + this.fechaFactura.format(dtf));
        System.out.println("");
        System.out.println("CANT    DESCRIPCION   PRECIO U    IMPORTE");
        System.out.println("---------------------------------------------");
        for (LineaFactura linea : lineas) {
            linea.imprimirLinea();
        }
        System.out.println("");
        System.out.printf("                          Subtotal: %.2f €\n", this.getSubtotal());
        System.out.printf("                          IVA %.0f:   %.2f €\n", this.IVA, this.getIva());
        System.out.printf("                          TOTAL:    %.2f €\n", this.getTotal());
        System.out.println("===================================================");
    }

}
