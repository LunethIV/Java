
package proyectoprog06_tarea6;

public class MisMetodos {
    
    public static boolean texto (String texto){              
        
        for(int i = 0; i < texto.length(); i++){
            if(!Character.isLetter(texto.charAt(i)))
                return false;
        }
        return true;
    }
    
    public static int sumaDigitos (String texto){
        
        int suma = 0;
        
        for(int i = 0; i < texto.length(); i++){
          char caracter = texto.charAt(i);
          if(Character.isDigit(caracter)){
              suma += caracter - '0';
          }
        }
        return suma;
    }
    
    public static String invertida(String cadena) {
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
          invertida += cadena.charAt(i);
        }
        return invertida;
    }
    
    public static String sinEspacios (String cadena){
       
        // Reemplazar todos los espacios intermedios por un solo espacio
        cadena = cadena.replaceAll("\\s+", "");
        
        return cadena;
    }
    
    public static boolean palindromo (String cadena){
        
       cadena = MisMetodos.sinEspacios(cadena);
       
       cadena = cadena.toLowerCase();
       
       // Crear 2 iteraciones para recorrer la cadena de izquierda a derecha
       int i = 0;
       int j = cadena.length() -1;
       
       // Mientras que las iteraciones no se crucen
       while(i < j){
           // Si los caracteres en las posiciones i y j son diferentes
           if(cadena.charAt(i) != cadena.charAt(i)){
               // La cadena no es un palíndromo
               return false;
           }
           
           i++;
           j++;
       }
       // La cadena es un palíndromo
       return true;
    }
}
