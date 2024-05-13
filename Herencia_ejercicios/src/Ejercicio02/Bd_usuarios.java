/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Bd_usuarios {

    Scanner teclado = new Scanner(System.in);
    private static ArrayList<Usu_normal> bd = new ArrayList<>();

    public static void añadirUsuario(Usu_normal usuNormal) {
        bd.add(usuNormal);
    }

    public static ArrayList<Usu_normal> obtenerBD() {
        return bd;
    }

    public static Usu_normal obtenerUsuario(String nombre) {
        for (Usu_normal usuario : bd) {
            if (usuario.nombre.equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }
    
    public static boolean verificarLogin(String nombre, String contraseña){
        for (Usu_normal usuario : bd) {
            if (usuario.nombre.equals(nombre)&& usuario.password.equals(contraseña)) {
                return true;
            }
        }
        return false;
    }
    
    
}
