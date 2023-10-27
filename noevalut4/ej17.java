package noevalut4;

// @author Lun
//Se desea realizar el algoritmo que resuelva el siguiente problema:
//Cálculo del salario semanal de un empleado de una empresa, sabiendo que
//éste se calcula en base a las horas semanales trabajadas y de acuerdo a un
//precio especificado por cada hora. Si se pasa de 40 horas semanales, las
//horas extraordinarias se pagarán a razón de 1.5 veces la hora ordinaria.
import java.util.Scanner;
public class ej17 {

public static void main(String[] args) {
        // Declaramos las variables
        int horasTrabajadas;
        double precioHora;
        double sueldoOrdinario;
        double sueldoExtra;
        double sueldoTotal;

        // Leemos las horas trabajadas
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = sc.nextInt();

        // Leemos el precio por hora
        System.out.print("Ingrese el precio por hora: ");
        precioHora = sc.nextDouble();

        // Calculamos el sueldo ordinario
        sueldoOrdinario = horasTrabajadas * precioHora;

        // Calculamos el sueldo extra
        if (horasTrabajadas > 40) {
            sueldoExtra = (horasTrabajadas - 40) * precioHora * 1.5;
        } else {
            sueldoExtra = 0;
        }

        // Calculamos el sueldo total
        sueldoTotal = sueldoOrdinario + sueldoExtra;

        // Imprimimos el sueldo total
        System.out.println("El sueldo semanal es: " + sueldoTotal + "€");
    }
}