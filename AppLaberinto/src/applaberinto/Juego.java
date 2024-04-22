/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applaberinto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 *
 * @author diego.sanchez
 */
public class Juego extends JPanel implements KeyListener {

    Laberinto laberinto = new Laberinto();
    Personaje personaje = new Personaje(40, 40);

    public Juego() {
        addKeyListener(this);
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        laberinto.paint(g);
        personaje.paint(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int[][] tablero = laberinto.obtenerLaberinto();
        int x = personaje.getX() / 40;
        int y = personaje.getY() / 40;
        System.out.println("x = " + x + " y = " + y);
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && tablero[y][x + 1] == 0) {
            personaje.moverRight();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT && tablero[y][x - 1] == 0) {
            personaje.moverLeft();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP && tablero[y-1][x] == 0) {
            personaje.moverUp();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN && tablero[y+1][x] == 0) {
            personaje.moverDown();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
