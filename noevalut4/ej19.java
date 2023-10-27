package noevalut4;

// @author Lun
//Diseña un algoritmo que lea dos números enteros por teclado, se desea
//saber cuál es el mayor de los dos o, bien si son iguales.
import java.util.Scanner;
public class ej19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int num1, num2;
        
        // Leer números
        System.out.println("Introducir num1");
        num1 = sc.nextInt();
        
        System.out.println("Introducir num2");
        num2 = sc.nextInt();
        
        // Calcular cual es mayor o si son iguales
        if (num1 > num2)
            System.out.println("num1 es mayor");
        else if (num2 > num1)
            System.out.println("num2 es mayor");
        else
            System.out.println("Son iguales");
    }
    
}
