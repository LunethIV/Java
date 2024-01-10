
package paqueteTriangulo;

public class Principal2 {

    public static void main(String[] args) {
        
        // a) Crea los triángulos: t1 y t2
        Triangulo t1 = new Triangulo(10,12);
        Triangulo t2 = new Triangulo(7,5);
        
        // b) Muestra los valores de los dos triángulos (base, altura e hipotenusa).
        System.out.println(t1.getBase());
        System.out.println(t1.getAltura());
    }
    
}
