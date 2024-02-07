/*
Leer el fichero Quijote.txt con la famosa novela de Miguel de Cervantes y mostrar por pantalla cuantas veces aparece cada una de las vocales en dicho fichero. 
Deberéis buscar el modo de leer un fichero de texto en google.
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
public class Ej9 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String rutaArchivo = "Quijote.txt";

        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        String linea;

        while ((linea = br.readLine()) != null) {
            linea = linea.toLowerCase();
            for (char caracter : linea.toCharArray()) {
                switch (caracter) {
                    case 'a':
                        contadorA++;
                        break;
                    case 'e':
                        contadorE++;
                        break;
                    case 'i':
                        contadorI++;
                        break;
                    case 'o':
                        contadorO++;
                        break;
                    case 'u':
                        contadorU++;
                        break;
                }
            }
        }
        System.out.println("Frecuencia de vocales en Quijote.txt:");
        System.out.println("A: " + contadorA);
        System.out.println("E: " + contadorE);
        System.out.println("I: " + contadorI);
        System.out.println("O: " + contadorO);
        System.out.println("U: " + contadorU);
    }
}
