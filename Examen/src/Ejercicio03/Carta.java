/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03;

import java.util.HashMap;

/**
 *
 * @author desn2
 */
public class Carta {

    private String nombre;
    private int vida;
    private String ataque1;
    private String ataque2;
    private String ataque3;
    private String ataque4;

    private HashMap<String, Double> mapaAtaque = new HashMap<>();

    public Carta(String nombre, int vida, String ataque1, String ataque2, String ataque3, String ataque4) {
        cargarDatos();
        this.nombre = nombre;
        this.vida = vida;
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
        this.ataque3 = ataque3;
        this.ataque4 = ataque4;
    }

    public void cargarDatos() {
        mapaAtaque.put("doble puño", 20.0);
        mapaAtaque.put("corte", 30.0);
        mapaAtaque.put("placaje", 40.0);
        mapaAtaque.put("salpicadura", 0.0);
    }

    public void mostrarCarta() {
        System.out.println("=========================================");
        System.out.println(nombre);
        System.out.printf("1.%-14s --> %-5.0f pot\n", ataque1,mapaAtaque.get(ataque1));
        System.out.printf("2.%-14s --> %-5.0f pot\n", ataque2,mapaAtaque.get(ataque2));
        System.out.printf("3.%-14s --> %-5.0f pot\n", ataque3,mapaAtaque.get(ataque3));
        System.out.printf("4.%-14s --> %-5.0f pot\n", ataque4,mapaAtaque.get(ataque4));
        System.out.println("=========================================");

    }

}
