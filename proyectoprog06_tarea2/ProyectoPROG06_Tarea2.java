
package proyectoprog06_tarea2;

public class ProyectoPROG06_Tarea2 {


    public static void main(String[] args) {
        
       int opcion;
        
       do{
           
            opcion = Introducir.entero("Introduce una opción de 1 a 9");
           
            while((opcion < 1 || opcion > 9) && opcion != 0){
               System.out.println("ERROR, INTRODUCE UN VALOR ENTRE 1 Y 9");
               opcion = Introducir.entero("Introduce un número de 1 a 9");
            }
           
            switch(opcion){
               case 1 -> Ejercicios.ej2();
               case 2 -> Ejercicios.ej3();
               case 3 -> Ejercicios.ej4();
               case 4 -> Ejercicios.ej5();
               case 5 -> Ejercicios.ej7();
               default -> System.out.println("FIN DE PROGRAMA");
            }         
        }while(opcion != 0);
    }
}