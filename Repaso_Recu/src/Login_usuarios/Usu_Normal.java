/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login_usuarios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Usu_Normal {

    static Scanner teclado = new Scanner(System.in);

    private String nombre;
    private String password;
    private String email;
    protected TipoUsuario tipo;

    public Usu_Normal(String nombre, String password, String email) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.tipo = tipo.NORMAL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void cambiarPassword() {
        String nuevaContraseña,old;
        System.out.println("=================== CAMBIAR CONTRASEÑA ===================");
        System.out.println("Introduce la nueva Contraeña: ");
        nuevaContraseña = teclado.nextLine();
        System.out.println("Introduce la antigua Contraseña: ");
        old = teclado.nextLine();
        if (old.equals(password)) {
            nuevaContraseña = password;
        }else{
            System.out.println("La contraseña no es correcta");
        }
        System.out.println("==========================================================");
    }

    @Override
    public String toString() {
        return "Usu_Normal{" + "nombre=" + nombre + ", password=" + password + ", email=" + email + ", tipo=" + tipo + '}';
    }

    public void listarUsuarios() {
        ArrayList<Usu_Normal> bd = BD_Usuarios.obtenerBD();

        System.out.println("=================== LISTAR USUARIOS ===================");
        for (int i = 0; i < BD_Usuarios.obtenerBD().size(); i++) {
            if (BD_Usuarios.obtenerBD().get(i) instanceof Usu_Admin) {
                System.out.printf("A  %10s ********** %s\n", bd.get(i).getNombre(), bd.get(i).getEmail());

            } else {
                System.out.printf("  %10s ********** %s\n", bd.get(i).getNombre(), bd.get(i).getEmail());
            }
        }
        System.out.println("=======================================================");
    }

}
