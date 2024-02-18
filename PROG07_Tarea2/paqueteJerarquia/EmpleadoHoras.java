
package paqueteJerarquia;

import java.time.LocalDate;
import paqueteOtros.Nie;
import paqueteOtros.Nif;

public class EmpleadoHoras extends Empleado{
    
    // Atributos
    protected static int numHoras;
    protected static int PAGO_HORA = 10;
    protected static int PAGO_EXTRA = 20;
    
    // Constructores
    public EmpleadoHoras(int numHoras, Nif nif, Nie nie, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo)throws IllegalArgumentException{
        super(nif,nie,nombre,apellidos,fechaNac,fechaTrabajo);
        EmpleadoHoras.numHoras = numHoras;
        if(numHoras < 0){
            throw new IllegalArgumentException("Error, el número de horas no puede ser negativo");
        }
    }
    
    // Métodos   
    @Override
    public int calculaSueldo(){
        if(numHoras > 40){
         return PAGO_HORA * 40 + (numHoras - 40) * PAGO_EXTRA;
        }else{
            return PAGO_HORA * numHoras;
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+" NumHorasTrabajadas: "+EmpleadoHoras.numHoras;
    }

    public static void setNumHoras(int numHoras)throws IllegalArgumentException {
        if(numHoras < 0){
            throw new IllegalArgumentException("Las horas deben ser positivas");
        }
        EmpleadoHoras.numHoras = numHoras;
    }

    public static void setPAGO_HORA(int PAGO_HORA) {
        EmpleadoHoras.PAGO_HORA = PAGO_HORA;
    }

    public static void setPAGO_EXTRA(int PAGO_EXTRA) {
        EmpleadoHoras.PAGO_EXTRA = PAGO_EXTRA;
    }

    public static int getNumHoras()throws IllegalArgumentException {
        if(numHoras < 0){
            throw new IllegalArgumentException("Las horas deben ser 0 positivas");
        }
        return numHoras;
    }

    public static int getPAGO_HORA() {
        return PAGO_HORA;
    }

    public static int getPAGO_EXTRA() {
        return PAGO_EXTRA;
    }
    
}
