//a) Muestra el abecedario en español en minúsculas.

//@author Lun

package paquete2;

public class EjA {

    public static void main(String[] args) {
      
        // Declarar variable para almacenar letra
        char letra;
        
        // Mostrar el abecedario en minuscula
        for (int i = 97; i <= 122; i++){
            letra = (char) i;
            System.out.println(letra);
        }
    }
}
