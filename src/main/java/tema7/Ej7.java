/*
Implementar la función sinRepetidos() con el prototipo siguiente:
int[] sinRepetidos(int t[])
que construye y devuelve un vector del tamaño apropiado, con los elementos de t donde se han eliminado los datos repetidos. 

 */
package tema7;

import Libreria.LibreriaMates;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej7 {

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

    public static int[] sinRepetidos(int[] repetidos) {
        int aux,aux2,cont = 0,cont2=0;
        int[] arrayFin=new int[repetidos.length];
        for (int i = 0; i < repetidos.length; i++) {
            aux = repetidos[i];
            cont = 0;
            for (int j = 0; j < repetidos.length; j++) {
                aux2=repetidos[j];
                if (aux == aux2) {
                    cont++;
                }
            }
            if (cont<2) {
                arrayFin[cont2]= aux;
                cont2++;
            }
        }
        return arrayFin;
    }
    public static StringBuilder eliminarCeros(int[] sinRepetidos) {
        StringBuilder cadena= new StringBuilder();
        int aux;
        
        for (int i = 0; i < sinRepetidos.length; i++) {
            aux=sinRepetidos[i];
            if (aux==0) {
                continue;
            }
            cadena.append(aux).append(" ");
        }
        return cadena;
    }

    public static void main(String[] args) {
        int n;
        int[] aux;
        n = LibreriaMates.leerNumeroPosi("Introduce el tamaño del vector");
        int[] repetidos = introducirNum(n);
        aux=sinRepetidos(repetidos);
        System.out.println(eliminarCeros(aux));
    }

}
