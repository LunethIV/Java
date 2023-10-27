package noevalut4;

// @author Lun
// Diseña un algoritmo que lee un año e indica si es bisiesto.
import java.util.Scanner;
public class ej14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int año;
        
        // Leer año por teclado
        System.out.println("Introducir año:");
        año = sc.nextInt();
        
        // Comprobar si el año es bisiesto
        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0))
                System.out.println("Es bisiesto");
                
        else
                System.out.println("No es bisiesto");
    }
    
}
