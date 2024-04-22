/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package applaberinto;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author diego.sanchez
 */
public class AppLaberinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame miVentana = new JFrame("Mi laberinto");
        Juego juego = new Juego();

        miVentana.setSize(940, 560);
        miVentana.setLocation(100, 200);
        miVentana.setVisible(true);
        miVentana.add(juego);

        miVentana.repaint();
        juego.repaint();

        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(AppLaberinto.class.getName()).log(Level.SEVERE, null, ex);
            }
            miVentana.repaint();
        }
    }

}
