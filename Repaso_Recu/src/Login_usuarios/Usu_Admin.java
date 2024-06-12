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
public class Usu_Admin extends Usu_Normal{

    public Usu_Admin(String nombre, String password, String email) {
        super(nombre, password, email);
        this.tipo = tipo.ADMIN;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    
    

    @Override
    public void listarUsuarios() {
        ArrayList<Usu_Normal> bd = BD_Usuarios.obtenerBD();

        System.out.println("=================== LISTAR USUARIOS ===================");
        for (int i = 0; i < BD_Usuarios.obtenerBD().size(); i++) {
            if (BD_Usuarios.obtenerBD().get(i) instanceof Usu_Admin) {
                System.out.printf("A  %10s %10s %s\n", bd.get(i).getNombre(),bd.get(i).getPassword(), bd.get(i).getEmail());

            } else {
                System.out.printf("  %10s %10s %s\n", bd.get(i).getNombre(),bd.get(i).getPassword(),bd.get(i).getEmail());
            }
        }
        System.out.println("=======================================================");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
    
    
    
    
}
