
package paquetePrincipal;
import java.util.ArrayList;
import paqueteJerarquia.*;

public class GestionRRHH {
    
    // Atributos
    private String empresa;
    private ArrayList<Empleado> empleados;
    
    // Constructor
    public GestionRRHH(String empresa){
        this.empresa = empresa;
        this.empleados = new ArrayList<>();
    }
    
    // Metodos
    public boolean existeEmpleado(Empleado empleado){
        return empleados.contains(empleado);
    }
    
    public void addEmpleado(Empleado empleado){
        if(!empleados.contains(empleado)){
            empleados.add(empleado);
        }else{
            System.out.println("El empleado ya está en el array");
        }
    }
    
    public void despedirEmpleado(Empleado empleado){
        if(empleados.contains(empleado)){
            empleados.remove(empleado);
        }else{
            System.out.println("El empleado no está en el array");
        }
    }
    
    public int sueldoSemanalPlantilla(){
        int salarioTotal = 0;
        for(Empleado empleado:empleados){
            salarioTotal += empleado.calculaSueldo();
        }
        return salarioTotal;
    }
}