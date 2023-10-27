// Contar cuántos múltiplos de 3 hay comprendidos entre 45 y 59

// @author Lun

package noevalut4_2;
 
public class ej32 {

    public static void main(String[] args) {
        // Declarar variables
     int contador = 0;
     
        // Crear bucle
        for (int i = 45; i <= 59; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }
        // Imprimir resultado
        System.out.println("Hay " + contador + " múltiplos de 3 entre 45 y 59");
    }
}