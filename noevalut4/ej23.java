// @author Lun

//Se desea diseñar un algoritmo que escriba los nombres de los días de la
//semana en función del valor de una variable dia (número entero).
//Previamente a eso, el valor entero introducido es necesario verificar si es
//correcto o su valor no está comprendido entre los valores 1 y 7

package noevalut4;

import java.util.Scanner;
public class ej23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int dia;
        
        // Leer valor
        System.out.println("Introduzca valor");
        dia = sc.nextInt();
        
        // Rango de valores correctos
        if (dia <= 0 || dia > 7)
            System.out.println("Valor inválido");
        
        // Calcular días
        else if (dia == 1)
            System.out.println("Lunes");
        else if (dia == 2)
            System.out.println("Martes");
        else if (dia == 3)
            System.out.println("Miercoles");
        else if (dia == 4)
            System.out.println("Jueves");
        else if (dia == 5)
            System.out.println("Viernes");
        else if (dia == 6)
            System.out.println("Sábado");
        else if (dia == 7)
            System.out.println("Domingo");
    }
    
}
