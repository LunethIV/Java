
package proyectoPROG06_Tarea1;

public class Ej2 {

    public static void main(String[] args) {
         
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        
         int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
         int total = 0;
         for ( int i = 0; i < 5; i++){
             
             total += dias[i];
         }
         System.out.println("Han transcurrido " + total + " días de enero hasta junio");
    }
    
}
