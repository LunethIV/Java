


// @author Lun

package paquete5;

import java.util.Scanner;

public class Ej5_A {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor = 0;
        
        for (int i = 1; i <= 15; i++){
            System.out.println("Introduce el número " + i + ":");
            int num = sc.nextInt();
            
            mayor = num > mayor ? num : mayor;
        }
        System.out.println("El mayor número introducido es: " + mayor);
    }
}
