/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author desn2
 */
public class Almacen {

    private int ultimoCodigo;
    private HashMap<Integer, Producto> mapaProductos;

    public Almacen() {
        mapaProductos = new HashMap<>();
        ultimoCodigo = 1001;
    }

    public void listarAlmacen() {
        System.out.println("LISTA DEL ALMACEN");
        System.out.println("*****************************************");
        System.out.println("---------------------------------------------------");
        for (Map.Entry<Integer, Producto> prod : mapaProductos.entrySet()) { //Esta linea nos la da el 
            int codigo = prod.getKey();
            Producto producto = prod.getValue();
            System.out.println("Codigo:" + codigo);
            System.out.println(producto.toString());
            System.out.println("---------------------------------------------------");
        }

    }

    public void listarModificar() {
        System.out.println("------------------ PRODUCTOS ---------------------------");
        for (Map.Entry<Integer, Producto> prod : mapaProductos.entrySet()) { //Esta linea nos la da el
            int codigo = prod.getKey();
            String nombreProducto = prod.getValue().getDescripcion();
            double precioProducto = prod.getValue().getPrecio();
            System.out.printf("%d %s ---> %.2f€\n", codigo, nombreProducto,precioProducto);
        }
        System.out.println("--------------------------------------------------------");
    }
    
    public void listarVender() {
        System.out.println("------------------ PRODUCTOS ---------------------------");
        for (Map.Entry<Integer, Producto> prod : mapaProductos.entrySet()) { //Esta linea nos la da el
            int codigo = prod.getKey();
            int unidades = prod.getValue().getUnidades();
            String nombreProducto = prod.getValue().getDescripcion();
            System.out.printf("%d %s %d\n", codigo, nombreProducto,unidades);
        }
        System.out.println("--------------------------------------------------------");
    }

    public void añadirProducto(Producto p) {
        mapaProductos.put(ultimoCodigo, p);
        ultimoCodigo++;
    }

    public void modificarPrecio(int codigo, double precio) {
        Producto p = mapaProductos.get(codigo);
        p.setPrecio(precio);
    }

    public void añadirUnidades(int codigo, int unidades) {
        Producto p = mapaProductos.get(codigo);
        p.añadirUnidades(unidades);
    }

    public void venderProducto(int codigo, int unidades) {
        Producto p = mapaProductos.get(codigo);
        if (p.getUnidades() > unidades) {
            p.restarUnidades(unidades);
            System.out.printf("Vendidas %d unidades de %s\n", unidades, p.getDescripcion());
            if (p.getUnidades() < 10) {
                System.out.println("  WARNING!! menos de 10 unidades");
            }
        } else {
            System.out.println("ERROR Unidades Insuficientes de " + p.getDescripcion());
        }

    }

}
