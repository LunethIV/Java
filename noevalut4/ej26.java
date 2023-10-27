// Programa que lee y muestra el menor de tres enteros.

 //@author Lun

package noevalut4;
import java.util.Scanner;
public class ej26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int num1, num2, num3;
        
        // Leer números
        System.out.println("Introducir num1");
        num1 = sc.nextInt();
        System.out.println("Introducir num2");
        num2 = sc.nextInt();
        System.out.println("Introducir num3");
        num3 = sc.nextInt();
        
        // Calcular
        if (num1 > num2 && num1 > num3)
            System.out.println("num1 es el mayor");
        else if (num2 > num1 && num2 > num3)
            System.out.println("num2 es el mayor");
        else 
            System.out.println("num3 es el mayor");
    }
    
}
