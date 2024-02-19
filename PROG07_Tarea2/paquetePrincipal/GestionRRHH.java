
package paquetePrincipal;
import java.util.ArrayList;
import paqueteJerarquia.*;
import paqueteOtros.*;

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
    
    public boolean busquedaEmpleadoNif(Nif nif){
        for(Empleado empleado:empleados){
            if(empleado.getNif() != null && empleado.getNif().equals(nif)){
                return true;
            }
        }
        return false;
    }
    
    public boolean busquedaEmpleadoNie(Nie nie){
        
        for(Empleado empleado:empleados){
            if(empleado.getNie() != null && empleado.getNie().equals(nie)){
                return true;
            }
        }
        return false;
    }
    
    public void listadoOrganizadoPlantilla(){
        ArrayList<Empleado> empleadosFijos = new ArrayList<>();
        ArrayList<Empleado> empleadosHoras = new ArrayList<>();
        ArrayList<Empleado> empleadosComisiones = new ArrayList<>();
        
        for(Empleado empleado:empleados){
            if(empleado instanceof EmpleadoFijo){
                empleadosFijos.add(empleado);               
            }else if(empleado instanceof EmpleadoHoras){
                empleadosHoras.add(empleado);
            }else{
                empleadosComisiones.add(empleado);
            }
        }
        
        if(!empleadosFijos.isEmpty()){
            
            for(Empleado empleado:empleadosFijos){
            
             System.out.println("EmpleadosFijos: "+empleado.getNombre());
            }
        }
        
        if(!empleadosHoras.isEmpty()){
            for(Empleado empleado:empleadosHoras){
            
                System.out.println("EmpleadoHoras: "+empleado.getNombre());
            }
        }

        if(!empleadosComisiones.isEmpty()){
            for(Empleado empleado:empleadosComisiones){
            
                System.out.println("EmpleadoComisiones: "+empleado.getNombre());
            }    
        }
    }

    public void listadoAntiguedadPlantilla(){
        for(Empleado empleado:empleados){
            System.out.println("Nombre: "+empleado.getNombre()+
            "\nApellidos: "+empleado.getApellidos()+
            "\nTiempo en la empresa: "+empleado.tiempoEmpresa());
        }
    }
    
    @Override
    public String toString(){
        String info = "Empresa: "+ empresa;
        if(empleados.isEmpty()){
            info += " SIN EMPLEADOS";
        }else{
            for(Empleado empleado:empleados){
                info += "\n" + empleado.toString();
            }
        }
        return info;
    }

    public String getEmpresa() {
        return empresa;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}