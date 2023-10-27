package noevalut4;

// @author Lun
import java.util.Scanner;
public class NoEvalUT4 {

    public static void main(String[] args) {
        
        // Declaramos variables
        int edad;
        
        // Leer la edad de la persona
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la edad: ");
        edad = sc.nextInt();
        
        // Comprobar si la edad es correcta
        if (edad < 0 || edad > 120) {
            System.out.println("La edad introducida es incorrecta");
        } 
        else {
            System.out.println("La edad introducida es correcta");
        }
            
    }
    
}
