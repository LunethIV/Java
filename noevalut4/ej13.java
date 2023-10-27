package noevalut4;

// @author Lun

import java.util.Scanner;

//Diseña un algoritmo que nos indique si una nota introducida por teclado
//es correcta o incorrecta. La nota tendrá valores enteros.
public class ej13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int nota;
        
        // Introducir nota
        System.out.println("Introducir nota:");
        nota = sc.nextInt();
        
        // Calcular
        if (nota >=1 && nota <= 10)
            System.out.println("Es válido");
        else 
            System.out.println("No es válido");
    }
    
}
