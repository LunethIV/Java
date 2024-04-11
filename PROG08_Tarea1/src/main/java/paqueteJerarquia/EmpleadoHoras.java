
package paqueteJerarquia;

import java.time.LocalDate;
import paqueteExcepciones.*;
import paqueteInterfaces.*;

public class EmpleadoHoras extends Empleado implements Comparable, Incentivable {
    
    // Atributos
    protected static int PAGO_HORA = 10;
    protected static int PAGO_EXTRA = 20;
    protected int numHoras;
    protected boolean incentivado = false;
    
    // Constructor
    public EmpleadoHoras(int numHoras,Object object, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws IdException, NumHorasException{
        super(object,nombre,apellidos,fechaNac,fechaTrabajo);
        this.numHoras = numHoras;
        
        if(numHoras < 0){
            throw new NumHorasException("ERROR, LAS HORAS DEBEN SER POSITIVAS");
        }
    }
    
    @Override
    public float calculaSueldo(){
        if(numHoras <= 40){
            return this.sueldo = PAGO_HORA * numHoras;
        }else{
            return this.sueldo = PAGO_HORA * 40 + (numHoras - 40 * PAGO_EXTRA) ;
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nNumHoras: "+numHoras;
    }

    public static int getPAGO_HORA() {
        return PAGO_HORA;
    }

    public static int getPAGO_EXTRA() {
        return PAGO_EXTRA;
    }

    public int getNumHoras() throws NumHorasException{
        if(numHoras < 0){
            throw new NumHorasException("Error, las horas deben ser positivas");
        }
        return numHoras;
    }

    public static void setPAGO_HORA(int PAGO_HORA) {
        EmpleadoHoras.PAGO_HORA = PAGO_HORA;
    }

    public static void setPAGO_EXTRA(int PAGO_EXTRA) {
        EmpleadoHoras.PAGO_EXTRA = PAGO_EXTRA;
    }

    public void setNumHoras(int numHoras) throws NumHorasException{
        if(numHoras < 0){
            throw new NumHorasException("Error, las horas deben ser positivas");
        }
        this.numHoras = numHoras;
    }
    
    public boolean isIncentivado(){
        return this.incentivado = true;
    }
    
    @Override
    public void premiar(){
        System.out.println("GRAN PREMIO POR HORAS TRABAJADAS a "+getNombre()+" "+getApellidos());
    }
    
    @Override
    public void incentivar(float x){
        int extras = this.numHoras - 40;
        
        if(extras > x){
            this.sueldo += (this.sueldo * 0.03);
            incentivado = true;
        }
    }
    
    
    @Override
    public int compareTo(Object ob) {
        if(this.numHoras > ((EmpleadoHoras)ob).numHoras){
            return 1;
        }else if(this.numHoras == ((EmpleadoHoras)ob).numHoras){
            return 0;
        }else{
            return -1;
        }
    }
}