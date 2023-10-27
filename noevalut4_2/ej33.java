//Introducir las notas de 15 alumnos, ¿cuántos aprobados hay, cuántos
//suspensos? Especificar los porcentajes de aprobados y suspensos

// @author Lun

package noevalut4_2;
 import java.util.Scanner;
public class ej33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declarar variables
        int aprobados = 0;
        int suspensos = 0;
        
        // Crear bucle
        for (int i = 0; i < 15; i++){
            System.out.println("Introducir 15 notas de alumnos: ");
            int nota = sc.nextInt();
            
            // Condiciones
            if (nota >= 5){
                aprobados++;
            }
            else {
                suspensos++;
            }
        }
        
        // Calcular porcentajes de aprobados y suspensos
        double porApr = (aprobados / 15) * 100;
        double porSus = (suspensos / 15) * 100;
        
        // Imprimir resultados
        System.out.println("Aprobados:" + aprobados);
        System.out.println("Suspensos:" + suspensos);
        System.out.println("% de aprobados:" + porApr + "%");
        System.out.println("% de suspensos:" + porSus + "%");
            
    }
    
}
