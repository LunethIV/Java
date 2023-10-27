// Utiliza el operador ternario: ()?: para indicar si una letra introducida por teclado es un dígito o no lo es


// @author Lun
package paquete5;

import java.util.Scanner;

public class Ej5_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduce una letra");
        String letra = sc.nextLine();
        
         // Usamos el operador ternario para comparar la letra con el rango de caracteres ASCII de los dígitos
        String resultado = (letra.matches("[0-9]")) ? "Es un dígito" : "No es un dígito";

        System.out.println("El resultado: " + resultado);
    }
}