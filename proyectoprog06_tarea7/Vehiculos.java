/*
Escriba un algoritmo que a partir de leer y
almacenar en vectores el valor comercial de 20 vehículos y el tipo
(familiar (1), público (2), de carga (3)), calcule y muestre su valor
final con base en: (guardar una matriz de 20 filas, 3 columnas (1 para
el tipo, otra para el valor comercial):

1. Para vehículos de valor superior a 35.000€, cobrar IVA de 30%,
para los demás el IVA es del 21%

2. Para vehículos tipo 1, con valor hasta 15.000€, aplicar
descuento equivalente al 50% del IVA cobrado

3. Para vehículos tipo 2 y 3, con valor superior a 30.000€, aplicar
sobrecosto por impuesto de rodamiento del 5%

4. Para todos los vehículos, si el valor final es inferior a 20.000€,
aplicar descuento adicional del 5% del valor comercial.
*/

import java.util.Scanner;

public class Vehiculos {

    public static void main(String[] args) {        

        // Declaramos los vectores para almacenar los datos
        int[][] vehiculos = new int[20][3];
        double valorFinal = 0.0d;
        
        // Leemos los datos de entrada
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            vehiculos[i][0] = Introducir.tresOpciones("Introduce el tipo del vehículo " + (i + 1) + ": ");
            System.out.println("Introduce el valor comercial del vehículo " + (i + 1) + ": ");
            vehiculos[i][1] = sc.nextInt();
        }

        // Calculamos el valor final de cada vehículo
        for (int i = 0; i < 20; i++) {

            // Calculamos el IVA
            double iva = 0;
            if (vehiculos[i][0] > 35000) {
                iva = 0.3;
            } else {
                iva = 0.21;
            }

            // Calculamos el descuento por tipo
            double descuentoTipo = 0;
            if (vehiculos[i][1] == 1 && vehiculos[i][0] <= 15000) {
                descuentoTipo = iva / 2;
            }

            // Calculamos el sobrecosto por impuesto de rodamiento
            double sobrecosto = 0;
            if (vehiculos[i][1] == 2 || vehiculos[i][1] == 3 && vehiculos[i][0] > 30000) {
                sobrecosto = 0.05;
            }

            // Calculamos el descuento adicional
            double descuentoAdicional = 0;
            if (vehiculos[i][0] < 20000) {
                descuentoAdicional = 0.05 * vehiculos[i][0];
            }

            // Calculamos el valor final
             valorFinal = vehiculos[i][0] * (1 + iva) - descuentoTipo + sobrecosto - descuentoAdicional;    
             
             // Mostramos el valor final
            System.out.println("El valor final del vehículo " + (i + 1) + " es de " + valorFinal + "€.");
        }
    }
}