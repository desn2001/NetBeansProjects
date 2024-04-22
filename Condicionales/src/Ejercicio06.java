
import java.time.Year;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author diego.sanchez
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int dia;
        int mes;
        int year;
        
        System.out.print("introduce la fecha [d m a]: ");
        dia=teclado.nextInt();
        mes=teclado.nextInt();
        year=teclado.nextInt();
       
        //Comprabamos los años esten en el rango que nos indica el ejercicio.
        if (year >= 1900 && year<=2500) {
            System.out.println("El año introducido es correcto");           
        }else{
            System.out.println("ERROR el año introducido es incorrecto");
        }
        //Comprobamos que la numeración de los meses sea la correcta
        if (mes >=1 && mes <=12) {
            System.out.println("EL mes introducido es correcto");
        }else{
            System.out.println("ERROR el mes introducido es incorrecto");
        }
        //Comprobamos los dias
        switch (mes) {
            case 1,3,5,7,8,10,12:
                //meses de 31 dias
                if (dia >=1 && dia<=31) {
                    System.out.println("EL dia es correcto");
                }else{
                    System.out.println("ERROR en el dia");
                }
                break;
            case 4,6,9,11:
                //meses de 30 dias
                if (dia >=1 && dia<=30) {
                    System.out.println("El dia es correcto");
                }else{
                    System.out.println("ERROR en el dia");
                }
                
                break;
            case 2:
                if (Year.of(year).isLeap()) {
                    if (dia>=1 && dia<=29) {
                        System.out.println("El dia es correcto");
                    }else{
                        System.out.println("ERROR en el dia");
                    }
                    
                }else{
                    if (dia >=1 && dia<=28) {
                        System.out.println("El dia es correcto");
                    }else{
                        System.out.println("ERROR en el dia");
                    }
                }
                
                break;
            default:
                System.out.println("ERROR el mes introducido no es valido");
        }
        
        
    }
    
}
