        /*(NumMayorPrimo.java) Leer 10 enteros, almacenarlos en un vector
        y determinar en qué posición del vector está el mayor número primo leído.*/

public class NumMayorPrimo {

    public static void main(String[] args) {
       

        int [] v = new int [10];
        int mayor = 0;
        int posicion = 0;
        
        for(int i = 0; i < 10; i++){
            v[i] = Introducir.entero("Introduce el valor " + i + " del indice");
        }
       
        for(int i = 0; i < v.length; i++){
            if(Introducir.esPrimo(v[i]) && v[i] > mayor){
                mayor = v[i];
                posicion = i;
            }
        }
        
        System.out.println("El mayor número es: " + mayor + " y se encuentra en la posición: " + posicion + " del vector");
    }
}