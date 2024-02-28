
package paqueteJerarquia;

import java.time.LocalDate;

public class EmpleadoHoras extends Empleado{
    
    // Atributos
    protected int numHoras;
    protected static int PAGO_HORA = 20;
    protected static int PAGO_EXTRA = 10;
    
    // Constructor
    public EmpleadoHoras(int numHoras,Object object,String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo)throws Exception{
        super(object,nombre,apellidos,fechaNac,fechaTrabajo);
        this.numHoras = numHoras;
        if(numHoras < 0){
            throw new Exception("Error, las horas deben ser positivas");
        }
    }
    
    // Metodos
    /*calculaSueldo, que devuelve el sueldo del empleado, que sería el sueldo en
      función del el número de horas trabajadas semanal, y si hubiera horas extras (mayor
      que 40), se incrementa en función del valor del PAGO_EXTRA*/
    @Override
    public float calculaSueldo(){
        if(numHoras > 40){
            return this.sueldo = EmpleadoHoras.PAGO_HORA * 40 + ((numHoras - 40) * PAGO_EXTRA);
        }else{
            return numHoras * PAGO_HORA;
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+"NumHoras: "+numHoras;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public static int getPAGO_HORA() {
        return PAGO_HORA;
    }

    public static int getPAGO_EXTRA() {
        return PAGO_EXTRA;
    }

    public void setNumHoras(int numHoras)throws Exception {
        if(numHoras < 0){
            throw new Exception("Error, las horas deben ser 0 o positivas");
        }
        this.numHoras = numHoras;
    }

    public static void setPAGO_HORA(int PAGO_HORA) {
        EmpleadoHoras.PAGO_HORA = PAGO_HORA;
    }

    public static void setPAGO_EXTRA(int PAGO_EXTRA) {
        EmpleadoHoras.PAGO_EXTRA = PAGO_EXTRA;
    }
    
    
}