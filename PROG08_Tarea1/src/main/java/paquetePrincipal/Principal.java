
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
        
        // d) Crea un empleado duplicado
        EmpleadoFijo raul = null;
        
        try{
            raul = new EmpleadoFijo(new Nif("00000001R"), "Raimundo", "Muñoz",LocalDate.of(1999, 04, 20),LocalDate.of(2017, 04, 20));
        }catch(IdException ex){
            System.out.println(ex.getMessage());
        }
        
        // e) Se añaden uno a uno los empleados en la Gestión de Recursos Humanos hero, en el caso de que haya algún null NO se añade.
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

        if(raul != null){
            Hero.addEmpleado(raul);
        }
        
        // f) Muestra el objeto hero.
        System.out.println("Muestra el objeto hero. F"); // No se ha añadido el empleado repetido
        System.out.println(Hero);
        System.out.println("____________________________________");

        // g) Muestra el sueldo total a pagar por la empresa Hero
        Hero.sueldoSemanalPlantilla();
        
        // h) Se desea mostar un listado organizado de la plantilla de hero.
        Hero.listadoOrganizadoPlantilla();
        
        /*
           i) Se desea saber el nombre y los apellidos del empleado cuyo nif es “22345679-
            Y” (para el caso de que esté dado de alta en la plantilla de empleados de hero,
            puede ser que el método devuelva null). Recuerda que el método envía una
            excepción del tipo IdException.
        */
           Hero.busquedaEmpleadoID("22345679Y");  
        
        // j) Se desea mostrar un listado de empleados con la información: nombre, apellidos y tiempo de antigüedad de hero.
        Hero.listadoAntiguedadPlantilla();
        
        // i) Se desea despedir al empleado rai en hero.
        Hero.despedirEmpleado(rai);
        
        // k) Muestra la información completa de la empresa hero.
        System.out.println(Hero);
        
        // l) Muestra la suma de las ventas realizadas por los empleados de la plantilla de hero que van por comisiones.
        try {            
            Hero.sumaVentasEmpleados();
        } catch (VentasException ex) {
            System.out.println(ex.getMessage());
        }
        
        // m) Muestra toda la información de empleados de la plantilla de hero que han realizado horas extras.
        try {            
            Hero.listaEmpleadosHorasExtras();
        } catch (NumHorasException ex) {
            System.out.println(ex.getMessage());
        }
        
        // n) Muestra toda la información de empleados fjos de la plantilla de hero que tienen al menos un trienio.
        Hero.listaEmpleadosFijosTrienios();
        
        // o) Se desea incentivar a empleados, con horas extras superiores a 4 y/o con ventas superiores a 4200€.
        try{
            Hero.empleadosAIncentivar(4, 4200);
        }catch(NumHorasException | VentasException ex){
            System.out.println(ex.getMessage());
        }
        
        // p) Muestra nombre, apellidos y sueldo de aquellos empleados que han sido incentivados.
        Hero.EmpleadosIncentivados();
        
        /*
        Muestra la plantilla de hero ordenada por Sueldo de menor a mayor, y cuál es el
        empleado (apellidos, nombre, edad y sueldo) con menor sueldo y la misma
        información para el empleado con mayor sueldo.
        */
        Hero.listaOrdenadaSueldoPlantilla('I');
        
        /*
        Muestra la plantilla de hero ordenada por Apellidos + Nombre de menor a mayor.
        */                  
        Hero.listaOrdenadaApellidosNombrePlantilla('I');
               
        /*
        s) Muestra la plantilla de hero ordenada por Apellidos + Nombre de mayor a menor.
        */
        Hero.listaOrdenadaApellidosNombrePlantilla('i');
        
        // t) Muestra todos los empleados por horas de hero, ordenada de forma creciente por las horas trabajadas.
        Hero.ListaOrdenadaEmpleadosHoras();
        
        // u) Muestra todos los empleados por comisiones de hero, ordenada de forma creciente por las ventas.
        Hero.listaOrdenadaEmpleadosComisiones();
        
        // v) Se desea despedir al empleado rai en hero.
        Hero.despedirEmpleado(rai);
        
        // w) Se despide al empleado kevin de la plantilla de hero.
        Hero.despedirEmpleado(kevin);
        
        // x) Muestra nombre y apellidos de los empleados despedidos (indica el tipo de Empleado).
        Hero.EmpleadosDespedidos();
        
        // y) Se muestra la lista de todos los empleados despedidos que NO se han jubilado.
        Hero.ListaEmpleadosDespedidosNoJubilados();
        
        // z) Muestra los empleados actuales en plantilla hero.
        Hero.listadoOrganizadoPlantilla();
        
        // aa) Muestra los empleados despedidos y comprueba que están todos.
        Hero.EmpleadosDespedidos();
    }
}