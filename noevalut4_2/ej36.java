//Introducir las notas de 15 alumnos, ¿cuántos aprobados hay, cuántos
//suspensos? Especificar el valor de la media aritmética de las notas.

// @author Lun

package noevalut4_2;
import java.util.Scanner;
public class ej36 {

    public static void main(String[] args) {
        // Declaramos las variables
        int aprobados = 0;
        int suspensos = 0;
        double nota;
        double sumaNotas = 0;

        // Creamos un objeto Scanner para leer las notas por teclado
        Scanner scanner = new Scanner(System.in);

        // Leemos las notas de los alumnos
        for (int i = 0; i < 15; i++) {
            System.out.println("Introduce la nota del alumno " + (i + 1) + ": ");
            nota = scanner.nextDouble();

            // Actualizamos el número de aprobados y suspensos
            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }

            // Sumamos la nota
            sumaNotas += nota;
        }

        // Calculamos la media aritmética
        double media = sumaNotas / 15;

        // Imprimimos los resultados
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Media aritmética: " + media);
    }
}
