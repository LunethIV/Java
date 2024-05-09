
package paquetePrincipal;

import java.sql.SQLException;
import java.util.Scanner;


/**
 *
 * @author Lun
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        
        Conexion conexion = new Conexion();
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do{
            
            System.out.println("----- MENÚ DE BASE DATOS: EMPLEADOS -----");
            System.out.println("1. Listado de todos los empleados (id, nombre, sueldo) ordenados por id usando next().");
            System.out.println("2. Listado de todos los empleados sin orden usando previous() y después next()");
            System.out.println("3. Listado de todos los empleados indicando número de fila y total de empleados.");          
            System.out.println("4. Búsqueda de un empleado por id (sin parametrizar)");
            System.out.println("5. Búsqueda de un empleado por id (parametrizado)");
            System.out.println("6. Listado de todos los empleados con sueldo > 1000€ cuyo nombre contenga ‘c’ (sin parametrizar)");
            System.out.println("7. Listado de todos los empleados con sueldo > 1000€ cuyo nombre contenga ‘c’ (parametrizado)");
            System.out.println("8. Modifica el nombre del empleado cuyo id sea 100.");
            System.out.println("9. Crea una tabla: EmplHoras con los campos: id, nombre, horas, horasExtra y sueldo.");
            System.out.println("10. Guarda en la tabla: EmplHoras toda la información de los empleados por horas.");
            System.out.println("11. Salir.");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1 -> conexion.listadoEmpleadosID();
                case 2 -> conexion.listadoEmpleadosSinOrden();
                case 3 -> conexion.listadoConNumFilas();
                case 4 -> conexion.busquedaEmpleadoIDnoPara(222);
                case 5 -> conexion.busquedaEmpleadoIDPara(333);
                case 6 -> conexion.listadoEmpleadosSueldoLetraCsinPara();
                case 7 -> conexion.prueba();
                case 8 -> conexion.modificarNombre("Manolo");
            }
        }while(opcion != 11);
    }
}