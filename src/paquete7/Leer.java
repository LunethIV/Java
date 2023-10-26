


// @author Lun
package paquete7;

import java.util.Scanner;

public class Leer {

    public static int enteroPositivo (String msg){
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        String cadena;
        
        boolean correcto = false;
        do{
            try{
                System.out.println(msg);
                cadena = sc.nextLine();
                numero = Integer.parseInt(cadena);
                if (numero >= 0){
                    correcto=true;
                }
            }catch(NumberFormatException e){
                System.out.println("Error, no es un número entero");
            }
        }while(correcto == false);
        
        return numero;
    }
    
    public static double realDoblePositivo (String msg){
        Scanner sc = new Scanner(System.in);
        String cadena;
        double numero = 0.0d;
        boolean correcto = false;
        do{
            try{
                System.out.println(msg);
                cadena = sc.nextLine();
                numero = Double.parseDouble(cadena);
                if (numero >= 0)
                correcto=true;
            }catch(NumberFormatException e){
                System.out.println("Error, no es un número real positivo");
            }
        }while(correcto==false);
        
        return numero;
    }
    
    public static String cadena (String msg){
        Scanner sc = new Scanner(System.in);
        
        System.out.println(msg);
        String cadena = sc.nextLine();
        
        return cadena;
    }
}

