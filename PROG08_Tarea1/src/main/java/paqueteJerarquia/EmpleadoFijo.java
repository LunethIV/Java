
package paqueteJerarquia;
import java.time.Period;
import java.time.LocalDate;
import paqueteExcepciones.*;

public class EmpleadoFijo extends Empleado{
    
    // Atributos
    protected static int SALARIO_SEMANAL = 500;
    protected static int INCREMENTO_TRIENIO = 200;
    
    // Constructor
    public EmpleadoFijo(Object object, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws IdException{
        super(object,nombre,apellidos,fechaNac,fechaTrabajo);
    }
    
    // Metodos
    public int trienios(){
        int tiempo = Period.between(fechaTrabajo,LocalDate.now()).getYears();
        
        return tiempo / 3;
    }
    
    @Override
    public float calculaSueldo(){
        return this.sueldo = EmpleadoFijo.SALARIO_SEMANAL += (EmpleadoFijo.INCREMENTO_TRIENIO * trienios());
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
    public static int getINCREMENTO_TRIENIO(){
        return EmpleadoFijo.INCREMENTO_TRIENIO;
    }

    public static int getSALARIO_SEMANAL() {
        return SALARIO_SEMANAL;
    }

    public static void setSALARIO_SEMANAL(int SALARIO_SEMANAL) {
        EmpleadoFijo.SALARIO_SEMANAL = SALARIO_SEMANAL;
    }

    public static void setINCREMENTO_TRIENIO(int INCREMENTO_TRIENIO) {
        EmpleadoFijo.INCREMENTO_TRIENIO = INCREMENTO_TRIENIO;
    }   
}
