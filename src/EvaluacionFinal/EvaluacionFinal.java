package EvaluacionFinal;
import java.util.Scanner;
import java.util.ArrayList;

public class EvaluacionFinal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       String[] nombres = new String[6];
        //Ejercicio 1
        for (int i=0; i< nombres.length; i++){
            System.out.println("Ingrese el nombre N" + i);
            nombres[i]= sc.nextLine();
        }
        for (int j = 0;j< nombres.length; j++ ){
            System.out.println("El nombre en la posición " + j + " es " + nombres[j]);
        }
        System.out.println("La extension del Array es de => "+ nombres.length);

        System.out.println("-----------------------------------------------------");

        //Ejercicio 2

      int[][] edadesFamiliares = {{83, 25, 65}, {98, 45, 32}, {46, 14, 8}};
        for (int i = 0; i < edadesFamiliares.length; i++) {
            for (int j = 0; j < edadesFamiliares[i].length; j++) {
                System.out.print(edadesFamiliares[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("-----------------------------------------------------");
        //Ejercicio 3

        String [][] infoJugadores = {{"Juan", "15 años", "Delantero"},{"Pedro", "16 años", "Defensa"},{"Luis", "17 años", "Arquero"}};
        for (int i = 0; i < infoJugadores.length; i++) {
            for (int j = 0; j < infoJugadores[i].length; j++) {
                System.out.print(infoJugadores[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");

        //Ejercicio 4

        System.out.println("La posicion 2,2 de la matriz es "+infoJugadores[2][2]);

        System.out.println("-----------------------------------------------------");

        //Ejercicio 5
        System.out.println("La posicion 1,1 de la matriz es "+infoJugadores[1][1]);

        System.out.println("-----------------------------------------------------");

        // Ejercicio 6
        System.out.println("Indique cuantos elementos va a ingresar");
        int longitudElementos = sc.nextInt();
        ArrayList<Integer> elementos = new ArrayList<Integer>();
        do{
            System.out.println("Ingrese un numero entero");
            int numero = sc.nextInt();
            elementos.add(numero);
        }while((elementos.size()<longitudElementos));

        System.out.println("-----------------------------------------------------");

        // Ejercicio 7
        for (int i = 0; i<elementos.size(); i++){
            System.out.println("El elemento en posicion " + i + " es => " + elementos.get(i));
        }

    }
}
