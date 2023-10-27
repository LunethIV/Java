//Determinad el valor final de las variables x,y y z en cada apartado.

//@author Lun

package paquete3;

public class unarios {

    public static void main(String[] args) {
    apartado1();
    apartado2();
    apartado3();
    apartado4();
    apartado5();
    }    
    
    public static void apartado1 (){
     int x = 13;
     x++;
     System.out.println(x);
    
    }  
    
    public static void apartado2(){
    int x = 24;
    ++x;
    System.out.println(x);
    }
    
    public static void apartado3 (){
        int x = 19;
        int y = 25;
        
        int z = x + y++;
        
        System.out.println(z);
    }
    
    public static void apartado4 () {
        int x = 19;
        int y = 25;
        
        int z = x + ++y;
        
        System.out.println(z);
    }
    
    public static void apartado5 () {
        int x = 19;
        int y = 25;
        
        int z = --x + y++;
        
        System.out.println(z);
    }
}