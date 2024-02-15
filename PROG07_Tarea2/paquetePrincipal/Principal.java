
package paquetePrincipal;

import java.time.LocalDate;
import paqueteOtros.*;
import paqueteJerarquia.*;
public class Principal {


    public static void main(String[] args) {
        GestionRRHH a = new GestionRRHH("Empresa");
        EmpleadoFijo e = new EmpleadoFijo(new Nif("75941838R"), null, "sd", "gf", LocalDate.now(), LocalDate.now());
        
        a.addEmpleado(e);
        
        
        
        e.calculaSueldo(3);
        System.out.println("Sueldo: "+a.sueldoSemanalPlantilla());
    }   
}
