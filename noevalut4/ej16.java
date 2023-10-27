package noevalut4;

// @author Lun

//Diseña un algoritmo que lea tres números enteros y comprueba si
//alguno de ellos es suma de los otros dos. Si se cumple esta condición escribir
//”Sí, uno de ellos es la suma de los otros” y en caso contrario “Ningún
//número coincide con la suma de los otros dos”.
import java.util.Scanner;
public class ej16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int num1, num2, num3;
        
        // Introducir números
        System.out.println("Introducir número 1:");
        num1 = sc.nextInt();
        
        System.out.println("Introducir número 2:");
        num2 = sc.nextInt();
        
        System.out.println("Introducir número 3:");
        num3 = sc.nextInt();
        
        // Calcular e imprimir resultado
        if (num1 == num2 + num3 || num2 == num1 + num3 || num3 == num1 + num2)
            System.out.println("Sí, uno de ellos es la suma de los otros");
        else 
            System.out.println("Ningún número coincide con la suma de los otros dos");
    }
    
}
