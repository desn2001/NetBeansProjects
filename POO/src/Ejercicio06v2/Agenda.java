/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio06v2;

import java.util.ArrayList;

/**
 *
 * @author desn2
 */
public class Agenda {
    private  ArrayList<Contacto> agenda;
    private int contadorID;
    
    //CONSTRUCTOR
    public Agenda() {
        this.agenda = new ArrayList<>();
        this.contadorID = 1;
    }
    
    //GETTER Y SETTER
    public ArrayList<Contacto> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Contacto> agenda) {
        this.agenda = agenda;
    }

    public int getContadorID() {
        return contadorID;
    }

    public void setContadorID(int contadorID) {
        this.contadorID = contadorID;
    }
    
    //METODOS PROPIOS
    public void addContacto(String nombre,String email,String telefono){
        agenda.add(new Contacto(this.contadorID, nombre, email, telefono));
        contadorID++;
    }
    
    public void listarAgenda(){
        System.out.println("ID     NOMBRE        EMAIL            TELEFONO");
        for (Contacto contacto : agenda) {
            System.out.println(contacto.aCadena());
        }
    }
    
    public ArrayList<Contacto> buscarContactos(String expresion){
        ArrayList<Contacto> lista = new ArrayList<>();
        expresion = expresion.toLowerCase();
        for (Contacto contacto : agenda) {
            if (contacto.getNombre().toLowerCase().startsWith(expresion)) {
                lista.add(contacto);
            }
        }
        return lista;
    }
    
    
    
    
    
}
