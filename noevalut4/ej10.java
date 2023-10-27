package noevalut4;

// @author Lun

import java.util.Scanner;
public class ej10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        float duracionLlamada;
        float costeLlamada;
        
        // Introducir el tiempo de llamada
        System.out.println("Introduzca tiempo de llamada: ");
        duracionLlamada = sc.nextFloat();
        
        // Calcular coste de la llamada
        costeLlamada = 0.25f;
        
        if (duracionLlamada > 3) {
            costeLlamada += (duracionLlamada - 3) * 0.06f;
        }
        // Imprimimos el resultado
        System.out.println("El coste adicional de la llamada es de: " + costeLlamada + " €");
    }
    
}