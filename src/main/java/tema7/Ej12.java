/*
Realizar un programa que rellene una tabla (EED de 2 dimensiones), con caracteres introducidos por el usuario. 
Los caracteres se deben introducir con Scanner y haciendo uso de split. El número de filas será 5, 
pero el número de columnas  de la tabla será irregular (como aparece en la imagen): fila 0 -> sólo una columna, 
fila 1 -> sólo dos columnas … y posteriormente los muestre por pantalla.
 	0  1  2  3
        0 |x|
	1 |x||x|
	2 |x||x||x|
	3 
	4 |x||x||x||x|

 */
package tema7;

import Libreria.LibreriaMates;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej12 {

//    public static char[][] rellenaMatrizCaracter(char[][] matrizCarac) {
//        Scanner teclado = new Scanner(System.in);
//        char caracter;
//        for (int i = 0; i < matrizCarac.length; i++) {
//            for (int j = 0; j < matrizCarac[i].length; j++) {
//                System.out.println("Introduce un caracter");
//                caracter = teclado.next().charAt(0);
//                matrizCarac[i][j] = caracter;
//            }
//        }
//        return matrizCarac;
//    }
    public static char[][] rellenaMatrizCaracter(char[][] matrizCarac, String caracter) {
        int x=0;
        String[] matrizSplit = caracter.split(" ");
        for (int i = 0; i < matrizCarac.length; i++) {
            for (int j = 0; j < matrizCarac[i].length; j++) {
                matrizCarac[i][j] = matrizSplit[x++].charAt(0);
            }
        }
        return matrizCarac;
    }

    public static void mostrarMatrizCarac(char[][] matrizFinal) {
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {
                System.out.print(matrizFinal[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[][] matrizCarac = new char[5][];
        String caracter;
        for (int i = 0; i < matrizCarac.length; i++) {
            matrizCarac[i] = new char[LibreriaMates.leerNumeroPosi("Introduce el numero de columnas")];
        }

        System.out.println("Introduce los caracteres separados por espacios");
        caracter = teclado.nextLine();
        rellenaMatrizCaracter(matrizCarac, caracter);

        mostrarMatrizCarac(matrizCarac);
    }
}
