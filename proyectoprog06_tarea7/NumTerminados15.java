/*
Leer 10 números enteros, almacenarlos
en un vector y determinar cuántos números de los almacenados en
dicho vector terminan en 15
 */

public class NumTerminados15 {

    public static void main(String[] args) {
       
        int[] v = new int[10];        
        for(int i = 0; i < v.length; i++){
            v[i] = Introducir.entero("Introduce el valor de la posición " + i);
        }
        
        int cantidad15 = 0;
        for(int i = 0; i < v.length; i++){
            if(v[i] % 15 == 0){
                cantidad15++;
            }
        }
        System.out.println("La cantidad de números acabados en 15 es: " + cantidad15);
    }   
}