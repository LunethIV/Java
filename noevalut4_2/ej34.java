/*En 'Terra Mítica' se desea saber cuántas personas han pasado en un día.
Deben de decir su edad conforme entren, si su edad es inferior a 4, la
entrada es gratis, si la edad está comprendida entre 4 años y 12 años
(incluídos), la entrada costará 20€, y si la edad supera a 12, la entrada
costará 40€. La taquilla se cerrará cuando la cajera introduzca una edad
igual a -1. Indicad, el número de niños con edades inferiores a 4 años, el
número de niños con edad comprendida entre 4 y 12 años, y adultos.
Indicad también el número total de personas que han entrado y la caja que
se ha hecho al final de la jornada.*/

// @author Lun

package noevalut4_2;
import java.util.Scanner;
public class ej34 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
      // Declarar variables
      int totalPersonas = 0;
      int edad;
      int menor4 = 0;
      int de4a12 = 0;
      int adulto = 0;
      int caja = 0;
      
            // Entrada de datos en buble
            do {
             System.out.println("Introducir edad: ");
             edad = sc.nextInt();
             
             if (edad < 4 && edad != -1){
                 caja += 0;
                 menor4++;
                 totalPersonas++;
                }
                 else if (edad >= 4 && edad <= 12) {
                 caja += 20;
                 de4a12++;
                 totalPersonas++;
                }
                 else if (edad > 12){
                 caja += 40;
                 adulto++;
                 totalPersonas++;
                 }
             
            } while (edad != -1);
             
            // Imprimir resultados
            System.out.println("Total menores de 4: " + menor4);
            System.out.println("Total entre 4 y 12: " + de4a12);
            System.out.println("Total adultos: " + adulto);
            System.out.println("Total caja: " + caja + "€");
            System.out.println("Total personas: " + totalPersonas);
    }
}