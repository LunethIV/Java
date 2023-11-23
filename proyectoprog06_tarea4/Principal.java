
package proyectoprog06_tarea4;

import java.util.Scanner;
public class Principal {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("----CARTON GENERADO----");
        System.out.println("__________________________________________________");
        
       int[] numeros = Metodos.generar_carton(6);
       int[] almacenados = new int[6];
       
       System.out.println("Primera linea: " + numeros[0] + "  " + numeros[1]);
       System.out.println("Segunda linea: " + numeros[2] + "  " + numeros[3]);
       System.out.println("Tercera línea: " + numeros[4] + "  " + numeros[5]);
       System.out.println("__________________________________________________");
       
       boolean esBingo = false;
       boolean encontrado = false;
       
       while(!esBingo){
            System.out.println("Pulsa una tecla para jugar...");
            sc.nextLine();

            int azar = (int) (Math.random()* (10-1)+1);

            for (int i = 0; i < numeros.length; i++){
                    encontrado = false;
                    if (azar == numeros[i]){
                     almacenados[i] = azar;
                     encontrado = true;
                     System.out.println("Ya tienes: " + azar);
                     break;
                    }               
            }
            for(int i = 0; i < almacenados.length; i++){
                if(almacenados[i] == 0){
                    esBingo = false;
                    break;
                }
                esBingo = true;
                            }
            
            if (!encontrado){
                System.out.println("Ha salido: " + azar);
            }
       }
       System.out.println("BINGO!");

    }    
}
