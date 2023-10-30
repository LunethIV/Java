


// @author Lun

package paquete8;
 
import paquete7.Leer;

import java.util.Scanner;

public class MiClase {
   
    public static void subrayado (){
        System.out.println("__________________________________________________");
    }
    
    public static void menu (){
        System.out.println("---CALCULADORA SIMPLE---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
    }
    
    public static int enteroEntre (String msg, int inferior, int superior){
        Scanner sc = new Scanner(System.in);
        
        System.out.println(msg);
        int valor = sc.nextInt();
        
        while (valor < inferior || valor > superior){
            System.out.println("El valor debe estar comprendido entre " + inferior + " y " + superior);
            valor = sc.nextInt();
        }
            return valor;
    }
    
    public static int entero (String msg){      
       
       int num = Integer.parseInt(msg);
       
       return num;
    }
    
    public static void sumar (){
        
        
        int num1 = Leer.enteroPositivo("Introduce el primer número");
        int num2 = Leer.enteroPositivo("Introduce el segundo número");
        
        int suma = num1 + num2;
        
        System.out.println(suma);
    }
    
  
    
    public static void restar (){
        
        int num1 = Leer.enteroPositivo("Introduce el primer número");
        int num2 = Leer.enteroPositivo("Introcuce el segundo número");
        
        int resta = num1 - num2;
        
        System.out.println(resta);
    }
    
    public static void multiplicar (){
        
        int num1 = Leer.enteroPositivo("Introduce el primer número");
        int num2 = Leer.enteroPositivo("Introcuce el segundo número");
        
        int multi = num1 * num2;
        
        System.out.println(multi);
    }
    
    public static void dividir (){
        
        int num1 = Leer.enteroPositivo("Introduce el primer número");
        int num2 = Leer.enteroPositivo("Introcuce el segundo número");
        
        double divi = num1 / num2;
        
        System.out.println(divi);
    }
}
