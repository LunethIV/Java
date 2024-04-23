
package paquetePrincipal;

import paqueteJerarquia.*;
import paqueteExcepciones.*;
import paqueteInterfaces.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class GestionRRHH {
    
    // Atributos
    private String empresa;
    private ArrayList<Incentivable> incentivados;
    private ArrayList<Despedible> despedidos;
    private HashMap <String, Empleado> empleados;
    private ArrayList<Jubilable> jubilados;
    
    // Constructor
    public GestionRRHH(String empresa){
        this.empresa = empresa;
        this.empleados = new HashMap<>();
        this.incentivados = new ArrayList<>();
        this.jubilados = new ArrayList<>();
        this.despedidos = new ArrayList<>();
    }
    
    public GestionRRHH(String empresa, HashMap<String, Empleado> empleados){
        this.empresa = empresa;
        this.empleados = empleados;
    }
    
    // Metodos
    public boolean existeEmpleado(Empleado empleado){
        if(empleados.containsKey(empleado.getNif().getNif())){
            return true;
        }else if(empleados.containsKey(empleado.getNie().getNie())){
            return true;
        }else{
            return false;
        }
    }
    
    public void addEmpleado(Empleado empleado){
        if(empleado.getNif() != null && empleados.containsKey(empleado.getNif().getNif())){
            System.out.println("El empleado introducido ya existe");
        }else if(empleado.getNif() != null){
            empleados.put(empleado.getNif().getNif(), empleado);
        }
        
        if(empleado.getNie() != null && empleados.containsKey(empleado.getNie().getNie())){
            System.out.println("El empleado introducido ya existe");
        }else if(empleado.getNie() != null){
            empleados.put(empleado.getNie().getNie(), empleado);
        }
    }
    
    public void despedirEmpleado(Empleado empleado){
        if(empleado != null && empleados.containsKey(empleado.getNif().getNif()) && !despedidos.contains(empleado)){
            empleado.despedir();
            despedidos.add(empleado);
           // empleados.remove(empleado.getNif().getNif());
        }else if(empleado != null && empleado.isJubilado() && !jubilados.contains(empleado)){
            jubilados.add(empleado);
        }
        else{
            System.out.println("El empleado introducido no existe");
        }
    }
    
    public float sueldoSemanalPlantilla(){
        float total = 0.0f;
        for(Map.Entry <String, Empleado> entrada: this.empleados.entrySet()){
            float sueldo = entrada.getValue().getSueldo();
            total += sueldo;
        }
        return total;
    }
    
    public void listadoOrganizadoPlantilla(){
        Collection<Empleado> coleccion = empleados.values();
        System.out.println("EMPLEADOS FIJOS");
        for(Empleado empleado:coleccion){
            if(empleado instanceof EmpleadoFijo){
                System.out.println("-"+empleado);
            }
        }
        
        System.out.println("EMPLEADOS HORAS");
        for(Empleado empleado:coleccion){
            if(empleado instanceof EmpleadoHoras){
                System.out.println("-"+empleado);
            }
        }
        
        System.out.println("EMPLEADOS COMISIONES");
        for(Empleado empleado:coleccion){
            if(empleado instanceof EmpleadoComisiones){
                System.out.println("-"+empleado);
            }
        }
    }
    
    public void listadoAntiguedadPlantilla(){
        Collection<Empleado> coleccion = empleados.values(); // En esta línea se crea una colección que contiene clave y valor
        List<Empleado> lista = new ArrayList<>(); // Creamos una lista vacía de tipo empleado
        lista.addAll(coleccion); // Volcamos a la lista el contenido de la colección
        Collections.sort(lista, new ComparadorFechaTrabajoEmpleado()); // Ordenamos el contenido de la lista mediante el método compare de la clase "ComparadorFechaTrabajoEmpleado"
        for(Empleado e:lista){
            if(e.getNif() != null){
               System.out.println(e.getNif()+e.getNombre()+e.getApellidos()+e.tiempoEmpresa());
            }else{
               System.out.println(e.getNie()+e.getNombre()+e.getApellidos()+e.tiempoEmpresa()); 
            }
        }
    }
    
    public class ComparadorFechaTrabajoEmpleado implements Comparator<Empleado>{
        @Override
        public int compare(Empleado o1, Empleado o2) {
            return o1.getFechaTrabajo().compareTo(o2.getFechaTrabajo());
        }
    }
    
    @Override
    public String toString(){
        String cadena = "Empresa"+empresa;
        
        if(empleados.isEmpty()){
            return "SIN EMPLEADOS";
        }else{
            empleados.keySet();
            Set<String> miset = empleados.keySet(); // Creamos un set con los valores de las claves de empleados (se almacenan en este las claves)
            for(String e:miset){ // Se recorre el set que hemos creado
                Empleado emp = empleados.get(e); // Buscamos el empleado por su clave (devuelveme el empleado cuya key sea esta)
                cadena += emp;
            }
        }
        return cadena;
    }
    
    public boolean busquedaEmpleadoID(String clave) /*throws IdException*/{
        return empleados.containsKey(clave);
        
        /*
        if(object == null){
        throw new IdException("Error, object es null");
        }else if(!(object instanceof Nif) && !(object instanceof Nie) && !(object instanceof String)){
        throw new IdException("Error, object no es Nif, Nie o String");
        }
        boolean encontrado = false;
        if(object instanceof Nif){
        Nif nif = (Nif) object;
        for(Empleado emp:empleados){
        if(emp.getNif() != null && emp.getNif() == nif){
        encontrado = true;
        }
        }
        }else{
        Nie nie = (Nie) object;
        for(Empleado emp:empleados){
        if(emp.getNie()!= null && emp.getNie() == nie){
        encontrado = true;
        }
        }        
        }
        if(object instanceof String){
        try{
        Nif nif = new Nif((String) object);
        }catch(NifException emp){
        Nie nie = new Nie((String) object);           
        }
        }        
        return encontrado;
         */
    }
    
    public Empleado devuelveEmpleado(String clave) /*throws IdException*/{
        if(empleados.containsKey(clave)){
            return empleados.get(clave); // Traeme el empleado que tenga esta clave dentro de mi array de empleado
        }else{
            return null;
        }
        /*
        if(object == null){
            throw new IdException("Error, object es null");
        }else if(!(object instanceof Nif) && !(object instanceof Nie) && !(object instanceof String)){
            throw new IdException("Error, object no es Nif, Nie o String");
        }

        Empleado emp = null;
        if(object instanceof Nif){
            Nif nif = (Nif) object;
            for(Empleado a:empleados){
                if(a.getNif()!= null && a.getNif() == nif){
                    emp = a;
                }
            }
        }else if(object instanceof Nie){
            Nie nie = (Nie) object;
            for(Empleado a:empleados){
                if(a.getNie()!= null && a.getNie() == nie){
                    emp = a;
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
        
        return emp;
        */
    }
    
    public int sumaVentasEmpleados() throws VentasException{
        int suma = 0;
        
        for(Empleado e:empleados.values()){
            if(e instanceof EmpleadoComisiones){
                suma += ((EmpleadoComisiones)e).getVentas();
            }
        }
        return suma;
        /*
        int suma = 0;
        
        for(Empleado emp:empleados){
            if(emp instanceof EmpleadoComisiones){
                try{
                   suma += ((EmpleadoComisiones) emp).getVentas(); 
                }catch(VentasException ex){
                    System.out.println("Error en el método sumaVentasEmpleados");
                }         
            }
        }
        
        return suma;
        */
    }
    
    public void listaEmpleadosHorasExtras() throws NumHorasException{
        int horas = 0;
        
        for(Map.Entry<String, Empleado> e:empleados.entrySet()){    
            
            if(e instanceof EmpleadoHoras){
                horas = (((EmpleadoHoras) e).getNumHoras() - 40);
                if(horas > 0){
                    System.out.println("-"+e.getKey()+e.getValue());
                }
            }
        }
    }
    
    public void listaEmpleadosFijosTrienios(){
        int trienios = 0;
        
        for(Map.Entry<String,Empleado> e:empleados.entrySet()){
            if(e instanceof EmpleadoFijo){
                trienios = ((EmpleadoFijo) e).trienios();
                if(trienios > 0){
                    System.out.println("-"+e.getKey()+e.getValue());
                }
            }
        }
    }
    
    public void empleadosAIncentivar(int numHorasExtra, double ventas) throws NumHorasException, VentasException{
        for(Map.Entry<String,Empleado> e:empleados.entrySet()){
            if(e instanceof EmpleadoHoras){
                int extras = ((EmpleadoHoras) e).getNumHoras() - 40;
                if(extras > numHorasExtra){
                    incentivados.add((EmpleadoHoras) e);
                    ((EmpleadoHoras) e).premiar();
                }
            }else if(e instanceof EmpleadoComisiones){
                if(((EmpleadoComisiones) e).getVentas() > ventas){
                    incentivados.add((EmpleadoComisiones) e);
                    ((EmpleadoHoras) e).premiar();
                }
            }
        }
    }
    
    public void EmpleadosIncentivados(){
        for(Map.Entry<String,Empleado> e:empleados.entrySet()){
            if(e instanceof EmpleadoHoras){
                if(((EmpleadoHoras) e).isIncentivado()){
                    System.out.println("-"+e.getKey()+" "+((EmpleadoHoras) e).getApellidos()+" "+((EmpleadoHoras) e).getSueldo());
                }
            }else if(e instanceof EmpleadoComisiones){
                if(((EmpleadoComisiones) e).isIncentivado()){
                    System.out.println("-"+e.getKey()+" "+((EmpleadoComisiones) e).getApellidos()+" "+((EmpleadoComisiones) e).getSueldo());
                }
            }
        }
    }
    
    public void EmpleadosDespedidos(){
        for(Map.Entry<String,Empleado> e:empleados.entrySet()){
            Empleado emp = e.getValue();
            if(emp instanceof EmpleadoFijo){
                if(((EmpleadoFijo) emp).isDespedido()){
                    System.out.println("-"+((EmpleadoFijo) emp).getNombre()+" "+((EmpleadoFijo) emp).getApellidos()+" "+((EmpleadoFijo) emp).getSueldo());
                }
            }else if(emp instanceof EmpleadoHoras){
                if(((EmpleadoHoras) emp).isDespedido()){
                    System.out.println("-"+((EmpleadoHoras) emp).getNombre()+" "+((EmpleadoHoras) emp).getApellidos()+" "+((EmpleadoHoras) emp).getSueldo());
                }
            }else if(emp instanceof EmpleadoComisiones){
                if(((EmpleadoComisiones) emp).isDespedido()){
                    System.out.println("-"+((EmpleadoComisiones) emp).getNombre()+" "+((EmpleadoComisiones) emp).getApellidos()+" "+((EmpleadoComisiones) emp).getSueldo());
                }
            }
        }
    }
    
    public void listaOrdenadaApellidosNombrePlantilla(char i){
        Collection<Empleado> coleccion = empleados.values();
        List<Empleado> lista = new ArrayList<>();
        lista.addAll(coleccion);
        
        if(Character.isUpperCase(i)){           
            Collections.sort(lista, new ComparadorApellidosNombreEmpleado().reversed());
        }else{
            Collections.sort(lista, new ComparadorApellidosNombreEmpleado());
        }
        for(Empleado e:lista){            
            System.out.println(e.getNif()+" "+e.getApellidos()+" "+e.getNombre()+" "+e.getEDAD_JUBILACION()+" "+e.getSueldo());
        }
    }
    
    public class ComparadorApellidosNombreEmpleado implements Comparator<Empleado>{
        @Override
        public int compare(Empleado e1, Empleado e2){
            return (e1.getApellidos()+e1.getNombre()).compareTo(e2.getApellidos()+e2.getNombre());
        }
    }
    
    public void listaOrdenadaSueldoPlantilla(char i){
        Collection<Empleado> coleccion = empleados.values();
        List<Empleado> lista = new ArrayList<>();
        lista.addAll(coleccion);
        Collections.sort(lista, new ComparadorSueldo());
        ListIterator iterador = lista.listIterator();
        if(Character.isUpperCase(i)){
            while(iterador.hasPrevious()){ // Mientras haya elementos en la colección
                System.out.println(iterador.previous());
            }
        }else{
            while(iterador.hasNext()){    
                System.out.println(iterador.next());
            }
        }
    }
    
    public class ComparadorSueldo implements Comparator<Empleado>{
        @Override
        public int compare(Empleado e1, Empleado e2){
            return Float.compare(e1.getSueldo(),e2.getSueldo());
        }
    }
    
    public void listaOrdenadaEdadApellidosNombrePlantilla(){
        Collection<Empleado> coleccion = empleados.values();
        List<Empleado> lista = new ArrayList<>();
        lista.addAll(coleccion);
        Collections.sort(lista, new ComparadorEdadApellidosNombreEmpleado());
        
        for(Empleado e:lista){
            System.out.println(e.edad());
        }
    }
    
    public class ComparadorEdadApellidosNombreEmpleado implements Comparator<Empleado>{
        @Override
        public int compare(Empleado e1, Empleado e2){
        // return e1.edad() != e2.edad() ?  Integer.compare(e1.edad(), e2.edad()) : (e1.getApellidos()+e1.getNombre()).compareTo(e2.getApellidos()+e2.getNombre());
        // Si la edad del primer empleado no es igual que la del segundo, compara por edad, de lo contrario, por nombre+apellido
            
            if(e1.edad() != e2.edad()){
               return e1.edad() - e2.edad();
            }else{
                return (e1.getApellidos()+e1.getNombre()).compareTo(e2.getApellidos()+e2.getNombre());
            }
        }
    }
    
    public void ListaOrdenadaEmpleadosHoras(){
        Collection<Empleado> coleccion = empleados.values();
        List<EmpleadoHoras> lista = new ArrayList<>();
        for(Empleado e:coleccion){
            if(e instanceof EmpleadoHoras){
                lista.add((EmpleadoHoras)e);
            }
        }
        Collections.sort(lista); // Para poder usar sort, debe usarse un elemento de una clase que implemente Comparable
        
        for(Empleado e:lista){
            System.out.println(e);
        }
    }
    
    public void listaOrdenadaEmpleadosComisiones(){
        Collection<Empleado> coleccion = empleados.values();
        List<EmpleadoComisiones> lista = new ArrayList<>();
        for(Empleado e:coleccion){
            if(e instanceof EmpleadoComisiones){
                lista.add((EmpleadoComisiones)e);
            }
        }
        Collections.sort(lista); // Para poder usar sort, debe usarse un elemento de una clase que implemente Comparable
        
        for(Empleado e:lista){
            System.out.println(e);
        }
    }
    
    public void ListaEmpleadosDespedidosNoJubilados(){
        ArrayList<Despedible> despedidosCopia = new ArrayList<>();
        despedidosCopia.addAll(despedidos);
        for(Empleado e:empleados.values()){
            if(e.isJubilado()){
                despedidosCopia.remove(e);
            }
        }
        
        for(Despedible e:despedidosCopia){
            System.out.println(e);
        }
    }
}