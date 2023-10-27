package noevalut4;

import java.util.Scanner;


// @author Lun
//Diseña un algoritmo que tal que dada una nota de un módulo de un
//alumno (valor entero), indique si está aprobado o suspenso.

public class ej11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
       int nota;
       
       // Insertar nota
       System.out.println("Insertar nota:");
       nota = sc.nextInt();
       
       // Calcular nota
       if (nota >= 5) 
       System.out.println("Aprobado");
       
       else 
        System.out.println("Suspenso");      
    }          
}