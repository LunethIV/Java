package noevalut4;

// Author Lun

import java.util.Scanner;

//Diseña un algoritmo que tal que dado un número entero, nos indique si es
//par o impar.
public class ej12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int num;
        
        // Solicitar número
        System.out.println("Insertar número: ");
        num = sc.nextInt();
        
        // Calcular
        if (num %2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
    
}
