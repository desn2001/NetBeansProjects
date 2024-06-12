/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Login_usuarios;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Usu_Normal usuario1 = new Usu_Normal("tontico", "1234", "tontico@kk.com");
        BD_Usuarios.añadirUsuario(usuario1);
        Usu_Normal usuario2 = new Usu_Normal("homer", "1234", "homer@kk.com");
        BD_Usuarios.añadirUsuario(usuario2);
        Usu_Admin usuario3 = new Usu_Admin("root", "root", "root@kk.com");
        BD_Usuarios.añadirUsuario(usuario3);

        login();

    }

    private static void login() {
        String usuario= "", contraseña = "";
        while (BD_Usuarios.verificarLogin(usuario, contraseña) == 0) {
            System.out.println("======================");
            System.out.println("         LOGIN        ");
            System.out.println("======================");
            System.out.print("usuario: ");
            usuario = teclado.nextLine();
            System.out.print("Contraseña: ");
            contraseña = teclado.nextLine();
            System.out.println("");

        }

        if (BD_Usuarios.verificarLogin(usuario, contraseña) == 1) {
            int opcion;
            do {
                System.out.println("Menu Usuario");
                System.out.println("*****************************");
                System.out.println("Usuario: " + BD_Usuarios.obtenerUsuario(usuario).getNombre());
                System.out.println("*****************************");
                System.out.println("1. Listar Usuarios");
                System.out.println("2. Cambiar Contraseña");
                System.out.println("3. Salir del sistema");
                System.out.println("Elige una opcion: ");
                opcion = Integer.parseInt(teclado.nextLine());
                switch (opcion) {
                    case 1:
                        BD_Usuarios.obtenerUsuario(usuario).listarUsuarios();
                        break;
                    case 2:
                        BD_Usuarios.obtenerUsuario(usuario).cambiarPassword();
                        break;
                    case 3:
                        System.out.println("SALIENDO...");
                }

            } while (opcion != 3);

        } else if (BD_Usuarios.verificarLogin(usuario, contraseña) == 2) {
            System.out.println("Menu Administrador");
            System.out.println("*****************************");
            System.out.println("Usuario: " + BD_Usuarios.obtenerUsuario(usuario).getNombre());
            System.out.println("*****************************");
            System.out.println("1. Listar Usuarios");
            System.out.println("2. Cambiar Contraseña");
            System.out.println("3. Cambiar Contraseña Usu");
            System.out.println("4. Salir del sistema");
        }
    }

}
