/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applaberinto;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author diego.sanchez
 */
public class Personaje {
    
    private int x;
    private int y;
    private int ancho = 40;
    private int alto = 40;
    private int movimiento = 40;

    public Personaje(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x, y, alto, ancho);
        g.setColor(Color.black);
        g.drawOval(x, y, alto, ancho);
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    public void moverRight(){
        x = x + movimiento;
    }
    public void moverLeft(){
        x = x - movimiento;
    }
    public void moverUp(){
        y = y - movimiento;
    }
    public void moverDown(){
        y = y + movimiento;
    }
}
