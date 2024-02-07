/*
Realizar un programa en Java que rellene una EED de 3 dimensiones (cubo) de tamaño 3 filas x 3 columnas x 3 de profundidad. 
Posteriormente mostrará el cubo “cortada por cortada”. La rellenaremos con números consecutivos y la mostraremos por pantalla.
1 2 3	10 11 12 	20 21 22	
4 5 6	13 14 15	23 24 25
7 8 9	16 17 18	26 27 28
 */
package tema7;

/**
 *
 * @author Vespertino
 */
public class Ej14 {

    public static int[][][] rellenaCubo(int[][][] matrizFinal) {
        int aux = 1;
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {
                for (int k = 0; k < matrizFinal[i][j].length; k++) {
                    matrizFinal[k][i][j] = aux;
                    aux++;
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
        int[][][] matrizFinal = new int[3][3][3];

        matrizFinal = rellenaCubo(matrizFinal);
        mostrarCubo(matrizFinal);
    }
}
