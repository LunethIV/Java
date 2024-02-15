
package paqueteJerarquia;

import java.time.LocalDate;
import paqueteOtros.Nie;
import paqueteOtros.Nif;

public class EmpleadoFijo extends Empleado {
    
    // Atributos
    protected static int SALARIO_SEMANAL = 500;
    protected static int INCREMENTO_TRIENIO = 20;
    
    // Constructor
    public EmpleadoFijo(Nif nif, Nie nie, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo){
        super(nif,nie,nombre,apellidos,fechaNac,fechaTrabajo);
    }
    
    // Métodos públicos
    public int trienios(int numAños){
        return numAños / 3;
    }
 
    public int calculaSueldo(int numAños){
        return super.sueldo = EmpleadoFijo.SALARIO_SEMANAL + trienios(numAños) * EmpleadoFijo.INCREMENTO_TRIENIO;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
