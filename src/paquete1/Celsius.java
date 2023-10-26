


// @author Lun

package paquete1;
import java.util.Scanner;
public class Celsius {


    public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);

        // Declaramos variables para almacenar las temperaturas
        double temperaturaCelsius = 0;
        double temperaturaFahrenheit;

        // Pedimos las temperaturas
        for (int i = 1; i <= 7; i++) {
            System.out.println("Introduce la temperatura del día " + i + " en grados Celsius:");
            temperaturaCelsius = sc.nextDouble();

            // Calculamos la temperatura en grados Fahrenheit
            temperaturaFahrenheit = (9.0 / 5) * temperaturaCelsius + 32;

            // Mostramos los resultados
            System.out.println("Temperatura del día " + i + " en grados Celsius: " + temperaturaCelsius);
            System.out.println("Temperatura del día " + i + " en grados Fahrenheit: " + temperaturaFahrenheit);
        }

        // Calculamos la temperatura media en grados Celsius
        double temperaturaMediaCelsius = 0;
        for (int i = 1; i <= 7; i++) {
            temperaturaMediaCelsius += temperaturaCelsius;
        }
        temperaturaMediaCelsius /= 7;

        // Calculamos la temperatura media en grados Fahrenheit
        double temperaturaMediaFahrenheit = (9.0 / 5) * temperaturaMediaCelsius + 32;

        // Mostramos los resultados
        System.out.println("Temperatura media en grados Celsius: " + temperaturaMediaCelsius);
        System.out.println("Temperatura media en grados Fahrenheit: " + temperaturaMediaFahrenheit);
    }
}