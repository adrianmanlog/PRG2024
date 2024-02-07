/*
Escribir un programa que solicite al usuario elementos de una matriz de tamaño 3x3 con números aleatorios entre 0 y 9. 
La aplicación debe decidir si la matriz introducida corresponde a un matriz mágica, 
que es aquella donde la suma de los elementos de cualquier fila o de cualquier columna valen lo mismo. 

Ejemplo de matriz mágica..
    2  7  6
    9  5  1
    4  3  8

 */
package tema7;

/**
 *
 * @author Vespertino
 */
public class Ej13 {

    public static int[][] rellenaMatriz(int[][] matrizFinal) {
        int aux;
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {
                aux = (int) (Math.random() * (9 + 1 - 0) + 0);
                matrizFinal[i][j] = aux;
            }
        }
        return matrizFinal;
    }

    public static boolean esMagica(int[][] matrizMagica) {
        int aux, acum = 0, acum2 = 0, acum3 = 0, acumcolum1 = 0, acumcolum2 = 0, acumcolum3 = 0;
        for (int i = 0; i < matrizMagica.length; i++) {
            for (int j = 0; j < matrizMagica[i].length; j++) {
                aux = matrizMagica[i][j];
                if (i == 0) {
                    acum += aux;
                    if (j == 0) {
                        acumcolum1 += aux;
                    }
                    if (j == 1) {
                        acumcolum2 += aux;
                    }
                    if (j == 2) {
                        acumcolum3 += aux;
                    }
                }
                if (i == 1) {
                    acum2 += aux;
                    if (j == 0) {
                        acumcolum1 += aux;
                    }
                    if (j == 1) {
                        acumcolum2 += aux;
                    }
                    if (j == 2) {
                        acumcolum3 += aux;
                    }
                }
                if (i == 2) {
                    acum3 += aux;
                    if (j == 0) {
                        acumcolum1 += aux;
                    }
                    if (j == 1) {
                        acumcolum2 += aux;
                    }
                    if (j == 2) {
                        acumcolum3 += aux;
                    }
                }
            }
        }
        if (acum == acum2 && acum == acum3 && acum == acumcolum1 && acum == acumcolum2 && acum == acumcolum3) {
            return true;
        }
        return false;
    }

    public static void mostrarMatriz(int[][] matrizFinal) {
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {
                System.out.print(matrizFinal[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void respuesta(boolean respuesta) {
        if (respuesta) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz no es magica");
        }
    }

    public static void main(String[] args) {
        int[][] matrizMagica = new int[3][3];
        boolean respuesta;
        rellenaMatriz(matrizMagica);
        respuesta = esMagica(matrizMagica);
        mostrarMatriz(matrizMagica);
        respuesta(respuesta);

    }
}
