

//@author Lun

package paquete8;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
    
        do {
            MiClase.subrayado();
            MiClase.menu();
            opcion = MiClase.enteroEntre("Opcion (1-5)", 1, 5);
            
            while (opcion < 1 || opcion > 5) {
                System.out.println("Error, introduce un número del 1 al 5");
                opcion = sc.nextInt();
            }
            
            switch(opcion){
                case 1 -> MiClase.sumar();
                case 2 -> MiClase.restar();
                case 3 -> MiClase.multiplicar();
                case 4 -> MiClase.dividir();
                default -> System.out.println("Fin de programa");
            }
        }while(opcion != 5);
    }
}
