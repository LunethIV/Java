
package paqueteJerarquia;

import java.time.LocalDate;

public class EmpleadoComisiones extends Empleado{
    
    // Atributos
    protected float ventas;
    protected static int COMISION_VENTAS = 10;
    
    // Constructor
    public EmpleadoComisiones(float ventas,Object object,String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws Exception{
        super(object,nombre,apellidos,fechaNac,fechaTrabajo);
        this.ventas = ventas;
        if(ventas < 0){
            throw new Exception("Error, las ventas deben ser positivas");
        }
    }
    
    // Metodos
    @Override
    public float calculaSueldo(){
        this.sueldo = (this.ventas * EmpleadoComisiones.COMISION_VENTAS)/100.0f;
                
        return sueldo;
    }
    
    @Override
    public String toString(){
       return super.toString()+"Ventas: "+ventas;
    }

    public final float getVentas() {
        return ventas;
    }

    public static int getCOMISION_VENTAS() {
        return COMISION_VENTAS;
    }

    public final void setVentas(float ventas)throws Exception {
        if(ventas < 0){
            throw new Exception("Error, las ventas deben ser positivas");
        }
        this.ventas = ventas;
    }

    public static void setCOMISION_VENTAS(int COMISION_VENTAS) {
        EmpleadoComisiones.COMISION_VENTAS = COMISION_VENTAS;
    }
}
