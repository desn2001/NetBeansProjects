/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author desn2
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String carta1[][] = {{"corte", "protección", "doble golpe", "paliza"},
        {"40", "0", "20", "10"},
        {"30", "10", "20", "20"},
        {"normal", "normal", "lucha", "siniestro"}};
        
        
        String carta2[][] = {{"corte", "protección", "doble golpe", "paliza"},
        {"40", "0", "20", "10"},
        {"30", "10", "20", "20"},
        {"normal", "normal", "lucha", "siniestro"}};
        
        String equipo1[] = {"Zizagoon","bidoof"};

        for (int i = 0; i < carta1.length; i++) {
            System.out.println((i+1)+"-"+carta1[0][i]);
            for (int j = 0; j < carta1[i].length; j++) {
            }
        }
        
    }

}
