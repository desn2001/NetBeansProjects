/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author desn2
 */
public class Autor {
    private int id;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String email;

    //CONSTRUCTOR
    public Autor(String nombre1, String apellido1, String apellido2, String email) {
        this.nombre1 = nombre1;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.id = (int)(Math.random()*1000); //Generamos un codigo aleatorio entre 0 y 999
    }
    
    //GETTER Y SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    //METODOS PROPIOS
     public String getNombreCita(){
        
       StringBuilder sb=new StringBuilder();
       sb.append(apellido1);
       sb.append(", ");
       sb.append(nombre1.charAt(0));
       sb.append(".");
       if (nombre2!=null){
            sb.append(nombre2.charAt(0));
            sb.append(". ");
       }
       return sb.toString();
        
    }
    
}
