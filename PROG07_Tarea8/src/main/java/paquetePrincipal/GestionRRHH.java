
package paquetePrincipal;

import java.util.ArrayList;
import paqueteJerarquia.*;
import paqueteExcepciones.*;
import paqueteOtros.*;
import paqueteInterfaces.*;

public class GestionRRHH {
    
    // Atributos
    private String empresa;
    private ArrayList<Empleado> empleados;
    private ArrayList<Incentivable> incentivados;
    private ArrayList<Despedible> despedidos;
    
    // Constructor
    public GestionRRHH(String empresa){
        this.empresa = empresa;
        this.empleados = new ArrayList<>();
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
        if(empleados.contains(empleado)){
            System.out.println("El empleado introducido ya existe");
        }else{
            empleados.add(empleado);
        }
    }
    
    public void despedirEmpleado(Empleado empleado){
        if(empleados.contains(empleado)){
            empleado.despedir();
            despedidos.add(empleado);
            empleados.remove(empleado);
        }else{
            System.out.println("El empleado introducido no existe");
        }
    }
    
    public float sueldoSemanalPlantilla(){
        float total = 0.0f;
        
        for(Empleado e:empleados){
            total += e.calculaSueldo();
        }
        
        return total;
    }
    
    public void listadoOrganizadoPlantilla(){
        System.out.println("EMPLEADOS FIJOS");
        for(Empleado e:empleados){
            if(e instanceof EmpleadoFijo){
                System.out.println("-"+e);
            }
        }
        
        System.out.println("EMPLEADOS HORAS");
        for(Empleado e:empleados){
            if(e instanceof EmpleadoHoras){
                System.out.println("-"+e);
            }
        }
        
        System.out.println("EMPLEADOS COMISIONES");
        for(Empleado e:empleados){
            if(e instanceof EmpleadoComisiones){
                System.out.println("-"+e);
            }
        }
    }
    
    public void listadoAntiguedadPlantilla(){
        for(Empleado e:empleados){
            System.out.println(e.getNombre()+e.getApellidos()+e.tiempoEmpresa());
        }
    }
    
    @Override
    public String toString(){
        String cadena = "Empresa"+empresa;
        
        if(empleados.isEmpty()){
            return "SIN EMPLEADOS";
        }else{
            for(Empleado e:empleados){
                cadena += e;
            }
        }       
        return cadena;
    }
    
    public boolean busquedaEmpleado(Object object) throws IdException{
        if(object == null){
            throw new IdException("Error, object es null");
        }else if(!(object instanceof Nif) && !(object instanceof Nie) && !(object instanceof String)){
            throw new IdException("Error, object no es Nif, Nie o String");
        }
        
        boolean encontrado = false;
        
        if(object instanceof Nif){
            Nif nif = (Nif) object;
            for(Empleado e:empleados){
                if(e.getNif() != null && e.getNif() == nif){
                    encontrado = true;
                }
            }
        }else{
            Nie nie = (Nie) object;
            for(Empleado e:empleados){
                if(e.getNie()!= null && e.getNie() == nie){
                    encontrado = true;
                }
            }
        }
        
        if(object instanceof String){
            try{
              Nif nif = new Nif((String) object);  
            }catch(NifException e){
              Nie nie = new Nie((String) object);
            }           
        }
        
        return encontrado;
    }
    
    public Empleado devuelveEmpleado(Object object) throws IdException{
        if(object == null){
            throw new IdException("Error, object es null");
        }else if(!(object instanceof Nif) && !(object instanceof Nie) && !(object instanceof String)){
            throw new IdException("Error, object no es Nif, Nie o String");
        }

        Empleado e = null;
        if(object instanceof Nif){
            Nif nif = (Nif) object;
            for(Empleado a:empleados){
                if(a.getNif()!= null && a.getNif() == nif){
                    e = a;
                }
            }
        }else if(object instanceof Nie){
            Nie nie = (Nie) object;
            for(Empleado a:empleados){
                if(a.getNie()!= null && a.getNie() == nie){
                    e = a;
                }
            }
        }
        
        if(object instanceof String){
            try{
                Nif nif = new Nif((String) object);
            }catch(NifException ex){
                Nie nie = new Nie((String) object);
            }            
        }
        
        return e;
    }
    
    public int sumaVentasEmpleados(){
        int suma = 0;
        
        for(Empleado e:empleados){
            if(e instanceof EmpleadoComisiones){
                try{
                   suma += ((EmpleadoComisiones) e).getVentas(); 
                }catch(VentasException ex){
                    System.out.println("Error en el método sumaVentasEmpleados");
                }         
            }
        }
        
        return suma;
    }
    
    public void listaEmpleadosHorasExtras(){
        int horas = 0;
        
        for(Empleado e:empleados){
            if(e instanceof EmpleadoHoras){
                try{
                    horas = (((EmpleadoHoras) e).getNumHoras() - 40);
                }catch(NumHorasException ex){
                    System.out.println("Error en ListaEmpleadosHoras");
                }
                if(horas > 0){
                    System.out.println("-"+e);
                }
            }
        }
    }
    
    public void listaEmpleadosFijosTrienios(){
        int trienios = 0;
        
        for(Empleado e:empleados){
            if(e instanceof EmpleadoFijo){
                trienios = ((EmpleadoFijo) e).trienios();
            }
            if(trienios > 0){
                System.out.println("-"+e);
            }
        }
    }
    
    public void empleadosAIncentivar(int numHorasExtra, double ventas) throws NumHorasException, VentasException{
        for(Empleado e:empleados){
            if(e instanceof EmpleadoHoras){
                int extras = ((EmpleadoHoras) e).getNumHoras() - 40;
                if(extras > numHorasExtra){
                    incentivados.add((EmpleadoHoras) e);
                    e.premiar();
                }
            }else if(e instanceof EmpleadoComisiones){
                if(((EmpleadoComisiones) e).getVentas() > ventas){
                    incentivados.add((EmpleadoComisiones) e);
                    e.premiar();
                }
            }
        }
    }
    
    public void EmpleadosIncentivados(){
        for(Empleado e:empleados){
            if(e instanceof EmpleadoHoras){
                if(((EmpleadoHoras) e).isIncentivado()){
                    System.out.println("-"+e.getNombre()+" "+e.getApellidos());
                }
            }else if(e instanceof EmpleadoComisiones){
                if(((EmpleadoComisiones) e).isIncentivado()){
                    System.out.println("-"+e.getNombre()+" "+e.getApellidos());
                }
            }
        }
    }
    
    public void EmpleadosDespedidos(){
        for(Empleado e:empleados){
            if(e instanceof EmpleadoFijo){
                if(e.isDespedido()){
                    System.out.println("-"+e.getNombre()+" "+e.getApellidos()+" "+e.getSueldo());
                }
            }else if(e instanceof EmpleadoHoras){
                if(e.isDespedido()){
                    System.out.println("-"+e.getNombre()+" "+e.getApellidos()+" "+e.getSueldo());
                }
            }else if(e instanceof EmpleadoComisiones){
                if(e.isDespedido()){
                    System.out.println("-"+e.getNombre()+" "+e.getApellidos()+" "+e.getSueldo());
                }
            }
        }
    }
}