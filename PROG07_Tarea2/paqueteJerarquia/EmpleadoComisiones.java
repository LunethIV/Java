
package paqueteJerarquia;

import java.time.LocalDate;
import paqueteOtros.Nie;
import paqueteOtros.Nif;

public class EmpleadoComisiones extends Empleado{
    
    // Atributos
    protected static float ventas;
    protected static int COMISION_VENTAS = 10;
    
    // Constructores
    public EmpleadoComisiones(float ventas, Nif nif, Nie nie, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo){
        super(nif,nie,nombre,apellidos,fechaNac,fechaTrabajo);
        EmpleadoComisiones.ventas = ventas;
    }
    

    @Override
    public int calculaSueldo(){
       return super.sueldo = (int)EmpleadoComisiones.ventas * EmpleadoComisiones.COMISION_VENTAS;
    }
    
    @Override
    public String toString(){
        return super.toString()+" Ventas"+EmpleadoComisiones.ventas;
    }

    public static float getVentas()throws IllegalArgumentException {
        if(ventas < 0){
            throw new IllegalArgumentException("Las ventas deben ser 0 positivas");
        }
        return ventas;
    }

    public static int getCOMISION_VENTAS() {
        return COMISION_VENTAS;
    }

    public static void setVentas(float ventas)throws IllegalArgumentException {
        if(ventas < 0){
            throw new IllegalArgumentException("Las ventas deben ser 0 positivas");
        }
        EmpleadoComisiones.ventas = ventas;
    }

    public static void setCOMISION_VENTAS(int COMISION_VENTAS) {
        EmpleadoComisiones.COMISION_VENTAS = COMISION_VENTAS;
    }  
}
