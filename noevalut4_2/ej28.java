// Contar cuántos múltiplos de 3 hay comprendidos entre 45 y 59

// @author Lun

package noevalut4_2;

public class ej28 {


    public static void main(String[] args) {
       int contador = 0;
        int i = 45;

        while (i <= 59) {
            if (i % 3 == 0) {
                contador++;    
            }
            i++;
        }
        System.out.println("La cantidad de múltiplos es: " + contador);
    }
}
