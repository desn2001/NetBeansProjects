/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AlmacenHashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import javax.swing.text.html.parser.Entity;

/**
 *
 * @author diego.sanchez
 */
public class almacen {

    static HashMap<Integer, Producto> almacen = new HashMap<>();
    static int codigoProducto = 1000;

    public static void main(String[] args) {
        añadirProducto(new Producto("iphone11", 900, 50));
        añadirProducto(new Producto("ps3", 400, 100));
        listarAlmacen();
        System.out.println("");

        modificarPrecio(1001, 899.99);
        listarAlmacen();
        System.out.println("");
        
        añadirUnidades(1001, 50);
        listarAlmacen();
    }

    private static void añadirProducto(Producto producto) {
        almacen.put(++codigoProducto, producto);

    }

    private static void modificarPrecio(int codigo, double precio) {
        Producto producto = almacen.get(codigo);
        producto.setPrecio(precio);
    }

    private static void listarAlmacen() {
        for (Entry<Integer, Producto> prod : almacen.entrySet()) { //Esta linea nos la da el 
            int codigo = prod.getKey();
            Producto producto = prod.getValue();
            System.out.printf("[%d] %s %.2f€ %d\n", codigo, producto.getDescripcion(), producto.getPrecio(),producto.getUnidades());
        }
    }

    public static void añadirUnidades(int codigo, int unidades) {
        Producto producto = almacen.get(codigo);
        producto.añadir(unidades);
        
    }

}
