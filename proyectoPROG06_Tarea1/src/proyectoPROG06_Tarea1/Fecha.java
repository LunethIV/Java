
package proyectoPROG06_Tarea1;

public class Fecha {
    
    public static boolean bisiesto (int año){
        return año % 4 == 0 && (año % 100 != 0 || año % 400 == 0);
    }
}
