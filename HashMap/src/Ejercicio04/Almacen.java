/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04;

import java.util.HashMap;

/**
 *
 * @author desn2
 */
public class Almacen {

    private int ultimoCodigo;
    private HashMap<Integer, Producto> mapaProductos;

    public Almacen() {
        mapaProductos = new HashMap();
        ultimoCodigo = 1001;
    }

    public void añadirProductos(Producto p) {
        mapaProductos.put(ultimoCodigo, p);
        ultimoCodigo++;
    }

    public void modificarPrecio(int codigo, double precio) {
        Producto p = mapaProductos.get(codigo);
        p.setPrecio(precio);
    }

    public void añadirUnidades(Integer codigo, int unidades) {
        Producto p = mapaProductos.get(codigo);
        p.añadirUnidades(unidades);

    }
}
