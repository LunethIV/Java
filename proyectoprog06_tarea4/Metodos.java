
package proyectoprog06_tarea4;
import java.util.Scanner;
public class Metodos {
    
    // Este método genera un array de 6 números sin repetir ninguno
    public static int[] generar_carton(int n){
       
        // Crear array de números aleatorios
        int[] numeros = new int[n];       
        int i = 0;
        // Bucle para generar los siguientes números aleatorios
        while(i < n){
            int numAleatorio = (int) (Math.random()* (10-1)+1);
            
            // Comprobar que el número aleatorio no se ha generado antes
            boolean numRepetido = false;
            for(int j = 0; j < i; j++){
                if(numeros[j] == numAleatorio){
                    numRepetido = true;
                    break;
                }
            }
            
            // Si el número generado no se ha guardado antes, lo guardamos en el array
            if(!numRepetido){
                numeros[i] = numAleatorio;
                i++;
            }
        }
        return numeros;
    }
}