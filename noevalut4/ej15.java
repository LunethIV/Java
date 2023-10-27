//Diseña un algoritmo que lea un número entero por teclado e indique si es
//igual a -10 o no lo es.
package noevalut4;

// @author Lun

import java.util.Scanner;

public class ej15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int num;
        
        // Introducir número entero
        System.out.println("Introducir número entero:");
        num = sc.nextInt();
        
        // Calcular si es igual a -10
        if (num == -10)
            System.out.println("Es igual a -10");
        else
            System.out.println("No es igual a -10");
    }
    
}
