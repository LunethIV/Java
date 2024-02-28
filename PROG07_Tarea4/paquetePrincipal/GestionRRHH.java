
package paquetePrincipal;
import java.util.ArrayList;
import paqueteJerarquia.*;
import paqueteOtros.*;

public class GestionRRHH {
    
    // Atributos
    private String empresa;
    private ArrayList<Empleado> empleados;
    
    // Constructores
    public GestionRRHH(String empresa){
        this.empresa = empresa;
        this.empleados = new ArrayList<Empleado>();
    }
    
    public GestionRRHH(String empresa, ArrayList<Empleado> empleados){
        this.empresa = empresa;
        this.empleados = empleados;
    }
    
    // Metodos
    public boolean existeEmpleado(Empleado empleado){
        return empleados.contains(empleado);
    }
    
    public void addEmpleado(Empleado empleado){
        if(!empleados.contains(empleado)){
            empleados.add(empleado);
        }else{
            System.out.println("El empleado ya existe");
        }
    }
    
    public void despedirEmpleado(Empleado empleado){
        if(empleados.contains(empleado)){
            empleados.remove(empleado);
        }else{
            System.out.println("El empleado no está en el array");
        }
    }
    
    public float sueldoSemanalPlantilla(){
        float total = 0.0f;
        
        for(Empleado empleado:empleados){
            total += empleado.calculaSueldo();
        }
        
        return total;
    }
    
    public void listadoOrganizadoPlantilla(){
        System.out.println("-----EMPLEADOS FIJOS-----");
        
        for(Empleado empleado:empleados){
            if(empleado instanceof EmpleadoFijo){
                System.out.println("-"+empleado);
            }
        }
        
        System.out.println("-----EMPLEADOS HORAS-----");
        for(Empleado empleado:empleados){
            if(empleado instanceof EmpleadoHoras){
                System.out.println("-"+empleado);
            }
        }
        
        System.out.println("-----EMPLEADOS COMISIONES-----");
        for(Empleado empleado:empleados){
            if(empleado instanceof EmpleadoComisiones){
                System.out.println("-"+empleado);
            }
        }
    }
    
    public void listadoAntiguedadPlantilla(){
        
        for(Empleado empleado:empleados){
            System.out.println("Nombre: "+empleado.getNombre()+"\nApellidos: "+empleado.getApellidos()+"\n TiempoEmpresa: "+empleado.tiempoEmpresa());
        }
    }
    
    @Override
    public String toString(){
        String cadena = "Empresa: "+empresa;
        
        if(empleados.isEmpty()){
            cadena += " SIN EMPLEADOS";
        }else{
            for(Empleado empleado:empleados){
                cadena+="\n"+empleado;
            }
        }
        return cadena;
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

        public boolean busquedaEmpleadoID(Object object)throws Exception{
        if(object == null){
            throw new Exception("ERROR, NO PUEDE SER NULL");
        }
        if(!(object instanceof Nif) && !(object instanceof Nie)){
            throw new Exception("ERROR, DEBE SER NIF O NIE");
        }
        
        boolean encontrado = false;
        if(object instanceof Nif){
            Nif nif = (Nif) object;
            for(Empleado empleado:empleados){
                if(empleado.getNif()!= null && empleado.getNif().equals(nif)){
                    encontrado = true;
                    break;
                }
            }
        }else{
            if(object instanceof Nie){
                Nie nie = (Nie) object;
                for(Empleado empleado:empleados){
                    if(empleado.getNie()!= null && empleado.getNie().equals(nie)){
                        encontrado = true;
                        break;
                    }
                }
            }
        }
        return encontrado;
    }
    
    public Empleado devuelveEmpleado(Object object)throws Exception{
        if(object == null){
            throw new Exception("ERROR, NO PUEDE SER NULL");
        }
        if(!(object instanceof Nif) && !(object instanceof Nie)){
            throw new Exception("ERROR, DEBE SER NIF O NIE");
        }
        Empleado e1 = null;
        
        if(object instanceof Nif){
            Nif nif = (Nif) object;
            for(Empleado e:empleados){
                if(e.getNif()!= null && e.getNif().equals(nif)){
                    e1 = e;
                    break;
                }
            }
        }else{
            if(object instanceof Nie nie){
                for(Empleado e:empleados){
                    if(e.getNie() != null && e.getNie().equals(nie)){
                        e1 = e;
                        break;
                    }
                }
            }
        }
        return e1;
    }
    
    public int sumaVentasEmpleados(){
        int suma = 0;
        for(Empleado e:empleados){
            if(e instanceof EmpleadoComisiones empleadoC){
              suma += empleadoC.getVentas();
            }
        }
        return suma;
    }
    
    public void ListaEmpleadosExtras(){
        
        for(Empleado e:empleados){
            if(e instanceof EmpleadoHoras empleadoHoras){
              int resta = empleadoHoras.getNumHoras() - 40;
              if(resta > 0){
                  System.out.println("-"+e);
              }
            }
        }
    }
    
    public void ListaEmpleadosFijosTrienios(){
        int trienios = 0;
        
        for(Empleado e:empleados){
            if(e instanceof EmpleadoFijo empleadoFijo){
                trienios += empleadoFijo.trienios();
                if(trienios > 0){
                    System.out.println("-"+e);
                }
            }
        }
    }
}