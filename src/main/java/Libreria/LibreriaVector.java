/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class LibreriaVector {

    public static float[] introducirNum(int n) {
        Scanner teclado = new Scanner(System.in);
        float[] numeros = new float[n];
        float n2;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + i);
            n2 = teclado.nextFloat();
            numeros[i] = n2;
        }
        mostrarNumeros(numeros);
        return numeros;
    }

    public static void mostrarNumeros(float[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static void mostrarNumerosInverso(int[] numeros) {
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static float mediaPositivos(float[] numeros) {
        float aux, acum = 0, media, cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            aux = numeros[i];
            if (aux > 0) {
                acum += aux;
                cont++;
            }
        }
        return media = acum / cont;
    }

    public static float mediaNegativos(float[] numeros) {
        float aux, acum = 0, media, cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            aux = numeros[i];
            if (aux < 0) {
                acum += aux;
                cont++;
            }
        }
        return media = acum / cont;
    }

    public static int contarCeros(float[] numeros) {
        float aux;
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            aux = numeros[i];
            if (aux == 0) {
                cont++;
            }
        }
        return cont;
    }
}
