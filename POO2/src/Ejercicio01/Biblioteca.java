/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

import java.util.ArrayList;

/**
 *
 * @author desn2
 */
public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Autor> listaAutores;

    //CONSTRUCTOR
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listaLibros = new ArrayList<>();
        listaAutores = new ArrayList<>();
    }

    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    //METODOS PROPIOS
    public void addLibro(String titulo, int año, int codAutor) {
        //AÑADIENDO LIBRO...
        Libro nuevoLibro;
        Autor autor = buscarAutor(codAutor);
        if (autor != null) {
            nuevoLibro = new Libro(titulo, autor, año);
            listaLibros.add(nuevoLibro);
        } else {
            System.out.println("ERROR. El autor no existe.");
        }
    }

    public void addAutor(String nombre1, String nombre2, String apell1, String apell2, String email) {

        Autor nuevoAutor;

        if (nombre2.equals("")) {
            nombre2 = null;
        }
        if (apell2.equals("")) {
            apell2 = null;
        }

        nuevoAutor = new Autor(nombre1, apell1, apell2, email);
        listaAutores.add(nuevoAutor);

    }

    private Autor buscarAutor(int codigo) {
        Autor autor;

        for (int i = 0; i < listaAutores.size(); i++) {
            autor = listaAutores.get(i);
            if (autor.getId() == codigo) {
                return autor;
            }
        }
        return null;
    }
}
