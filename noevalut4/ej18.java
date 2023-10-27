package noevalut4;

// @author Lun
//Diseña un algoritmo que lee un número entero por teclado y nos
//indique si es positivo, negativo o cero.
import java.util.Scanner;
public class ej18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int num;
        
        // Leer el número entero
        System.out.println("Introduzca el número entero: ");
        num = sc.nextInt();
        
        // Calcular si es positivo, negativo o 0
        if (num > 0)
            System.out.println("El número es positivo");
        else if (num < 0)
            System.out.println("El número es negativo");
        else 
            System.out.println("El número es cero");
    }
    
}
