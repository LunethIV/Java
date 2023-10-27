//Diseña un algoritmo que calcule la suma de los 10 primeros números
//naturales.

// @author Lun

package noevalut4_2;

public class ej38 {

    public static void main(String[] args) {
        
        // Declarar variables
        int suma = 0;
        
        // Bucle
        for (int i = 1; i <= 10; i++){
            suma += i;
        }
        
        // Imprimir resultado
        System.out.println("La suma de los numeros es: " + suma);
    }
    
}
