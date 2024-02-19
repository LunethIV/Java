
package paqueteOtros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Fecha {
    
    public static String fechaFormateada(LocalDate fecha){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        return fecha.format(formato);
    }
}
