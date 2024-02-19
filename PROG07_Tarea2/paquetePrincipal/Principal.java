
package paquetePrincipal;

import java.time.LocalDate;
import java.time.Month;
import paqueteOtros.*;
import paqueteJerarquia.*;

public class Principal {


    public static void main(String[] args) {
        // a) Crea una Gestión de Recursos Humanos denominada “Hero”
        GestionRRHH Hero = new GestionRRHH("Hero");
        
        // b) Se muestra el objeto hero.
        System.out.println("Hero: "+Hero);
        System.out.println("_______________________________");
        // c) Crea los siguientes empleados:
        EmpleadoFijo rai = new EmpleadoFijo(new Nif("00000001R"),null,"Raimundo","Muñoz",LocalDate.of(1999, 04, 20),LocalDate.of(2017, 04, 20));
        EmpleadoHoras tomas = new EmpleadoHoras(35,null,new Nie("X0000001R"),"Tomas","Escobar",LocalDate.of(1978,05,20),LocalDate.of(2021, 8, 21));
        EmpleadoComisiones kevin = new EmpleadoComisiones(4000,null,new Nie("X0000002R"),"Kevin","Costa",LocalDate.of(1983, 12, 21), LocalDate.of(2017, 12, 21));
        EmpleadoFijo pedro = new EmpleadoFijo(new Nif("12345678Z"),null,"Pedro","Martinez",LocalDate.of(2000, 05, 1), LocalDate.of(2022, 5, 23));
        EmpleadoHoras manuel = new EmpleadoHoras(49,new Nif("12345679S"),null,"Manuel","Mosquera",LocalDate.of(2000, 02, 11),LocalDate.of(2022,5,23));
        EmpleadoComisiones raquel = new EmpleadoComisiones(4500,new Nif("22345679Y"),null,"Raquel","Vergara",LocalDate.of(2001, 6, 13),LocalDate.of(2022, 5, 21));
        
        // d) Se añaden uno a uno los empleados en la Gestión de Recursos Humanos hero.
        Hero.addEmpleado(rai);
        Hero.addEmpleado(tomas);
        Hero.addEmpleado(kevin);
        Hero.addEmpleado(pedro);
        Hero.addEmpleado(manuel);
        Hero.addEmpleado(raquel);       
        
        // e) Muestra el objeto hero.
        
        for(Empleado empleado:Hero.getEmpleados()){
            System.out.println(empleado);
        }
        System.out.println("_______________________________");

        // f) Muestra el sueldo total a pagar por la empresa “Hero” a su plantilla.
        System.out.println("Sueldo total plantilla: "+Hero.sueldoSemanalPlantilla()+"€");
        
        System.out.println("_______________________________");
        
        // g) Se desea mostar un listado organizado de la plantilla de hero.
        Hero.listadoOrganizadoPlantilla();
        System.out.println("_______________________________");
        
        // h) Se desea saber si existe algún empleado con nif “22345679-Y” en la plantilla.
        System.out.println(Hero.busquedaEmpleadoNif(new Nif("22345679Y")));
        System.out.println("_______________________________");
        
        // i) Se desea mostrar un listado de empleados con la información: nombre, apellidos y tiempo de antigüedad de hero.
        Hero.listadoAntiguedadPlantilla();
        System.out.println("_______________________________");
        // j) Se desea despedir al empleado rai en hero.
        Hero.despedirEmpleado(rai);
        
        // k) Muestra la información completa de la empresa hero.
        System.out.println(Hero);
    }
}