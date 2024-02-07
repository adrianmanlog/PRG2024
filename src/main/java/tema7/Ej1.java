/*
Diseñar un programa que solicite al usuario que introduzca por teclado cinco números decimales, 
los almacena en un vector y a continuación muestra los números en el mismo orden que se han introducido.
 */
package tema7;

import static Libreria.LibreriaVector.introducirNum;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("introduce los numeros que quieres introducir");
        n = teclado.nextInt();
        introducirNum(n);
    }
}
