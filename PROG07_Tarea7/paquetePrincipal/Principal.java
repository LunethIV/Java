
package paquetePrincipal;

/**
 *
 * @author Lun
 */
import paquetePublicacion.*;
import paqueteDispositivos.*;

public class Principal {

    public static void main(String[] args) {
        
       // Crea un objeto denominado mia de tipo Biblioteca con nombre “miBiblioteca”.
       Biblioteca mia = new Biblioteca("MiBiblioteca");
       
       // Crea 2 libros y 1 revista.
       Libro libro1 = new Libro("El dia que se perdio la cordura",2021);
       Libro libro2 = new Libro("El informe Pelicano",2000);
       Revista revista = new Revista(1,"Nation Geographic",2023);
       
       // Crea 2 dispositivos electrónicos.
       Dispositivo disp1 = new Dispositivo("Tablet",234,"Galaxy A SM-7585");
       Dispositivo disp2 = new Dispositivo("Tablet",345,"Lenovo M10Plus");
       
       // Presta 2 libros.
       mia.prestarBiblioteca(libro1);
       mia.prestarBiblioteca(libro2);
       
       // Presta 2 dispositivos.
       mia.prestarBiblioteca(disp1);
       mia.prestarBiblioteca(disp2);
       
       // Cuenta los objetos prestados por la biblioteca.
       System.out.println("Número de dispositivos prestados: "+mia.cuentaPrestamosBiblioteca());
       System.out.println(""); 
       // Muestra todos los objetos prestados por la biblioteca.
       mia.prestamosBiblioteca();
       System.out.println("");
       // Reserva 1 libro ya prestado con un teléfono.
       libro1.reservar("123456789");
       
       // Muestra los libros reservados.
       mia.librosBibliotecaReservados();
       System.out.println("");
        
       // Devuelve un libro que está prestado y reservado.
       mia.devolverPrestamoBiblioteca(libro1);
       System.out.println("");
       
       // Muestra todos los objetos prestados por la biblioteca.
       mia.prestamosBiblioteca();
       System.out.println("");
       
       // Devuelve el libro del pto 10
       mia.devolverPrestamoBiblioteca(libro1);
       System.out.println("");
       
       // Muestra todos los objetos prestados por la biblioteca
       mia.prestamosBiblioteca();
       System.out.println("");
       
       // Devuelve un dispositivo.
       mia.devolverPrestamoBiblioteca(disp1);
       System.out.println("");
       
       // Muestra todos los objetos prestados por la biblioteca.
       mia.prestamosBiblioteca();
       System.out.println("");
       
       // Muestra todos los objetos que deberían haberse devuelto.
       mia.prestamosBibliotecaCaducos();
    }
}