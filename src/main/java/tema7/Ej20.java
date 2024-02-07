/*
Crear una tabla de tamaño NxN y rellenarla de la siguiente forma: la posición [f,c] debe contener como valor la suma de f+c. 
Después se debe mostrar su contenido. Inicialmente se indicará el número de casos de prueba a  tratar y después por cada caso mostraremos la tabla correspondiente. 
Este es un ejemplo del tipo: “casos de prueba limitados a un primer número” del PROGRAMAME.

Ejemplo de entrada
3 (Casos a tratar)
4 2 1
Salida correspondiente:
0 1 2 3
1 2 3 4
2 3 4 5
3 4 5 6
2
0 1
1 2
1
0


 */
package tema7;

import Libreria.LibreriaMates.*;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Vespertino
 */
public class Ej20 {

    public static int leerNumeroPosi(String msg) {
        Scanner teclado = new Scanner(System.in);
        int n;

        do {
            System.out.println(msg);
            n = teclado.nextInt();
        } while (n < 0);
        return n;
    }

    public static int[][] rellenaMatriz(int[][] matrizFinal) {
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {
                matrizFinal[i][j] = i+j;
            }
        }
        System.out.println("");
        return matrizFinal;
    }

    public static void mostrarMatriz(int[][] matrizFinal) {
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {
                System.out.print(matrizFinal[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int numCadena;
        String cadena;
        String[] vectorCadena;
        
        System.out.println("Introduce la cadena");
        cadena=teclado.nextLine();
        
        vectorCadena= cadena.split(" ");
        for (int i = 0; i < vectorCadena.length; i++) {
            numCadena=Integer.parseInt(vectorCadena[i]);
            int[][] tabla = new int[numCadena][numCadena];
            rellenaMatriz(tabla);
            mostrarMatriz(tabla);
        }
        
    }
}
