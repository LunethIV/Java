
package cursojava;


public class Ejercicio3 {


    public static void main(String[] args) {
       int contador = 0;
        
        for (int i = 0; i < 100; i++){
            int aleatorio = (int) (Math.random() * (2000-1+1) + 1);
            if (aleatorio % 2 != 0 && aleatorio % 3 != 0 && aleatorio % 5 != 0 && aleatorio % 7 != 0){
                contador++;            
            }
        }
        System.out.println("No son divisores: " + contador);
    }   
}
