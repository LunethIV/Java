
package noevalut4_2;
import java.util.Scanner;
public class practica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        
        
        while (!salir){
            
                System.out.println("Introduce un número: ");
                opcion = sc.nextInt();
            
                System.out.println("Opción 1");
                System.out.println("Opción 2");
                System.out.println("Opción 3");
                System.out.println("Opción 4");
                System.out.println("Opción 5");
                System.out.println("Opción 6");
                System.out.println("Salir");
            
              
                switch(opcion){
                    case 1:
                         System.out.println("Esta es la opción 1");
                        break;
                    case 2:
                        System.out.println("Esta es la opción 2");
                        break;
                    case 3: 
                        System.out.println("Esta es la opción 3");
                        break;
                    case 4: 
                        System.out.println("Esta es la opción 4");
                        break;
                    case 5:
                        System.out.println("Esta es la opción 5");
                        break;
                    case 6:
                        System.out.println("Esta es la opción 6");
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 7");
                }
            }
                        System.out.println("Fin del menú");
        }
                        
    }
   

