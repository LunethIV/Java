//Mostrar por pantalla el abecedario en castellano en mayúsculas y minúsculas. De
//forma que cuando aparezca por ejemplo, ‘A’ también lo haga la ‘a’.

//@author Lun

package paquete2;

public class EjB {

    public static void main(String[] args) {
      
        // Declarar variable para almacenar letra
        char letraMayus;
        char letraMinus;
        
        // Mostrar mayúcula y minúscula
        for (int i = 65; i <= 90; i++){
            letraMayus = (char) i;
            letraMinus = (char) (i + 32);
            System.out.println(letraMayus + " " + letraMinus);
        }
    }
}
