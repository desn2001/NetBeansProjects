/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LigaBasket;

import java.util.ArrayList;

/**
 *
 * @author desn2
 */
public class Equipo {

    private int id;
    private String nombre;
    private int puntos;
    private ArrayList<Jugador> plantilla;

    public Equipo(int id, String nombre, int puntos) {
        this.id = id;
        this.nombre = nombre;
        this.puntos = puntos;
        this.plantilla = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    public void imprimirPlantilla() {
        System.out.println("");
        System.out.println("Plantilla del " + this.nombre);
        System.out.println("================================");
        for (Jugador jugador : plantilla) {
            System.out.println(jugador);
        }
    }

    @Override
    public String toString() {
        return String.format("[%3d] %-10s %2d puntos", id, nombre, puntos);
    }

    @Override
    public int compareTo(Equipo o) {
        if (this.puntos < o.puntos) {
            return -1;
        } else if (this.puntos > o.puntos) {
            return 1;
        } else {
            return 0;
        }

    }
}
