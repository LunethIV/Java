
package paquetePrincipal;

import java.time.LocalDate;
import paqueteOtros.*;
import paqueteJerarquia.*;
import paqueteExcepciones.*;

public class Principal {


    public static void main(String[] args) {
        
        // a) Crea una Gestión de Recursos Humanos denominada “Hero”.
        GestionRRHH Hero = new GestionRRHH("Hero");
        
        // b) Se muestra el objeto hero.
        System.out.println("-----MOSTRAR HERO-----");
        System.out.println(Hero);
        
        /*
        c) Crea los siguientes empleados, para cada empleado es necesario inicializar
           el objeto a crear como null y después intentar crearlo con posibilidad de
           captar la posible excepción lanzada por el constructor, diferenciando
           entre las excepciones del tipo: NifException y NieException (mismo
           nivel) con IdException.
        */
        EmpleadoFijo rai = null;
        
        try{
            rai = new EmpleadoFijo(new Nif("00000001R"), "Raimundo", "Muñoz",LocalDate.of(1999, 04, 20),LocalDate.of(2017, 04, 20));
        }catch(IdException ex){
            System.out.println(ex.getMessage());
        }
        
        EmpleadoHoras tomas = null;
        
        try{
            tomas = new EmpleadoHoras(35,new Nie("X0000001R"),"Tomas","Escobar",LocalDate.of(1978, 05, 20),LocalDate.of(2021,8,21));
        }catch(NumHorasException | IdException ex){
            System.out.println(ex.getMessage());
        }
        
        EmpleadoComisiones kevin = null;
        
        try{
            kevin = new EmpleadoComisiones(4000,new Nif("X0000002W"),"Kevin","Costa",LocalDate.of(1983, 12, 21),LocalDate.of(2017, 12, 21));
        }catch(IdException | VentasException ex){
            System.out.println(ex.getMessage());
        }
        
        EmpleadoFijo pedro = null;
        
        try{
            pedro = new EmpleadoFijo(new Nif("12345678Z"),"Pedro","Martinez",LocalDate.of(2000, 5, 1),LocalDate.of(2022, 5, 23));
        }catch(IdException ex){
            System.out.println(ex.getMessage());
        }
        
        EmpleadoHoras manuel = null;
        
        try{
            manuel = new EmpleadoHoras(49,new Nif("12345679S"),"Manuel","Mosquera",LocalDate.of(2000, 2, 11),LocalDate.of(2022, 5, 23));
        }catch(IdException | NumHorasException ex){
            System.out.println(ex.getMessage());
        }
        
        EmpleadoComisiones raquel = null;
        
        try{
            raquel = new EmpleadoComisiones(4500,new Nie("22345679Y"),"Raquel","Vergara",LocalDate.of(2001,6,13),LocalDate.of(2022, 5, 21));
        }catch(IdException | VentasException ex){
            System.out.println(ex.getMessage());
        }
        
        // d) Se añaden uno a uno los empleados en la Gestión de Recursos Humanos hero, en el caso de que haya algún null NO se añade.
        if(rai != null){
            Hero.addEmpleado(rai); 
        }
        
        if(tomas != null){
            Hero.addEmpleado(tomas);
        }
        
        if(kevin != null){
            Hero.addEmpleado(kevin);
        }
        
        if(pedro != null){
            Hero.addEmpleado(pedro);
        }
        
        if(manuel != null){
            Hero.addEmpleado(manuel);
        }
        
        if(raquel != null){
            Hero.addEmpleado(raquel);
        }

        // e) Muestra el objeto hero.
        System.out.println("Hero:");
        System.out.println(Hero);
        System.out.println("____________________________________");

        // f) Se desea mostar un listado organizado de la plantilla de hero.
        Hero.listadoOrganizadoPlantilla();
        
        /*
           g) Se desea saber el nombre y los apellidos del empleado cuyo nif es “22345679-
            Y” (para el caso de que esté dado de alta en la plantilla de empleados de hero,
            puede ser que el método devuelva null). Recuerda que el método envía una
            excepción del tipo IdException.
        */
        try{
            Hero.busquedaEmpleado(new Nif("22345679Y"));
        }catch(IdException ex){
            System.out.println(ex.getMessage());
        }
        
        // h) Se desea mostrar un listado de empleados con la información: nombre, apellidos y tiempo de antigüedad de hero.
        Hero.listadoAntiguedadPlantilla();
        
        // i) Se desea despedir al empleado rai en hero.
        Hero.despedirEmpleado(rai);
        
        // j) Muestra la información completa de la empresa hero.
        System.out.println(Hero);
        
        // k) Muestra la suma de las ventas realizadas por los empleados de la plantilla de hero que van por comisiones.
        Hero.sumaVentasEmpleados();
        
        // l) Muestra toda la información de empleados de la plantilla de hero que han realizado horas extras.
        Hero.listaEmpleadosHorasExtras();
        
        // m) Muestra toda la información de empleados fjos de la plantilla de hero que tienen al menos un trienio.
        Hero.listaEmpleadosFijosTrienios();
        
        // n) Se desea incentivar a empleados, con horas extras superiores a 4 y/o con ventas superiores a 4200€.
        try{
            Hero.empleadosAIncentivar(4, 4200);
        }catch(NumHorasException | VentasException ex){
            System.out.println(ex.getMessage());
        }
        
        // o) Muestra nombre, apellidos y sueldo de aquellos empleados que han sido incentivados.
        Hero.EmpleadosIncentivados();
        
        // p) Se desea despedir al empleado rai en hero.
        Hero.despedirEmpleado(rai);
        
        // q) Muestra nombre y apellidos de los empleados despedidos.
        Hero.EmpleadosDespedidos();
    }
}