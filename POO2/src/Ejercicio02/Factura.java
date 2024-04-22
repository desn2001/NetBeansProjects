/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author desn2
 */
public class Factura {

    private String cif;
    private String numero;
    private LocalDate fechaFactura;
    private ArrayList<LineaFactura> lineas;
    private static int IVA = 21;

    public Factura(String cif, String numero, LocalDate fechaFactura) {
        this.cif = cif;
        this.numero = numero;
        this.fechaFactura = fechaFactura;
        lineas = new ArrayList<>();
    }

    public void añadirLinea(Producto producto, int cantidad) {
        lineas.add(new LineaFactura(producto, cantidad));
    }

    public void imprimirFactura() {
        System.out.println("*".repeat(55));
        System.out.println("CIF: " + cif);
        System.out.print("Fecha: " + fechaFactura.toString());
        System.out.println(" ".repeat(15) + "FACTURA NUM: " + numero);
        System.out.println("");
        System.out.println("REF     DESCRIPCION     CANT    PRECIOU    IMPORTE");
        System.out.println("-".repeat(55));
        for (LineaFactura linea : lineas) {
            linea.imprimirLinea();
        }
        System.out.println("\n");
        System.out.printf(" %40s:  %6.2f%n", "SUBTOTAL", getSubtotal());
        System.out.printf(" %40s:  %6.2f%n", "IVA", getImporteIVA());
        System.out.printf(" %40s:  %6.2f%n", "TOTAL", getTotal());
    }

    private double getSubtotal() {
        double suma = 0.0;
        for (LineaFactura linea : lineas) {
            suma += linea.getImporteLinea();
        }
        return suma;
    }

    private double getImporteIVA() {
        return getSubtotal() * IVA / 100;
    }

    private double getTotal() {
        return getSubtotal() + getImporteIVA();
    }
}
