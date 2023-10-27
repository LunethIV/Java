//introducir las notas de un grupo de alumnos, ¿cuántos aprobados hay,
//cuántos suspensos? Especificar el valor de la media aritḿetica de sus notas.
//La introdución de las notas finalizará cuando la nota sea -1.

// @author Lun

package noevalut4_2;

import java.util.Scanner;
public class ej37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int notas;
        int aprobados = 0;
        int suspensos = 0;
        double notasTotal = 0;
        int alumnos = 0;
        // Introducir notas y crear bucle
        do {
            System.out.println("Introducir nota de alumno: ");
            notas = sc.nextInt();
            
            if (notas >= 5){
            aprobados++;
            alumnos++;
            notasTotal += notas;
            }

            else if (notas < 5 && notas != -1){
            suspensos++;         
            alumnos++;
            notasTotal += notas;
            }
            
        } while (notas != -1);
        
        // Especificar valor de la media
        double media = notasTotal / alumnos;
        
        // Imprimir resultados
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos " + suspensos);
        System.out.println("Media " + media);
    }
}