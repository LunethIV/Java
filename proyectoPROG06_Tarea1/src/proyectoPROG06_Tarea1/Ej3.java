
package proyectoPROG06_Tarea1;

import java.util.Scanner;
public class Ej3 {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        int total = 0; 
        
         String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        
         int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
         
         
         int dia = Introducir.entero("Introduce el día");
         
         System.out.println("Introduce el mes");
         String mes = sc.nextLine();
         
         for (int i = 0; i < dias.length; i++){
             if (meses[i] == mes){
                 total += dia;
                 break;
             }
             else{
                 total += dias[i];
             }             
         }                 
         System.out.println("Los días transcurridos desde el 1 de enero hasta el " + dia + " de " + mes + " son : " + total);
    }   
}
