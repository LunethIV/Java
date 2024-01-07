/*
Leer 10 números enteros, almacenarlos en un
vector y calcularle el factorial a cada uno de los números leídos
almacenándolos en otro vector
 */


public class Factorial {

    public static void main(String[] args) {
        int[] v = new int[10];
        
        for(int i = 0; i < v.length; i++){
            v[i] = Introducir.entero("Introduce el valor de la posición" + i);
        }
        
        // Calcular el factorial
        int[] factoriales = new int[10];
        for(int i = 0; i < v.length; i++){
            factoriales[i] = Introducir.factorial(v[i]);
        }
        
        // Imprimimos los factoriales
        for (int i = 0; i < factoriales.length; i++) {
            System.out.println("El factorial de " + v[i] + " es " + factoriales[i]);
        }
    }
}
