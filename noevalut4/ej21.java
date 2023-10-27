//Se desea diseñar un algoritmo que una vez introducido un valor real, indique
//si su valor se corresponde con una nota correcta (0 a 10). Dependiendo de
//su valor está comprendido entre 0 y 4 mostrará el mensaje “SUSPENSO”, si
//es 5 y menor que 6, mostrará el mensaje “APROBADO”, si es superior o igual
//a 6 e inferior a 7, mostrará el mensaje “BIEN”, si su valor está comprendido
//entre 7 y 8, mostrará el mensaje “NOTABLE”, si el valor es superior o igual a
//9 e inferior o igual a 10, mostrará “SOBRESALIENTE”.

 // @author Lun
package noevalut4;
import java.util.Scanner;
public class ej21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        float nota;
        
        //Introducir notas
        System.out.println("Introduzca nota");
        nota = sc.nextFloat();
               
        // Rango válido de notas del 0 al 10
        if (nota < 0 || nota > 10) 
            System.out.println("La nota introducida no es válida");
        
        // Calcular nota
        else if (nota >= 0 && nota <= 4)
            System.out.println("Suspenso");
        else if (nota >= 5 && nota < 6)
            System.out.println("Aprobado");
        else if (nota >= 6 && nota < 7)
            System.out.println("Bien");
        else if (nota >= 7 || nota == 8)
            System.out.println("Notable"); 
        else if (nota >= 9 && nota <= 10)
            System.out.println("Sobresaliente");
    
    }
    
}