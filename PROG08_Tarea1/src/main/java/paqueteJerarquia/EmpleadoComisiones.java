
package paqueteJerarquia;

import java.time.LocalDate;
import paqueteExcepciones.*;
import paqueteInterfaces.*;

public class EmpleadoComisiones extends Empleado implements Incentivable, Comparable{
    
    // Atributos
    protected float ventas;
    protected static int COMISION_VENTAS = 10;
    protected boolean incentivado = false;
    
    // Constructor
    public EmpleadoComisiones(float ventas,Object object, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws IdException, VentasException{
        super(object,nombre,apellidos,fechaNac,fechaTrabajo);
        this.ventas = ventas;
       
        if(ventas < 0) {
            throw new VentasException("Error, las ventas deben ser positivas");
        }
    }
    
    // Metodos
    @Override
    public float calculaSueldo(){
        return this.sueldo = ventas * COMISION_VENTAS;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nVentas: "+ventas;
    }

    public final float getVentas() throws VentasException{
        if(ventas <= 0){
            throw new VentasException("Las ventas deben ser 0 o positivas");
        }
        return ventas;
    }

    public static int getCOMISION_VENTAS() {
        return COMISION_VENTAS;
    }

    public final void setVentas(float ventas) throws VentasException{
        if(ventas <= 0){
            throw new VentasException("Las ventas deben ser 0 o positivas");
        }
        this.ventas = ventas;
    }

    public static void setCOMISION_VENTAS(int COMISION_VENTAS) {
        EmpleadoComisiones.COMISION_VENTAS = COMISION_VENTAS;
    }
    
    public boolean isIncentivado(){
        return this.incentivado = true;
    }
    
    @Override
    public void premiar(){
        System.out.println("GRAN PREMIO POR VENTAS REALIZADAS a "+getNombre()+" "+getApellidos());
    }
    
    @Override
    public void incentivar(float x){
        if(this.ventas > x){
            this.sueldo += (this.sueldo * 0.03);
            this.incentivado = true;
        }
    }
    
    @Override
    public int compareTo(Object ob){
        if(this.ventas > ((EmpleadoComisiones)ob).ventas){
            return 1;
        }else if(this.ventas == ((EmpleadoComisiones)ob).ventas){
            return 0;
        }else{
            return -1;
        }
    }
}