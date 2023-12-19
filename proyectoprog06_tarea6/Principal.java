
package proyectoprog06_tarea6;
import java.util.Scanner;
public class Principal {


    public static void main(String[] args) {
        
        // Ej1: Introducir un texto, volvedlo a mostrar en mayúsculas.
        String texto = Introducir.cadena("Introduce el texto");
        
        String textoMayus = texto.toUpperCase();
        
        System.out.println("El texto en mayúsculas es: " + textoMayus);
        
        System.out.println("______________________________________________");
        
        /*Ej2: Indica el número de aes, y de vocales que posee el String :“Mañana
               es sabado y voy a ir a tomarme unas copillas por el centro de
               Logroño".*/
        
        String frase = "Mañana es sábado y voy a tomarme unas copillas por el centro de Logroño";
        
        int numAes = 0;
        int numVocales = 0;
        
        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if(letra == 'a'){
                numAes++;
                numVocales++;
            }
            else if(letra == 'e'){
                numVocales++;
            }
            else if(letra == 'i'){
                numVocales++;
            }
            else if(letra == 'o'){
                numVocales++;
            }
            else if(letra == 'u'){
                numVocales++;
            }
        }
        System.out.println("Numero de Aes: " + numAes);
        System.out.println("Número de vocales: " + numVocales);
        System.out.println("______________________________________________");
        
        /* Ej3: Introducir un texto, e indicar si está la 'W' (en mayúscula o
                minúscula), y la posición que ocupa la primera vez. */      
        boolean encontrado = false;
        int posicion = -1;
        
       String text = Introducir.cadena("Introduce el texto a analizar");
        
        for(int i = 0; i < text.length(); i++){
            char letras = text.charAt(i);
            if(letras == 'w' || letras == 'W'){
                encontrado = true;
                posicion = i;
            }
        }
        
        if(encontrado == true){
            System.out.println("La letra 'W' aparece por primera vez en la posición: " + posicion);
        }
        else{
            System.out.println("La letra 'W' no se encuentra en el texto");
        }
        
        /* Ej4: Dado el texto del ejercicio 3, indicar si está la ‘T’ (en mayúscula o
                minúscula), y las posiciones que ocupan (es necesario utilizar un
                array).*/
        boolean correcto = false;
        int pos [] = new int[text.length()];
        
        for(int i = 0; i < text.length(); i++){
            char letras = text.charAt(i);
            if(letras == 't' || letras == 'T'){
                correcto = true;
                pos[i] = i;
            }
        }
        if(correcto){
            System.out.println("Se ha encontrado la letra 't' en las siguientes posiciones: " + pos);
        }
        else{
            System.out.println("No se ha encontrado la letra 't' en el texto");
        }
    }
}