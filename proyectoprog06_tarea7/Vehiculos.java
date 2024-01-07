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
        int[] tipo = new int[20];
        double[] valorComercial = new double[20];
        double valorFinal = 0.0d;
        
        // Leemos los datos de entrada
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            tipo[i] = Introducir.tresOpciones("Introduce el tipo del vehículo " + (i + 1) + ": ");
            System.out.println("Introduce el valor comercial del vehículo " + (i + 1) + ": ");
            valorComercial[i] = sc.nextDouble();
        }

        // Calculamos el valor final de cada vehículo
        for (int i = 0; i < 20; i++) {

            // Calculamos el IVA
            double iva = 0;
            if (valorComercial[i] > 35000) {
                iva = 0.3;
            } else {
                iva = 0.21;
            }

            // Calculamos el descuento por tipo
            double descuentoTipo = 0;
            if (tipo[i] == 1 && valorComercial[i] <= 15000) {
                descuentoTipo = iva / 2;
            }

            // Calculamos el sobrecosto por impuesto de rodamiento
            double sobrecosto = 0;
            if (tipo[i] == 2 || tipo[i] == 3 && valorComercial[i] > 30000) {
                sobrecosto = 0.05;
            }

            // Calculamos el descuento adicional
            double descuentoAdicional = 0;
            if (valorComercial[i] < 20000) {
                descuentoAdicional = 0.05 * valorComercial[i];
            }

            // Calculamos el valor final
             valorFinal = valorComercial[i] * (1 + iva) - descuentoTipo + sobrecosto - descuentoAdicional;

            // Guardamos el valor final en la matriz
            valorComercial[i] = valorFinal;
        }

        // Mostramos los resultados
        System.out.println("| Tipo | Valor comercial | Valor final |");
        System.out.println("|---|---|---|");
        
        for (int i = 0; i < 20; i++) {
            System.out.printf("| %d | %.2f | %.2f |%n", tipo[i], valorComercial[i], valorFinal);
        }
    }
}