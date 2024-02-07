/*
Dado el fichero QuijoteDeLaMancha.txt realiza un método que cuente el número de veces que aparece una determinada palabra dentro de dicho fichero. 
Para ello deberás utilizar obligatoriamente la clase split para separar las palabras, 
BufferedReader para leer un fichero y una EED 2D para almacenar todas las palabras y el número de ocurrencias. 
Además la signatura del método a implementar será la siguiente:

public String[][] cuentaPalabras (String nomFichero)

 */
package tema7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej15 {

    public static int cuentaPalabras(String palabra) throws FileNotFoundException, IOException {
        String rutaArchivo = "Quijote.txt";
        int cont = 0;
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        String linea;

        while ((linea = br.readLine()) != null) {
            linea = linea.toLowerCase();
            for (String c : linea.split(" ")) {
                if (c.equalsIgnoreCase(palabra)) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static String[][] rellenaMatriz(String[][] matrizFinal, int aux, String palabra) {
        for (int i = 0; i < matrizFinal.length; i++) {
            matrizFinal[i][0] = palabra;
            for (int j = 0; j < matrizFinal[i].length; j++) {
                matrizFinal[i][j] = aux + "";
            }
        }
        return matrizFinal;
    }

    public static void mostrarMatriz(String[][] matrizFinal) {
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {
                System.out.print(matrizFinal[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int aux;
        String[][] tabla = new String[10][2];
        String palabra;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce la palabra");
            palabra = teclado.nextLine();
            aux = cuentaPalabras(palabra);
            System.out.println(aux);
            rellenaMatriz(tabla, aux, palabra);
            mostrarMatriz(tabla);
        }
    }
}
