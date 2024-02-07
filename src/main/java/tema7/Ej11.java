/*
Realizar un programa en java que rellene con numeros aleatorios (1 y 100) de tamaño f y c, f y c se los pedimos al usuario. Despues mostraremos por pantalla, la tabla sera irregular.
 */
package tema7;

import Libreria.LibreriaMates;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej11 {

    public static int[][] rellenaMatriz(int[][] matrizFinal, int max,int min) {
        int aux;
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {
                aux = (int) (Math.random() * (max+1-min) + min);
                matrizFinal[i][j] = aux;
            }
        }
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
        int max = LibreriaMates.leerNumeroPosi("introduce el rango maximo");
        int min = LibreriaMates.leerNumeroPosi("introduce el rango minimo");
        int[][] matrizFinal = new int[LibreriaMates.leerNumeroPosi("Introduce el numero de filas")][];
        
        for (int i = 0; i < matrizFinal.length; i++) {
            matrizFinal[i] = new int[LibreriaMates.leerNumeroPosi("introduce el numero de columnas")];
        }

        matrizFinal = rellenaMatriz(matrizFinal, max,min);

        mostrarMatriz(matrizFinal);

    }
}
