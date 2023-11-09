
package proyectoPROG06_Tarea1;

public class Ej1 {

 
    public static void main(String[] args) {
        
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        
        int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
        
        for (int i = 0; i < dias.length; i++){           
            
            if (dias[i] % 2 == 0){
                System.out.println("El mes " + meses[i] + " tiene días pares");
            }
        }
    }   
}
