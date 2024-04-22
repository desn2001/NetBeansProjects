/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author desn2
 */
public class Libro {

    private String codigo;
    private String titulo;
    private Autor autor;
    private Boolean prestado;
    private int año;

    //CONSTRUCTOR
    public Libro(String titulo, Autor autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    //GETTER Y SETTER
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    //METODOS PROPIOS
    public void imprimir() {
        System.out.printf("%s - %s - %d", this.titulo, this.autor, this.año);
    }

}
