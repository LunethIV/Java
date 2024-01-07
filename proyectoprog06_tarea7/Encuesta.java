import java.util.Scanner;
public class Encuesta {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Introducir.entero("Introduce el número de encuestas realizadas");
        
        int[] cedulas = new int[50]; // Matriz de cédulas
        int[] sexos = new int[50]; // Matriz de sexos
        int[] sueldos = new int[50]; // Matriz de sueldos
        int[] trabajas = new int[50]; // Matriz de trabajas 
        
        // Leer los datos de los estudiantes
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1));
            System.out.println("Ingrese la cédula: ");
            cedulas[i] = sc.nextInt();
            System.out.println("Ingrese el sexo (1 - Masculino, 2 - Femenino): ");
            sexos[i] = sc.nextInt();
            System.out.println("Ingrese el sueldo: ");
            sueldos[i] = sc.nextInt();
            System.out.println("Ingrese si trabaja (1 - Sí, 2 - No): ");
            trabajas[i] = sc.nextInt();
        }
        
        // Calcular los porcentajes de hombres y mujeres
        int hombres = 0;
        int mujeres = 0;
        for (int i = 0; i < n; i++) {
            if (sexos[i] == 1) {
                hombres++;
            } else {
                mujeres++;
            }
        }
        float porcentajeHombres = (float) hombres / n * 100;
        float porcentajeMujeres = (float) mujeres / n * 100;
        
         // Calcular los porcentajes de hombres y mujeres que trabajan
        int hombresQueTrabajan = 0;
        int mujeresQueTrabajan = 0;
        float promedioSueldoHombres = 0;
        float promedioSueldoMujeres = 0;
        for (int i = 0; i < n; i++) {
            if (trabajas[i] == 1) {
                if (sexos[i] == 1) {
                    hombresQueTrabajan++;
                    promedioSueldoHombres += sueldos[i];
                } else {
                    mujeresQueTrabajan++;
                    promedioSueldoMujeres += sueldos[i];
                }
            }
        }
        promedioSueldoHombres /= hombresQueTrabajan;
        promedioSueldoMujeres /= mujeresQueTrabajan;

        // Imprimir los resultados
        System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("Porcentaje de hombres que trabajan: " + ((float) hombresQueTrabajan / n) * 100 + "%");
        System.out.println("Sueldo promedio de hombres que trabajan: $" + promedioSueldoHombres);
        System.out.println("Porcentaje de mujeres que trabajan: " + ((float) mujeresQueTrabajan / n) * 100 + "%");
        System.out.println("Sueldo promedio de mujeres que trabajan: $" + promedioSueldoMujeres);
    }   
}