
package paqueteJerarquia;
import java.time.Period;
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
    public int trienios(){
        Period numAños = Period.between(this.fechaTrabajo,LocalDate.now());
        
        return numAños.getYears() / 3;
    }
 
    @Override
    public int calculaSueldo() {
        return EmpleadoFijo.SALARIO_SEMANAL * this.trienios();
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
