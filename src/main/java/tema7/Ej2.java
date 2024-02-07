/*
Escribir una aplicación que solicite al usuario cuantos números desea introducir. 
A continuación, se introducirá por teclado esa cantidad de números enteros, y por último, 
los mostrará en el orden inverso al introducido.
 */
package tema7;

import static Libreria.LibreriaVector.mostrarNumerosInverso;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej2 {

    public static int[] introducirNum(int n) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[n];
        int n2;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + i);
            n2 = teclado.nextInt();
            numeros[i] = n2;
        }
        return numeros;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Cuanto numeros deseas introducir");
        n = teclado.nextInt();
        mostrarNumerosInverso(introducirNum(n));
    }
}
