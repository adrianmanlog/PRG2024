/*
Realizar un programa en java que rellene con numeros aleatorios (1 y 100) de tamaño f y c, f y c se los pedimos al usuario. Despues mostraremos por pantalla
 */
package tema7;

import Libreria.LibreriaMates;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej10 {
    public static int[][] rellenaMatriz(int f, int c) {
        int aux;
        int[][] tabla= new int[f][c];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                aux= (int) (Math.random()*99+1);
                tabla[i][j]=aux;
            }
        }
        return tabla; 
    }
    public static void mostrarMatriz(int[][] matrizFinal) {
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {
                System.out.print (matrizFinal[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int f,c;
        int[][] matrizFinal;
        f=LibreriaMates.leerNumeroPosi("Introduce el valor de las filas");
        c=LibreriaMates.leerNumeroPosi("introduce el numero de las columnas");
        
        matrizFinal=rellenaMatriz(f, c);
        mostrarMatriz(matrizFinal);
        
    }
}
