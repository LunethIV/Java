
package paquetePrincipal;
import paqueteJerarquia.*;
import paqueteOtros.*;
import java.time.LocalDate;

public class Principal {


    public static void main(String[] args) {
        
        // a) Crea una Gestión de Recursos Humanos denominada “Hero”
        GestionRRHH Hero = new GestionRRHH("Hero");
        
        // b) Se muestra el objeto hero.
        System.out.println(Hero);
        
        /* c) Crea los siguientes empleados, para cada empleado es necesario captar la
              posible excepción lanzada por el constructor. * Inicializa el objeto a crear como
              null.*/
        EmpleadoFijo rai = null;
        
        try{
            rai = new EmpleadoFijo(new Nif("00000001R"),"Raimundo","Muñoz",LocalDate.of(1999, 4, 20),LocalDate.of(2017, 4, 20));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        EmpleadoHoras tomas = null;
        
        try{
            tomas = new EmpleadoHoras(35,new Nie("X0000001R"),"Tomas","Escobar",LocalDate.of(1978, 5, 20),LocalDate.of(2021,8,21));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
                
        EmpleadoComisiones kevin = null;
        
        try{
            kevin = new EmpleadoComisiones(4000,new Nif("X0000002W"),"Kevin","Costa",LocalDate.of(1983, 12, 21),LocalDate.of(2017, 12, 21));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        EmpleadoFijo pedro = null;
        
        try{
            pedro = new EmpleadoFijo(new Nif("12345678Z"),"Pedro","Martinez",LocalDate.of(2000, 5, 1),LocalDate.of(2022, 5, 23));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        EmpleadoHoras manuel = null;
        
        try{
            manuel = new EmpleadoHoras(49,new Nif("12345679S"),"Manuel","Mosquera",LocalDate.of(2000, 2, 11),LocalDate.of(2022, 5, 23));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        EmpleadoComisiones raquel = null;
        
        try{
            raquel = new EmpleadoComisiones(4500,new Nie("22345679Y"),"Raquel","Vergara",LocalDate.of(2001,6,13),LocalDate.of(2022, 5, 21));
        }catch(Exception ex){
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
        
        // e) Muestra el objeto hero
        System.out.println("Hero:");
        System.out.println(Hero);
        System.out.println("____________________________________");
        // f) Muestra el sueldo total a pagar por la empresa “Hero” a su plantilla.
        System.out.println("Sueldo total:");
        System.out.println(Hero.sueldoSemanalPlantilla());
        System.out.println("____________________________________");

        // g) Se desea mostar un listado organizado de la plantilla de hero
        System.out.println("Listado");
        Hero.listadoOrganizadoPlantilla();
        System.out.println("____________________________________");

        /* h) Se desea saber el nombre y los apellidos del empleado cuyo nif es “22345679-
           Y” (para el caso de que esté dado de alta en la plantilla de empleados de hero,
           puede ser que el método devuelva null). */
        try{
          System.out.println(Hero.devuelveEmpleado(new Nif("22345679Y")));  
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
               
        // i) Se desea mostrar un listado de empleados con la información: nombre, apellidos y tiempo de antigüedad de hero
        Hero.listadoAntiguedadPlantilla();
        
        // j) Se desea despedir al empleado rai en hero.
        Hero.despedirEmpleado(rai);
        
        // k) Muestra la información completa de la empresa hero.
        System.out.println(Hero);
        
        // l) Muestra la suma de las ventas realizadas por los empleados de la plantilla de hero que van por comisiones.
        System.out.println(Hero.sumaVentasEmpleados());
           
        // m) Muestra toda la información de empleados de la plantilla de hero que han realizado horas extras.
        Hero.ListaEmpleadosExtras();
        
        // n) Muestra toda la información de empleados fjos de la plantilla de hero que tienen al menos un trienio.
        Hero.ListaEmpleadosFijosTrienios();        
    }
}