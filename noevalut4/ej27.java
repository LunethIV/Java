//Diseña un algoritmo que calcule el salario bruto, impuesto
//aplicado y salario neto de un trabajador en función del número de horas
//trabajadas, precio por hora y la tasa de impuestos de acuerdo a las
//siguientes hipótesis:
//a. Las primeras 35 horas se pagan a tarifa normal.
//b. Las horas que pasen de 35 se pagan a 1.5 veces la tarifa normal.
//c. Las tasas de impuestos son:
//c.i. Los primeros 100 euros son libres de impuestos.
//c.ii. Los siguientes 100 euros tienen un 10% de impuestos.
//c.iii. Los restantes un 25% de impuestos

 // @author Lun

package noevalut4;
import java.util.Scanner;
public class ej27 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // variables
        int horasTrabajadas;
        double salarioBruto, salarioNeto, salarioHora, impuesto;
        
        // Leer
        System.out.println("Introducir horas trabajadas");
                horasTrabajadas = sc.nextInt();
        System.out.println("Introducir salario por hora");
                salarioHora = sc.nextDouble();
                
        // calcular salario bruto
        if (horasTrabajadas < 35)
            salarioBruto = horasTrabajadas * salarioHora;
        else
            salarioBruto = 35 * salarioHora + (horasTrabajadas - 35) * salarioHora * 1.5;
        
        // Calcular impuestos
        impuesto = 0;
        
        if (salarioBruto > 100 && salarioBruto <= 200)
            impuesto = 10;
        else if (salarioBruto > 200)
            impuesto = salarioBruto * 0.25;
            
        salarioNeto = salarioBruto - impuesto;
        
        System.out.println("Impuestos: " + impuesto + "€");
    }
    
}
