//Diseña un algoritmo que lea dos números enteros por teclado, se desea
//saber cuál es el mayor y el menor de los dos números, o bien, si son iguales.

// @author Lun

package noevalut4;
 
import java.util.Scanner;
public class ej20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int num1, num2;
        // Leer numeros por teclado
        System.out.println("Introducir num1: ");
        num1 = sc.nextInt();
        
        System.out.println("Introducir num2: ");
        num2 = sc.nextInt();
        // Calcular cual es mayor, menor o iguales
        if (num1 > num2){
            System.out.println("El número mayor es: " + num1);
            System.out.println("El número menor es: " + num2);
        }
        else if (num2 > num1) {
            System.out.println("El numero mayor es: " + num2);
            System.out.println("El numero menor es: " + num1);
        }
        else 
            System.out.println("Los dos son iguales");
    }
}
