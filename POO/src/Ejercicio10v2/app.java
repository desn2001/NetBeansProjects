/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio10v2;

/**
 *
 * @author desn2
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche cocheVolvo = new Coche("VOLVO", "XC60", 140, TipoCombustible.DIESEL, TipoCambio.AUTOMATICO, 19);
        Coche cochePorsche = new Coche("PORSCHE", "911", 250, TipoCombustible.GASOLINA, TipoCambio.MANUAL, 22);
        
        //MOSTRAMOS LAS FICHAS SIMPLIFICADAS DE AMBOS COCHES
        cocheVolvo.getFichaSimplificada();
        System.out.println("");
        cochePorsche.getFichaSimplificada();
        
        //VOLVO RECORRE 10000KM Y CAMBIA LA RUEDA TRASERA DERECHA Y PORSCHE RECORRE 500KM
        cocheVolvo.recorrer(10000);
        cocheVolvo.cambiarRueda(3);
        cochePorsche.recorrer(500);
        
        //MOSTRAMOS LA FICHA DE AMBOS COCHES
        cocheVolvo.imprimirFicha();
        System.out.println("");
        cochePorsche.imprimirFicha();
        
        
    }
    
}
