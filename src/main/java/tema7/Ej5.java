/*
Leer y almacenar n números enteros en un array. 
A partir de este se construirán otros dos vectores con los elementos  pares e impares del primer vector. 
Una vez finalizada la operación mostraremos los dos arrays por pantalla.
 */
package tema7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej5 {

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

    public static int[] listadoPar(int[] numeros) {
        int cont = 0,c=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                cont++;
            }
        }
        int[] numerosPares = new int[cont];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numerosPares[c++] = numeros[i];
            }
        }
        return numerosPares;
    }

    public static int[] listadoImpar(int[] numeros) {
        int cont = 0,c=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                cont++;
            }
        }
        int[] numerosImpares = new int[cont];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                numerosImpares[c++] = numeros[i];
            }
        }
        return numerosImpares;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Cuanto numeros deseas introducir");
        n = teclado.nextInt();
        int[] numeros = introducirNum(n);
        int[] aux1=listadoPar(numeros);
        int[] aux2=listadoImpar(numeros);
        System.out.println(Arrays.toString(aux1));
        System.out.println(Arrays.toString(aux2));
    }
}
