// @author Lun

//En la notación de las calificaciones académicas en Nueva Zelanda se
//utilizan los caracteres: ‘A’,’B’,’C’,’D’ y ‘E’. Diseña un algoritmo que lea una
//letra, e indica su equivalente en la calificación académica en España. ‘A’ es
//9 ó 10, ‘B’ es 7 ó 8, ‘C’ es 5, 6 ó 7, ‘D’ es 3 ó 4 y ‘E' es 2, 1 ó 0.

package noevalut4;

import java.util.Scanner;
public class ej24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        String letra;
        
        // Leer letra
        System.out.println("Introducir letra: ");
              letra = sc.nextLine();
               
        // Calcular
        switch (letra) {
            case "A" -> System.out.println("9 o 10");
            case "B" -> System.out.println("7 u 8");
            case "C" -> System.out.println("5, 6 o 7");
            case "D" -> System.out.println("3 o 4");
            case "E" -> System.out.println("1, 2 o 0");
            default -> System.out.println("Letra no válida");
        }
    }
    
}
