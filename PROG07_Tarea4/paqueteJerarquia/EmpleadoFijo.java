
package paqueteJerarquia;

import java.time.LocalDate;
import java.time.Period;

public class EmpleadoFijo extends Empleado{
    
    // Atributos
    protected static int SALARIO_SEMANAL = 500;
    protected static int INCREMENTO_TRIENIO = 20;
    
    // Constructor
    public EmpleadoFijo(Object object,String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws Exception{
        super(object,nombre,apellidos,fechaNac,fechaTrabajo);
    }
    
    
    /*trienios: devuelve el número de trienios que el empleado está en la empresa:
      número de años / 3.*/
    public int trienios(){
        int aux = Period.between(fechaTrabajo, LocalDate.now()).getYears();
        
        return aux / 3;
    }
    
    /*calculaSueldo, que devuelve el sueldo del empleado, que sería el sueldo
      semanal incrementado por el valor del complemento por los trienios.*/
    @Override
    public float calculaSueldo(){
        return this.sueldo = EmpleadoFijo.SALARIO_SEMANAL + (EmpleadoFijo.INCREMENTO_TRIENIO*trienios());
    }
    
    @Override
    public String toString(){
        return super.toString();
    }

    // Getters y Setters
    public static int getSALARIO_SEMANAL() {
        return SALARIO_SEMANAL;
    }

    public static int getINCREMENTO_TRIENIO() {
        return INCREMENTO_TRIENIO;
    }

    public static void setSALARIO_SEMANAL(int SALARIO_SEMANAL) {
        EmpleadoFijo.SALARIO_SEMANAL = SALARIO_SEMANAL;
    }

    public static void setINCREMENTO_TRIENIO(int INCREMENTO_TRIENIO) {
        EmpleadoFijo.INCREMENTO_TRIENIO = INCREMENTO_TRIENIO;
    }
}
