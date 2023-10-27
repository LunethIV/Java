// Diseña un algoritmo que calcule el factorial del 7.

 // @author Lun

package noevalut4_2;
public class ej39 {

    public static void main(String[] args) {
       
        // Declarar variable factorial
        int factorial = 1;
        
        // Crear bucle
        for (int i = 1; i <= 7; i++) {
            factorial *= i;
        }
        
        // Imprimir resultado
        System.out.println("El factorial de 7 es: " + factorial);
    }
    
}
