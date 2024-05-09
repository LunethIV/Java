
package paquetePrincipal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lun
 */
public class Conexion {
    
    private Connection conexion;
    
    public Conexion(){
        this.conexion = null;
        try{
            String url = "jdbc:postgresql://localhost/RRHH";
            
            conexion = DriverManager.getConnection(url,"postgres","1234");
            
            System.out.println("Conexion OK...");
        }catch(SQLException ex){
            System.out.println("Error general");
        }
    }
    
    public void close(){
        try{
            conexion.close();
        }catch(SQLException ex){
            System.out.println("Error al cerrar la conexion");
        }
    }
    
    public void listadoEmpleadosID(){
        String select = "SELECT * FROM EMPLEADOS ORDER BY id";
        
        try{
            PreparedStatement sentencia = conexion.prepareStatement(select);
            ResultSet consulta = sentencia.executeQuery();
            System.out.println("----- LISTADO EMPLEADOS POR ID -----");
            while(consulta.next()){
                System.out.println("ID: "+ consulta.getInt(1) +" Nombre: " +consulta.getString(2) +" Sueldo: " +consulta.getFloat(3));
            }
            System.out.println("--------------------------------------------------------");
        }catch(SQLException ex){
            System.out.println("Error en la consula: "+select);
        }
        System.out.println("");
    }
    
    public void listadoEmpleadosSinOrden(){
        
        String select = "SELECT * FROM EMPLEADOS";
        
        try{
            
            PreparedStatement sentencia = conexion.prepareStatement(select,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet consulta = sentencia.executeQuery();
            System.out.println("----- LISTADO EMPLEADOS SIN ORDEN -----");
            
                while(consulta.next()){
                    System.out.println("ID: "+ consulta.getInt(1) +" Nombre: " +consulta.getString(2) +" Sueldo: " +consulta.getFloat(3));
                }
                
                System.out.println("");
                
                while(consulta.previous()){
                    System.out.println("ID: "+ consulta.getInt(1) +" Nombre: " +consulta.getString(2) +" Sueldo: " +consulta.getFloat(3));
                }
                System.out.println("--------------------------------------------------------");
        }catch(SQLException ex){
            System.out.println("Error en la consulta: "+select);
        }
        System.out.println("");
    }
    
    public void listadoConNumFilas(){
        
        String select = "SELECT nombre FROM EMPLEADOS";          

        try{
            PreparedStatement sentencia = conexion.prepareStatement(select,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet consulta = sentencia.executeQuery();
            System.out.println("----- LISTADO EMPLEADOS POR NUMERO DE FILAS -----");
            
            consulta.last(); // Mueve el cursor al final
            
            int numFilas = consulta.getRow(); // Se guarda la posicion del cursor en una variable
            
            consulta.beforeFirst(); // Se coloca el cursor antes de la primera posición
            
            for(int i = 0; i < numFilas; i++){
                consulta.next();
                
                System.out.println("Fila: "+i+" Nombre: "+consulta.getString(1));
            }
            System.out.println("");
            System.out.println("Total de empleados: " + numFilas);
            System.out.println("--------------------------------------------------------");
        }catch(SQLException ex){
            System.out.println("Error en la consulta: "+select);
        }
    }
    
    public void busquedaEmpleadoIDnoPara(int id){
        
        String select = "SELECT nombre FROM EMPLEADOS WHERE id = "+id;
        
        try{
           PreparedStatement sentencia = conexion.prepareStatement(select);
           ResultSet consulta = sentencia.executeQuery();
           System.out.println("----- BUSQUEDA EMPLEADO POR ID SIN PARAMETRIZAR ------");
           
           while(consulta.next()){
               System.out.println("El ID pertenece al empleado: "+consulta.getString(1));
           }
           System.out.println("--------------------------------------------------------");
        }catch(SQLException ex){
            System.out.println("Error en la consulta: "+select);
        }
    }
    
    public void busquedaEmpleadoIDPara(int id){
        
        String select = "SELECT nombre FROM EMPLEADOS WHERE id = ?";
        
        try{
            PreparedStatement sentencia = conexion.prepareStatement(select);
            sentencia.setInt(1, id); // La columna 1 (de la consulta) set el valor de id
            ResultSet consulta = sentencia.executeQuery();
            System.out.println("----- BUSQUEDA EMPLEADO POR ID PARAMETRIZADO ------");
            
            while(consulta.next()){
                System.out.println("El ID pertenece al empleado: "+consulta.getString(1));
            }
        }catch(SQLException ex){
            System.out.println("Error en la consulta: "+select);                    
        }
    }
    
    public void listadoEmpleadosSueldoLetraCsinPara(){
        
        String select = "SELECT nombre FROM EMPLEADOS WHERE sueldo > 1000 AND nombre LIKE '%u%'";
        
        try{
            PreparedStatement sentencia = conexion.prepareStatement(select);
            ResultSet consulta = sentencia.executeQuery();
            System.out.println("----- EMPLEADO SUELDO > 1000 Y CONTIENE 'c'");
            if(!consulta.next()){
                System.out.println("Ningún empleado cumple los requisitos especificados");
            }else{
                while(consulta.next()){
                    System.out.println("Nombre: "+consulta.getString(1));
                }           
            }         
        }catch(SQLException ex){
            System.out.println("Error en la consulta: "+select);
        }
    }
    
        public void d(){
        
        String select = "SELECT nombre FROM EMPLEADOS WHERE sueldo > 1000 AND nombre LIKE '%u%'";
        
        try{
            PreparedStatement sentencia = conexion.prepareStatement(select, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet consulta = sentencia.executeQuery();
            System.out.println("----- EMPLEADO SUELDO > 1000 Y CONTIENE 'u'");
            if(!consulta.next()){
                System.out.println("Ningún empleado cumple los requisitos especificados");
            }else{
                
                consulta.last();
                
                int pos = consulta.getRow();
                
                consulta.beforeFirst();
                
                for(int i = 1; i < pos; i++){
                    consulta.next();
                    System.out.println("Nombre: "+consulta.getString(1));
                }
            }         
        }catch(SQLException ex){
            System.out.println("Error en la consulta: "+select);
        }
    }
}