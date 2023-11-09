
package proyectoPROG06_Tarea1;

import java.util.Scanner;

public class Introducir {
    
    
    public static int entero (String msg){
        Scanner sc = new Scanner(System.in);
        
        String cadena;
        int numero = 0;
        
        boolean correcto = false;
        
        while (correcto != true){
            try{
                System.out.println(msg);
                cadena = sc.nextLine();
                numero = Integer.parseInt(cadena);
                if (numero >= 0){
                    correcto = true;
                }
            }catch(NumberFormatException e){
                System.out.println("Error, introduce un valor válido");
            }
        }
        return numero;
    }
    
    public static double real (String msg){
        Scanner sc = new Scanner(System.in);
        String cadena;
        double numero = 0d;
        
        boolean correcto = false;
        
        while(correcto != true){
            try{
                System.out.println(msg);
                cadena = sc.nextLine();
                numero = Double.parseDouble(cadena);
                if (numero >= 0d){
                    correcto = true;
                }
            }catch(NumberFormatException e){
                System.out.println("Error, introduce un número real");
            }
        }
        
        return numero;
    }
}
