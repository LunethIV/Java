
package proyectoprog06_tarea2;

public class Fecha {
    public static boolean esBisiesto (int año){
        return año % 4 == 0 && (año % 100 != 0 || año % 400 == 0);
    }
}
