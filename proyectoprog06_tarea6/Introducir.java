
package proyectoprog06_tarea6;
import java.util.Scanner;
public class Introducir {
    
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
    
    public static double real(String msg){
        Scanner sc = new Scanner(System.in);
        
        String cadena;
        double numero = 0;
        boolean correcto = false;
        
        do{
            try{
                System.out.println(msg);
                cadena = sc.nextLine();
                numero = Double.parseDouble(cadena);
                correcto = true;
            }catch(NumberFormatException e){
                System.out.println("ERROR, INTRODUZCA UN VALOR REAL");
            }
        }while(!correcto);
        
        return numero;
              
    }
    public static String cadena (String msg){
        Scanner sc = new Scanner(System.in);
        String cadena;
        
        System.out.println(msg);
        cadena = sc.nextLine();
        
        return cadena;
    }
    
    public static char caracter (String msg){
        Scanner sc = new Scanner(System.in);
        String cadena;
        char c;
        
        System.out.println(msg);
        cadena = sc.nextLine();
        c=cadena.charAt(0);
        
        return c;
    }
}
