
package noevalut4;

// @author Lun

//Se desea diseñar un algoritmo que una vez introducido un valor entero,
//indique si su valor se corresponde con una nota correcta (0 a 10).
//Dependiendo de su valor está comprendido entre 0 y 4 mostrará el mensaje
//“SUSPENSO”, si es 5, mostrará el mensaje “APROBADO”, si es igual a 6,
//mostrará el mensaje “BIEN”, si su valor es 7 u 8, mostrará el mensaje
//“NOTABLE”, si el valor es 9 o igual a 10, mostrará “SOBRESALIENTE”
import java.util.Scanner;
public class ej22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int nota;
        
        // Leer nota
        System.out.println("Introducir nota: ");
        nota = sc.nextInt();
        
        // Rango válido de notas
        if (nota < 0 || nota > 10)
            System.out.println("Nota no válida");
        
        // Calcular notas
        else if (nota <= 0 && nota <= 4)
            System.out.println("Suspenso");
        else if (nota == 5)
            System.out.println("Aprobado");
        else if (nota == 6)
            System.out.println("Bien");
        else if (nota == 7 || nota == 8)
            System.out.println("Notable");
        else if (nota == 9 || nota == 10)
            System.out.println("Sobresaliente");
    }
    
}
