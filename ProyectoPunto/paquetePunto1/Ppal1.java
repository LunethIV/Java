
package paquetePunto1;


public class Ppal1 {

    public static void main(String[] args) {
        
        // a) Crea los puntos
        Punto p = new Punto(12,10);
        Punto q = new Punto(5,7);
        Punto r = new Punto(9,5);
        Punto s = new Punto(4,3);
        
        // b) Muestra los valores de las coordenadas de los 4 puntos.
        System.out.println("X del punto p: "+p.getX());
        System.out.println("Y del punto p: "+p.getY());
        
        System.out.println("");
        
        System.out.println("X del punto q: "+p.getX());
        System.out.println("Y del punto q: "+p.getY());
        
        System.out.println("");
        
        System.out.println("X del punto r: "+p.getX());
        System.out.println("Y del punto r: "+p.getY());
        
        System.out.println("");
        
        System.out.println("X del punto s: "+p.getX());
        System.out.println("Y del punto s: "+p.getY());
        
        System.out.println("");
        
        // c) Muestra la distancia existente entre los puntos p y q.
        System.out.println("La distancia es: " + p.distancia(q));
        
        System.out.println("");

        // d) Muestra la distancia existente entre el punto r y el punto formado por los valores 8 y 7
        System.out.println("Distancia entre r y 8 y 7" + r.distancia(8, 7));
        
        System.out.println("");

        // e) Cambia la x del punto q por el valor de la y y del punto p. Muestra el punto q.        
        q.setX(p.getY());
        System.out.println("Valor de q: " + q);
        
        System.out.println("");
        
        // f) Crea un punto o, que es copia del punto p
        Punto o = p.clone();       
        
        // g) Muestra el punto o y p
        System.out.println("Valores del punto p: " + p);
        System.out.println("Valores del punto o: " + o);
        
        System.out.println("");
          
        // h) El punto t será el punto suma resultante de la suma entre el punto o y q.
        Punto t = o.puntoSuma(q);
        
        // i) Muestra los puntos: o, q y t
        System.out.println("Valores del punto q: " + q);
        System.out.println("Valores del punto o: " + o);
        System.out.println("Valores del punto t: " + t);
        
        // j) El punto u será el punto intermedio entre p y t.
        Punto u = p.puntoIntermedio(t);
        
        System.out.println("");
        
        // k) Muestra las coordenadas de los puntos p, t y u
        System.out.println("Valores del punto p: " + p);
        System.out.println("Valores del punto t: " + t);
        System.out.println("Valores del punto u: " + u);
        
        System.out.println("");
        // l) El punto v será el opuesto del punto intermedio de los puntos generados por la suma de p y q y el opuesto de t.
        Punto v = p.puntoSuma(q); // v + (p+q)
        v = t.ptoOpuesto().puntoIntermedio(v); // v = punto intermedio de (p+t almacenado en v) y el opuesto de t
        v = v.ptoOpuesto(); // v = Lo opuesto de los calculado previamente
        
        // m) Muestra todos los puntos
        System.out.println("Valores del punto v: " + v);
        System.out.println("Valores del punto p: " + p);
        System.out.println("Valores del punto t: " + t);
        System.out.println("Valores del punto u: " + u);
        System.out.println("Valores del punto q: " + q);
        System.out.println("Valores del punto o: " + o);
        System.out.println("Valores del punto r: " + r);
        System.out.println("Valores del punto w: " + s);
        
        System.out.println("");
        // n) Comprueba si el punto o y p son iguales
        if(o.equals(p)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
}