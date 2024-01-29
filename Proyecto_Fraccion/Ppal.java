package paqueteFraccion;

public class Ppal {

    public static void main(String[] args) {       
        
        // a) Crea la fracción f con 27 y 5, numerador y denominador, respectivamente.
        Fraccion f = new Fraccion(27,5);
        
        // b) Crea la fracción g con los valores 1, 1 (Constructor por defecto).
        Fraccion g = new Fraccion();
        
        // c) Crea la fracción h cuyos valores coinciden con los de g (Constructor por copia).
        Fraccion h = new Fraccion(g);
        
        // d) Crea la fracción j con dos enteros introducidos por teclado.
        int num = Introducir.entero("Establecer numerador: ");
        int den = Introducir.entero("Establecer denominador: ");
        Fraccion j = new Fraccion(num,den);
        
        // e) Muestra los valores de las 4 fracciones.
        System.out.println(f.toString() + "\n" + g.toString() + "\n" + h.toString() + "\n" + j.toString());

        // f) Cambia el numerador y denominador de la fracción f por los valores del denominador de g y del numerador de h, respectivamente. Muestra f
        f.setNum(h.getNum());
        f.setDen(g.getDen());
        System.out.println("El nuevo valor de f es: " + f.toString());
        
        // g) Crea un quebrado k resultante de la resta de los quebrados g y f. Muestra k
        Fraccion k = g.resta(f);
        System.out.println("Valor de k: " + k.toString());
        
        // h) Crea una fracción l resultado del cociente entre el quebrado h y el formado por los valores 18 y 5. Muestra l
        Fraccion l = h.cociente(18, 5);
        System.out.println("l vale: " + l);
        
        // i) Muestra la fracción resultante del producto de la fracción suma f y g con la fracción k.
        Fraccion suma = f.suma(g);
        Fraccion resultante = suma.producto(k);
        System.out.println("La fracción resultante es: " + resultante);
        
        // ) Crea un quebrado n generado por la fórmula: n = g / (h – f). Muestra n.
        Fraccion n = g.cociente(h.resta(f));
        System.out.println("n vale: " + n.toString());
        
        // k) Crea una fracción m, calculando: m= j-(l+23/8)). Muestra m.
        Fraccion aux = new Fraccion(23,8);
        
        Fraccion m = j.resta(l.suma(aux));
        System.out.println("m vale: " + m.toString());
        
        // l) Crea una fracción o, con numerador -> el denominador de la fracción suma de f y h, y denominador -> el denominador de la fracción resta g y m.
        Fraccion aux2 = f.suma(h);
        Fraccion aux3 = g.resta(m);
        Fraccion o = new Fraccion(aux2.getDen(), aux3.getDen());
        
        // m) Comprueba si g y la fracción 45/2 son iguales.
        if(g.equals(45,2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales: ");
        }
        
        // n) Comprueba si el punto o y p son iguales.
        if(o.equals(l)){
            System.out.println("o y l son iguales");
        }else{
            System.out.println("o y l no son iguales");
        }
    }
}