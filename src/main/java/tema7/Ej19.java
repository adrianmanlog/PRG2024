/*
Realiza un programa que pida ‘x’ números enteros separados por espacios. Rellene y muestre
cubos de tamaño 3x3, cortada a cortada con números en serie 1,2,3,... n, siendo ‘n’ uno de los
casos de prueba. Las posiciones f,c de cada tabla tendrá el mismo número de secuencia. Este
es un ejemplo del tipo: “casos de prueba ilimitados” del PROGRAMAME.

1º Curso. Desarrollo de Aplicaciones Web y Multiplataforma
Estructuras Estáticas de Datos

Programación David Pérez Lledó
Ejemplo.
5 2 6
1 2 3  1 2 3  1 2 3
4 5 1  4 5 1  4 5 1
2 3 4  2 3 4  2 3 1
La línea en blanco no es necesaria se añade por aclaración
1 2 1  1 2 1  1 2 1
2 1 2  2 1 2  2 1 2
1 2 1  1 2 1  1 2 1
La línea en blanco no es necesaria se añade por aclaración
1 2 3  1 2 3  1 2 3
4 5 6  4 5 6  4 5 6
1 2 3  1 2 3  1 2 3
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej19 {

    public static String pedirCadena(String msg) {
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.println(msg);
        cadena = teclado.nextLine();
        return cadena;
    }

    public static int[][][] rellenaMatrizCaracter(int[][][] matrizFinal, int num) {
        int aux = 1;

        for (int i = 0; i < matrizFinal.length; i++) {
            aux=1;
            for (int j = 0; j < matrizFinal[i].length; j++) {
                for (int k = 0; k < matrizFinal[i][j].length; k++) {
                    matrizFinal[k][i][j] = aux;
                    aux++;
                    if (aux > num) {
                        aux = 1;
                    }
                }
            }
        }
        return matrizFinal;
    }

    public static void mostrarCubo(int[][][] matrizFinal) {
        for (int i = 0; i < matrizFinal.length; i++) {
            System.out.println("Cortada" + i);
            for (int j = 0; j < matrizFinal[i].length; j++) {
                for (int k = 0; k < matrizFinal[i][j].length; k++) {
                    System.out.print(matrizFinal[k][i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) {
        int[][][] cubo = new int[3][3][3];
        int num;
        String cadena = pedirCadena("Introduce los numeros separados por espcios");
        String[] matrizSplit = cadena.split(" ");
        for (int i = 0; i < matrizSplit.length; i++) {
            num = Integer.parseInt(matrizSplit[i]);
            rellenaMatrizCaracter(cubo, num);
            mostrarCubo(cubo);
        }

    }
}
