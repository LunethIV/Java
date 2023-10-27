//Introducir las notas de un grupo de alumnos La introdución de las notas
//finalizará cuando la nota sea -1. Se desea saber si hay algún 10 o no lo hay.

 // @author Lun
package noevalut4_2;
import java.util.Scanner;
public class ej40 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        // Declarar variables
        int notas;
        int contador10 = 0;
       
        // Introducir notas y bucle
        do {
            System.out.println("Introducir nota: ");
            notas = sc.nextInt();
            
            if (notas == 10 && notas != -1)
                contador10++;            

        } while (notas != -1);
        
        // Imprimir resultados
        if (contador10 > 0)
        System.out.println("Hay " + contador10 + " dieces");
        else
            System.out.println("No hay 10");
    }   
}