/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

import java.util.Random;

/**
 *
 * @author desn2
 */
public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, String dni, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo.toUpperCase();
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo.toUpperCase();
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularImc() {
        double imc;
        imc = peso / ((altura * altura));
        if (imc < 20) {
            imc = -1;
        } else if (imc >= 20 && imc <= 25) {
            imc = 0;
        } else if (imc > 25) {
            imc = 1;
        }
        return imc;
    }

    public String comprobarSexo(String sexo) {
        String resultado;
        if (this.sexo.equals("H") || this.sexo.equals("M")) {
            return this.sexo;
        } else {
            return " ";
        }
    }

    public static int generarDni() {
        // Creamos un número aleatorio de 8 cifras del 1 al 9
        int dni = 0;
        for (int i = 0; i < 8; i++) {
            dni = dni * 10 + (int) (Math.random() * 9) + 1;
        }
        return dni;
    }

    public static String generarLetra() {
        // Array de letras del alfabeto
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        Random random = new Random();

        int indice = random.nextInt(letras.length);

        return letras[indice];
    }

    @Override
    public String toString() {
        return String.format("  %-10s   %-4d   %-10s   %-5s   %-7.2f   %-6.2f  ", nombre, edad, generarDni() + generarLetra(), comprobarSexo(sexo), peso, altura);
    }

}
