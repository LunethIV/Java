
package paquetePrincipal;

/**
 *
 * @author Lun
 */

import java.time.LocalDate;
import java.util.ArrayList;
import paqueteInterfaces.*;
import paquetePublicacion.*;
import paqueteDispositivos.*;

public class Biblioteca {
    
    // Atributos
    private String nombre;
    private ArrayList<Prestable> prestamos;
    
    // Constructor
    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
    }
    
    // Métodos
    public void prestarBiblioteca(Prestable objeto){
        if(objeto instanceof Libro || objeto instanceof Dispositivo){
            objeto.prestar();
            prestamos.add(objeto);
        }
    }
    
    public void reservarBiblioteca(Reservable libro, String telefono){
        if(prestamos.contains(libro)){
            prestamos.add(libro);
        }else{
            System.out.println("Error, el libro no es encuentra en el Array de prestables");
        }
    }
    
    public int cuentaPrestamosBiblioteca(){
        int contador = 0;
        
        for(Prestable p:prestamos){
            if(p instanceof Libro){
                if(((Libro) p).isPrestado()){
                    contador++;
                }
            }else if(p instanceof Dispositivo){
                if(((Dispositivo) p).isPrestado()){
                    contador++;
                }
            }
        }
        
        return contador;
    }
    
    public void prestamosBibliotecaCaducos(){
        LocalDate hoy = LocalDate.now();
        int prestamosCaducos = 0;
        
        for(Prestable p:prestamos){
            if(p instanceof Libro){
                Libro libro = (Libro) p;
                if(libro.isPrestado() && libro.getFechaDevolucion().isBefore(hoy)){
                    System.out.println("- "+" "+libro.getId()+" "+libro.getTitulo()+" "+libro.getFechaDevolucion());
                    prestamosCaducos++;
                }
            }
        }
        
        for(Prestable p:prestamos){
            if(p instanceof Dispositivo){
                Dispositivo disp = (Dispositivo) p;
                if(disp.isPrestado() && disp.getFechaDevolucion().isBefore(hoy)){
                    System.out.println("-"+disp.getTipo()+disp.getNumReferencia()+disp.getFechaDevolucion());
                    prestamosCaducos++;
                }
            }
        }
        
        if(prestamosCaducos == 0){
            System.out.println("No hay préstamos caducos");
        }else{
            System.out.println("Hay "+prestamosCaducos+" prestamos caducos");
        }
    }
    
    public void librosBibliotecaReservados(){
        int total = 0;
        System.out.println("---LISTADO LIBROS RESERVADOS---");
        for(Prestable p:prestamos){
            if(p instanceof Libro){
                Libro libro = (Libro) p;
                if(libro.isReservado()){
                    System.out.println("- "+libro.getId()+" "+libro.getTitulo());
                    total++;
                }
            }
        }
        
        if(total == 0){
            System.out.println("No hay libros reservados");
        }else{
            System.out.println("El total de libros reservados es: "+total);
        }
    }
    
    public void devolverPrestamoBiblioteca(Prestable objeto){
        
        if(objeto instanceof Libro){
            if(prestamos.contains(objeto)){
                System.out.println("Libro con id="+((Libro) objeto).getId()+" devuelto");
                objeto.devolver();                
                if(!((Libro) objeto).isPrestado()){
                    prestamos.remove(objeto);
                }
                
            }
        }else if(objeto instanceof Dispositivo){
            if(prestamos.contains(objeto)){
                objeto.devolver();
                System.out.println("Prestamo de dispositivo devuelto correctamente");
                if(!((Dispositivo) objeto).isPrestado()){
                    prestamos.remove(objeto);
                }               
            }
        }else if(!prestamos.contains(objeto)){
                System.out.println("Error, el objeto no está prestado en la biblioteca");
        }
    }
    
    public void prestamosBiblioteca(){
        int libros = 0;
        int dispositivos = 0;
        
        System.out.println("---LISTADO DE LIBROS PRESTADOS---");
        for(Prestable p:prestamos){
            if(p instanceof Libro){
                if(((Libro) p).isPrestado()){
                    System.out.println("- "+((Libro) p).getId()+" "+((Libro) p).getTitulo());
                    libros++;
                }
            }
        }
        System.out.println("Hay en total: "+libros+" libros prestados");
        System.out.println("");
        System.out.println("---LISTADO DE DISPOSITIVOS PRESTADOS---");
        for(Prestable p:prestamos){
            if(p instanceof Dispositivo){
                if(((Dispositivo) p).isPrestado()){
                    System.out.println("- "+((Dispositivo) p).getTipo()+" "+((Dispositivo) p).getModelo());
                    dispositivos++;
                }
            }
        }
        System.out.println("Hay en total: "+dispositivos+" dispositivos prestados");
    }
}