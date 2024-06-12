/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login_usuarios;

import java.util.ArrayList;

/**
 *
 * @author desn2
 */
public class BD_Usuarios {

    private static ArrayList<Usu_Normal> bd = new ArrayList<>();

    public static void añadirUsuario(Usu_Normal usuario) {
        bd.add(usuario);
    }

    public static ArrayList obtenerBD() {
        return bd;
    }

    public static Usu_Normal obtenerUsuario(String nombre) {
        for (Usu_Normal usuario : bd) {
            if (nombre.equals(usuario.getNombre())) {
                return usuario;
            }
        }
        System.out.println("Usuario no encontrado");
        return null;
    }

    public static int verificarLogin(String nombre, String contraseña) {
        int tipoLogin = 0;
        for (Usu_Normal usuario : bd) {
            if (usuario.getNombre().equals(nombre) && usuario.getPassword().equals(contraseña)) {
                if (usuario.getTipo().equals(TipoUsuario.NORMAL)) {
                    tipoLogin = 1;
                } else {
                    tipoLogin = 2;
                }
            }
        }
        return tipoLogin;
    }

    public static ArrayList<Usu_Normal> getBd() {
        return bd;
    }

    public static void setBd(ArrayList<Usu_Normal> bd) {
        BD_Usuarios.bd = bd;
    }
    
    

}
