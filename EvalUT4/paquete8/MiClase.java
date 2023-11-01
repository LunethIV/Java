


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
        subrayado();
        System.out.println("1. Suma");
        subrayado();
        System.out.println("2. Resta");
        subrayado();
        System.out.println("3. Multiplicación");
        subrayado();
        System.out.println("4. División");
        subrayado();
        System.out.println("5. Salir");
        subrayado();
    }
    
    public static int enteroEntre (String msg, int inferior, int superior){
        Scanner sc = new Scanner(System.in);
        
        String cadena;
        int valor = 0;
        
        System.out.println(msg);
        
        boolean esNumero = false;
        do{
            try{
                cadena = sc.nextLine();
                valor = Integer.parseInt(cadena);
                esNumero = true;
                while (valor < inferior || valor > superior){
                    System.out.println("Error, el valor debe estar entre 1 y 5");
                    valor = sc.nextInt();                    
                }        
            }catch(NumberFormatException e){
                System.out.println("Error, introduce un número entero");
            }
        }while(!esNumero);
        
        return valor;
    }
    
    public static int entero (String msg){      
       Scanner sc = new Scanner(System.in);
       
       int num = sc.nextInt();
       
       return num;
    }
    
    public static void sumar (){
        
        
        int num1 = Leer.enteroPositivo("Introduce el primer número");
        int num2 = Leer.enteroPositivo("Introduce el segundo número");
        
        int suma = num1 + num2;
        
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
    }
    
    
    public static void restar (){
        
        int num1 = Leer.enteroPositivo("Introduce el primer número");
        int num2 = Leer.enteroPositivo("Introcuce el segundo número");
        
        int resta = num1 - num2;
        
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
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