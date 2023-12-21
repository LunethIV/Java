package proyectoprog06_tarea6;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        System.out.println("______________________________________________");
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
            else{
                pos[i] = -1;
            }
        }
        
        if(correcto == true){
            for(int i = 0; i < pos.length; i++){
                if(pos[i] != -1){
                    System.out.println("Las posiciones de las T son: " + pos[i]);
                }
            }       
        }
        else{
        System.out.println("No se ha encontrado la letra 't' en el texto");            
        }
        System.out.println("______________________________________________");
        /* Ej5: Partiendo de la cadena String "En mi proxima vida, creere en la
                reencarnacion" indica si se encuentra la subcadena “creere” */
       
        String cadena = "En mi proxima vida, creere en la reencarnacion";

        boolean contiene = cadena.contains("creere");

        System.out.println("La cadena contiene la subcadena 'creere': " + contiene);
        System.out.println("______________________________________________");
        /*Ej6: Introducir un texto e indicar si representa un número.*/
              
        String texto2 = Introducir.cadena("Introduce el texto para saber si representa un número");
        
        boolean esNumero = false;
        
        for(int i = 0; i < texto2.length(); i++){
            char letras = texto2.charAt(i);
            if(Character.isDigit(letras)){
                esNumero = true;
            }           
        }
        if(esNumero){
            System.out.println("Sí, representa un número");
        }
        else{
            System.out.println("No representa un número");
        }
        System.out.println("______________________________________________");
        
        // Comprobar si el NIF introducido es válido
        String NIF = Introducir.cadena("Introduce el NIF");
        Pattern nifPatern = Pattern.compile("[0-9]{8}[T R W A G M Y F P D X B N J Z S Q V H L C K E]");
        Matcher matcherNIF = nifPatern.matcher(NIF);
        
        if(matcherNIF.matches()){
            System.out.println("El NIF introducido es correcto");
        }
        else{
            System.out.println("El NIF introducido es incorrecto");
        }
        System.out.println("______________________________________________");
        
        // Comprobar si un NIE es correcto
        String NIE = Introducir.cadena("Introduce el NIE");
        
        // Creamos una expresión regular para un NIE válido
        Pattern patternNIE = Pattern.compile("[XYZ][0-9]{7}[A-Z]");
        
        // Comprobamos que el NIE cumple con la expresión regular
        Matcher matcherNIE = patternNIE.matcher(NIE);
        
        if(matcherNIE.matches()){
            // El NIE es válido
            System.out.println("El NIE es válido");
            
            // Calculamos la letra de control
            char[] caracteres = NIE.toCharArray();
            // Se calcula el resto de dividir la suma de los digitos por 23
            int resto = 0;
            
            for(int i = 0; i < 7; i++){
                resto += (caracteres[i] - '0');
            }
            
            int letraControl = resto % 23;
            
            // Comprobamos si la letra de control coincide con la última letra del NIE
            if(letraControl == NIE.charAt(8)){
                // La letra de control es correcta
                System.out.println("La letra de control es correcta");
            }
            else{
                System.out.println("La letra de control es incorrecta");
            }
        }
        else{
            System.out.println("El NIE no es válido");
        }
    }
}