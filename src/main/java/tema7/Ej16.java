/*
Realiza un programa que contenga un método que rellene la matriz con números en secuencia 1,2,3,1 … 
de izquierda a derecha y de arriba a abajo. El método recibirá la matriz vacía y modificará su contenido. 
Posteriormente muestra la tabla por pantalla
      Ejemplo: si tamaño = 4
1 2 3 1
2 3 1 2 
3 1 2 3
1 2 3 1

 */
package tema7;

import Libreria.LibreriaMates;

/**
 *
 * @author Vespertino
 */
public class Ej16 {

    public static int[][] rellenaMatriz(int[][] matrizFinal) {
        int aux=1;
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {
                matrizFinal[i][j] = aux;
                aux++;
                if (aux>=4) {
                    aux=1;
                }
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
        int aux=LibreriaMates.leerNumeroPosi("Introduce el tamaño de la matriz");
        int[][] matrizFinal = new int[aux][aux];
        rellenaMatriz(matrizFinal);
        mostrarMatriz(matrizFinal);
    }
}
