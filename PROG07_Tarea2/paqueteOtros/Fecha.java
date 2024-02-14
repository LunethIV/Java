
package paqueteOtros;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Fecha {
    
    public static String fechaFormateada(LocalDate fecha){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
        
        return formatoFecha.format(fecha);
    }
}
