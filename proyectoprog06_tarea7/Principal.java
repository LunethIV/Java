
public class Principal {

    public static void main(String[] args) {
        
        // Ej1: Mostrar por pantalla el abecedario completo en mayúsculas
        
        char letras [] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
       
        for(int i = 0; i < letras.length; i++){
            System.out.print(letras[i] + " ");
        }
        System.out.println();
        
        System.out.println("__________________________________________");
        
        // Ej2: Introducir un texto, volvedlo a mostrar en mayúsculas.
        
        String texto = Introducir.cadena("Introduce el texto a convertir");
        
        String mayus = texto.toUpperCase();
        
        System.out.println(mayus);
        
        System.out.println("__________________________________________");
        
        /* Ej3: Indica el número de aes, y de vocales que posee el String: “Mañana
                es sabado y voy a irme a tomar unas copillas por el centro de
                Logroño".*/
        
        String frase = "Mañana es sabado y voy a irme a tomar unas copillas por el centro de Lorgroño";
        int aes = 0;
        int vocales = 0;
        
        for(int i = 0; i < frase.length(); i++){
            char aux = frase.charAt(i);
            switch(aux){
                case 'a' -> {aes++; vocales++;}
                case 'e' -> vocales++;
                case 'i' -> vocales++;
                case 'o' -> vocales++;
                case 'u' -> vocales++;
                default ->{}
            }
        }
        System.out.println("El núnero de aes es: " + aes);
        System.out.println("El número de vocales es: " + vocales);
        System.out.println("__________________________________________");
        /*Ej4: Introducir un texto, e indicar si está la 'W' (en mayúscula o
               minúscula), y la posición que ocupa la primera vez. */
        
        String textoComp = Introducir.cadena("Introduce el texto para encontrar la W");
        boolean encontrado = false;
        int pos = -1;
        for(int i = 0; i < textoComp.length(); i++){
            char aux = textoComp.charAt(i);
            if(aux == 'w' || aux == 'W'){
                encontrado = true;
                pos = i;
            }
        }
        if(encontrado){
            System.out.println("La letra 'w' se encuentra por primera vez en la posición: " + pos);
        }
        else{
            System.out.println("No se ha encontrado la letra 'w'");
        }
        System.out.println("__________________________________________");
        /*Ej5: Dado el texto del ejercicio 3, indicar si está la ‘T’ (en mayúscula o
               minúscula), y las posiciones que ocupan (es necesario utilizar un array). */
        
        boolean T = false;
        int [] posi = new int [textoComp.length()];
        
        for(int i = 0; i < textoComp.length(); i++){
            char aux = textoComp.charAt(i);
            if(aux == 't' || aux == 'T'){
                T = true;
                posi[i] = i;
            }
            else{
                posi[i] = -1;
            }
        }
        
        if(T){
            for(int i = 0; i < posi.length; i++){
                if(posi[i] != -1){
                    System.out.println("La posición de la 'T' es: " + posi[i]);
                }                
            } 
        }
        else{
            System.out.println("No hay 'T'");
        }
        System.out.println("__________________________________________");
        /*Ej6: Partiendo de la cadena String "En mi proxima vida, creere en la
               reencarnacion" declarada e inicializada como variable primitiva,
               mostrar por si se encuentra la subcadena “creere” */
        
        String cadena = "En mi proxima vida, creere en la reencarnacion";
        boolean contiene = false;
        
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.contains("creere")){
             contiene = true;             
            }
        }
        if(contiene){
            System.out.println("La cadena contiene la subcadena 'creere'");
        }
        else{
            System.out.println("La cadena no contiene la subcadena 'creere'");
        }
        System.out.println("__________________________________________");
        /*Ej7: Introducir un texto, e indicar si está la 'p', comenzando por la última
               posición. */
        
        String texto2 = Introducir.cadena("Introduce el texto para comprobar si hay 'p'");
     
        boolean hayP = false;
        
        // Recorremos el texto desde la última posición
        for (int i = texto2.length() - 1; i >= 0; i--) {
            if (texto2.charAt(i) == 'p') {
                hayP = true;
                break;
            }
        }
        if(hayP){
            System.out.println("Hay 'p'");
        }
        else{
            System.out.println("No hay 'p'");
        }
        System.out.println("__________________________________________");
        /*Ej8: Introducir un texto, pasadlo a vector de caracteres e indicar
               si representa un número.*/
        
        String texto3 = Introducir.cadena("Introduce el texto para saber si representa un número");
        
        char[] vector = texto3.toCharArray();
        boolean esNumero = false;
        
        for(int i = 0; i < vector.length; i++){
            if(Character.isDigit(vector[i])){
                esNumero = true;
                break;
            }
        }
         if(esNumero){
            System.out.println("El texto representa un número.");
        } 
         else{
            System.out.println("El texto no representa un número.");
        }
         System.out.println("__________________________________________");
        /*Ej9: Introducir un texto, comprueba si todo él está compuesto por letras –
               que sea una palabra- (mayúsculas o minúsculas)*/
         
        String texto4 = Introducir.cadena("Introduce el texto para saber si está compuesto por letras");
        boolean esLetra = false;
         
        for(int i = 0; i < texto4.length(); i++){
            char aux = texto4.charAt(i);
            if(Character.isLetter(aux)){
                esLetra = true;
                break;
            }
        }
        if(esLetra){
            System.out.println("El texto \"" + texto4 +"\" solo está puesto por letras");
        }
        else{
            System.out.println("El texto \"" + texto4 +"\" no solo está puesto por letras");
        }
         System.out.println("__________________________________________");
        /*Ej10: Introducir un texto, y mostrar la suma de los caracteres
                correspondientes a dígitos pertenecientes a la secuencia almacenada
                en un String. Por ejemplo, si la cadena es ABC12m4XYZ, entonces
                debe devolver el valor numérico entero 7.*/
        String texto5 = Introducir.cadena("Introduce el texto para ver la suma de los números");
        int suma = 0;
         
        for(int i = 0; i < texto5.length(); i++){
            char aux = texto5.charAt(i);
            if(Character.isDigit(aux)){
                suma += aux - '0';
            }
        }
        System.out.println("La suma de los digitos del texto es: " + suma);
        System.out.println("__________________________________________");
        /*Ej11: Introduce una cadena, devuelve la invertida. Para ello
                desarrolla el método: invertida, tal que dado un String, lo devuelve de forma
                invertido.*/
        String texto6 = Introducir.cadena("Introduce texto para verlo invertido");
        String invertida = Introducir.invertida(texto6);
        
        System.out.println(invertida);
        System.out.println("__________________________________________");
        /*Ej12: Introducir un texto, muéstrala de nuevo sin espacios en blanco.
                Para ello, desarrolla el método:sinEspacios, tal que dada una cadena, la
                devuelve sin espacios*/
        String texto7 = Introducir.cadena("Introduce texto para verlo sin espacios");
        
        String sinEspacios = Introducir.sinEspacio(texto7);
        
        System.out.println(sinEspacios);
        
        /*Ej13: Comprobad si un número o palabra es palíndromo/a (Se lee de
                la misma manera de izquierda a derecha, que de derecha a izquierda).
                Por ejemplo, “A cavar a Caravaca” o “1221”.*/
        
        String texto8 = Introducir.cadena("Introduce el texto para saber si es un palindromo");
        
        boolean esPalindromo = Introducir.esPalindromo(texto8);
        
        if(esPalindromo){
            System.out.println("El texto: " + texto8 + " es palindromo");
        }
        else{
            System.out.println("No es un palindromo");
        }
    }
}