
package proyectoprog06_tarea2;

import java.util.Scanner;
public class Introducir {
    
    public static int entero (String msg){
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
                System.out.println("Error, introduce un número entero");
            }
        }while (!correcto);
        
        return numero;
    }
    
    public static double real (String msg){
        Scanner sc = new Scanner(System.in);
        String cadena;
        double numero = 0d;
        
        boolean correcto = false;
        
        do{
            try{
                System.out.println(msg);
                cadena = sc.nextLine();
                numero = Double.parseDouble(cadena);
                correcto = true;
            }catch(NumberFormatException a){
                System.out.println("Error, introduce un número real");
            }
        }while(!correcto);
        return numero;
    }
}
