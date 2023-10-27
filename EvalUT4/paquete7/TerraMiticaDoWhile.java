// @author Lun

package paquete7;

public class TerraMiticaDoWhile {


    public static void main(String[] args) {
        int aforo = 0;
        int bebés = 0;
        int niños = 0;
        int adolescentes = 0;
        int adultos = 0;
        int recaudacionNiños = 0;
        int recaudacionAdolescentes = 0;
        int recaudacionAdultos = 0;
        int recaudacionTotal = 0;
        int precioEntradaNiños;
        int precioEntradaAdolescentes;
        int precioEntradaAdultos;
        int niñosPesoInferior = 0;
        int niñosSobrepeso = 0;
        int adolescentesPesoNormal = 0;
        int adolescentesSobrepeso = 0;
        int adultosPesoSuperior = 0;
        int adultosSobrepeso = 0;
        
        System.out.println("______________________________________________________________________");
        int hora = Leer.enteroPositivo("Introduce la hora, el parque abre de 8:00 a 19:00 y a las 20:00 cierra");
        
        if (hora >= 8 && hora <= 19){
            
            do {
                String nombre = Leer.cadena("Introduce el nombre");
                int edad = Leer.enteroPositivo("Introduce la edad");
                double peso = Leer.realDoblePositivo("Introduce el peso");
                short altura = (short) Leer.enteroPositivo("Introduce la altura");
                
                byte imc = Calculo.imc(peso, altura);
                
                // Calcular precio de las entradas en función de la edad, controlar aforo y recaudación.
                if (edad < 4){
                     bebés++;
                     aforo++;
                }
                if (edad >= 4 && edad < 12){
                    niños++;
                    precioEntradaNiños = 8;
                    recaudacionNiños += precioEntradaNiños;
                    aforo++;
                }
                if (edad >= 12 && edad <= 23){
                    adolescentes++;
                    precioEntradaAdolescentes = 15;
                    recaudacionAdolescentes += precioEntradaAdolescentes;
                    aforo++;
                }
                if (edad > 23){
                    adultos++;
                    precioEntradaAdultos = 20;
                    recaudacionAdultos += precioEntradaAdultos;
                    aforo++;
                }                
 
                // Calcular la recaudación total
                recaudacionTotal = (recaudacionNiños + recaudacionAdolescentes + recaudacionAdultos);
                
                // Calcular imc de la gente
                if (edad >= 4 && edad < 12 && imc == 1){
                    niñosPesoInferior++;
                }
                else if (edad >= 4 && edad < 12 && imc == 4){
                    niñosSobrepeso++;
                }
                if (edad >= 12 && edad <= 23 && imc == 2){
                    adolescentesPesoNormal++;
                }
                else if (edad >= 12 && edad <= 23 && imc == 4){
                    adolescentesSobrepeso++;
                }
                if (edad > 23 && imc == 3){
                    adultosPesoSuperior++;
                }
                else if (edad > 23 && imc == 4){
                    adultosSobrepeso++;
                }
            }while (aforo < 3000 && hora != 20);
            
            System.out.println("Número de niños que han asistido: " + niños);
            System.out.println("Número de niños con peso inferior al normal: " + niñosPesoInferior);
            System.out.println("Número de niños con sobrepeso: " + niñosSobrepeso);
            System.out.println("La recaudación por niños es: " + recaudacionNiños);
            System.out.println("Número de adolescentes que han acudido: " + adolescentes);
            System.out.println("Número de adolescentes con peso normal: " + adolescentesPesoNormal);
            System.out.println("Número de adolescentes con sobrepeso: " + adolescentesSobrepeso);
            System.out.println("La recaudación por adolescentes es: " + recaudacionAdolescentes);
            System.out.println("Número de adultos que ha asistido es: " + adultos);
            System.out.println("Número de adultos con peso superior al normal: " + adultosPesoSuperior);
            System.out.println("Número de adultos con sobrepeso: " + adultosSobrepeso);
            System.out.println("La recaudación por adultos es: " + recaudacionAdultos);
            System.out.println("Total de personas que han entrado al parque: " + aforo);
            System.out.println("Recaudación total: " + recaudacionTotal);
        }
        else{
            System.out.println("Está cerrado");
        }
    }
}
