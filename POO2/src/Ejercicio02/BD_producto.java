/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author desn2
 */
public class BD_producto {

    private ArrayList<Producto> bd;

    public BD_producto() {
        bd = new ArrayList<>();
    }

    public void add(String descripcion, double precio) {
        if (bd.size() < 1000) {
            bd.add(new Producto(generaREF(), descripcion, precio));
        } else {
            System.out.println("No se pueden añadir más productos a la base de datos");
        }
    }

    public Producto getProducto(int indice) {
        if (indice < 0 || indice >= bd.size()) {
            return null;
        } else {
            return bd.get(indice);
        }
    }

    public Producto buscar(String ref) {
        for (Producto producto : bd) {
            if (producto.getRef().equals(ref)) {
                return producto;
            }
        }
        return null;
    }

    public void listarProductos() {
        System.out.println("  REF    Descripción     Precio");
        System.out.println("  -------------------------------");
        for (Producto producto : bd) {
            producto.mostrarProducto();
        }
        System.out.println("  -------------------------------");
    }

    private String generaREF() {
        int num = bd.size() + 1;
        String ref = "REF";
        if (num < 10) {
            ref += "00" + num;
        } else if (num < 100) {
            ref += "0" + num;
        } else if (num < 1000) {
            ref += num;
        } else {
            System.out.println("No se pueden añadir más productos a la base de datos");
        }
        return ref;
    }

}
