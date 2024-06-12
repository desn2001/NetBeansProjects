/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Farmacia;

/**
 *
 * @author desn2
 */
public class Util {
    public static String limpiarAcentos(String texto) {
    String conAcento = "ÁÉÍÓÚáéíóú";
    String sinAcento = "AEIOUaeiou";
    String salida = texto;
    for (int i=0; i<conAcento.length();i++) {
      salida = salida.replace(conAcento.charAt(i), sinAcento.charAt(i));
    }
    return salida;
  }
}
