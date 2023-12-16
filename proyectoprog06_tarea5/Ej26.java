package proyectoprog06_tarea5;

public class Ej26 {


    public static void main(String[] args) {
        
        int[][] v = new int[3][3];
        
        Matrices.introducir_matrizEnteros(v, 3, 3);
        
        for(int i = 0; i < v.length; i++){
            for(int j = 0; j < v[i].length; j++){
                System.out.println(v[i][j]);
            }
        }
    }
}