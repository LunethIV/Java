
import java.util.Scanner;

public class Introducir {
    
    public static String cadena (String msg){
        Scanner sc = new Scanner(System.in);
        
        System.out.println(msg);
        String cadena = sc.nextLine();
        
        return cadena;
    }
    
    public static String invertida (String text){
        String invertida = "";
        
        for(int i = text.length() - 1; i >= 0; i--){
            invertida += text.charAt(i);    
        }
        return invertida;
    }
    
    public static String sinEspacio (String cadena){
        
        cadena = cadena.replaceAll("\\s+", "");
        
        return cadena;
    }
    
    public static boolean esPalindromo (String palabra){
        int longitud = palabra.length();
        
        for(int i = 0; i < longitud / 2; i++){
            if(palabra.charAt(i) != palabra.charAt(longitud -1 -i)){
                return false;
            }
        }
        return true;
    }
    
    public static int entero(String msg){
        Scanner sc = new Scanner(System.in);
        String cadena;
        int numero = 0;
        boolean correcto = false;
        
        do{
            try{
                System.out.println(msg);
                cadena = sc.nextLine();
                numero = Integer.parseInt(cadena);
                correcto = true;
            }catch(NumberFormatException e){
                System.out.println("ERROR, INTRODUZCA UN VALOR ENTERO");
            }
        }while(!correcto);
        
        return numero;
    }
    public static boolean esPrimo (int n){
        if(n <= 1) {
            return false;
        }

        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
              return false;
            }
        }
        return true;
    }
    
    public static int sumaDigitios(int n){
        int suma = 0;
        
        while (n > 0) {
          suma += n % 10;
          n /= 10;
        }
        return suma;
    }
    
    public static int factorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static int tresOpciones(String msg){
        Scanner sc = new Scanner(System.in);
        String cadena;
        int num = 0;
        boolean correcto = false;
        
        do{
            try{
                System.out.println(msg);
                cadena = sc.nextLine();
                num = Integer.parseInt(cadena);
                if(num == 1 || num == 2 || num == 3){
                    correcto = true;
                }
                else{
                    System.out.println("ERROR, introduce un valor entero entre 1 y 3");
                }
            }catch(NumberFormatException e){
                System.out.println("ERROR, introduce un valor entero entre 1 y 3");
            }
        }while(!correcto);
        
        return num;
    }
}