
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
        }catch(SQLException ex){
            System.out.println("Error en la consula: "+select);
        }
        System.out.println("");
    }
    
    public void listadoEmpleadosSinOrden(){
        
        String select = "SELECT * FROM EMPLEADOS";
        
        try{
            PreparedStatement sentencia = conexion.prepareStatement(select);
            ResultSet consulta = sentencia.executeQuery();
            System.out.println("----- LISTADO EMPLEADOS SIN ORDEN -----");
            
                while(consulta.next()){
                    System.out.println("ID: "+ consulta.getInt(1) +" Nombre: " +consulta.getString(2) +" Sueldo: " +consulta.getFloat(3));
                }
                System.out.println("");
                while(consulta.previous()){
                    System.out.println("ID: "+ consulta.getInt(1) +" Nombre: " +consulta.getString(2) +" Sueldo: " +consulta.getFloat(3));
                }                
        }catch(SQLException ex){
            System.out.println("Error en la consulta: "+select);
        }
        System.out.println("");
    }
}