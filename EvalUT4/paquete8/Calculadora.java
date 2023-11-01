//@author Lun

package paquete8;

public class Calculadora {

    public static void main(String[] args) {
        
        int opcion;
    
        do {
            MiClase.subrayado();
            MiClase.menu();
            opcion = MiClase.enteroEntre("Opcion (1-5)", 1, 5);
                      
            switch(opcion){               
                case 1 -> MiClase.sumar();
                case 2 -> MiClase.restar();
                case 3 -> MiClase.multiplicar();
                case 4 -> MiClase.dividir();
                default -> {MiClase.subrayado(); System.out.println("Fin de programa");}                   
            }
        }while(opcion != 5);
    }
}