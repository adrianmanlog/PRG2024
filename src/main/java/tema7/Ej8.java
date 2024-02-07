/*
Leer una serie de 6 enteros que se almacenarán en un vector que hay que ordenar y mostrarlos por pantalla, a continuación, leer otra serie de 6 enteros, 
que también se guardarán en un vector y se mostrarán ordenados (Para estas operaciones podéis utilizar los métodos de la clase Arrays). 
Finalmente, fusionar los dos vectores en un tercero, de forma que los 12 números sigan ordenados (prohibido usar la clase Arrays para esto último). 
 */
package tema7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej8 {

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
    public static int[] unirFinal(int[] aux,int[] aux2 ) {
        int[] aux3= new int[12];
        int cont=0;
        for (int i = 0; i < aux2.length; i++) {
            aux3[i]=aux[i];
            
        }
        cont=aux2.length;
        for (int i = 0; i < aux2.length; i++) {
            aux3[cont]=aux2[i];
            cont++;
        }
        Arrays.sort(aux3);
        return aux3;
    }

//    public static int[] ordenarFinal(int[] aux4) {
//       int[] ordenFinal =new int[aux4.length];
//        for (int i = 0; i < ordenFinal.length; i++) {
//            
//        }
//    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 6;
        int[] aux, aux2,aux4,aux5;
        
        System.out.println("Introduce la primera cadena de numeros");
        aux = introducirNum(n);
        Arrays.sort(aux);
        System.out.println(Arrays.toString(aux));
        
        System.out.println("Introduce la segunda cadena de numeros");
        aux2 = introducirNum(n);
        Arrays.sort(aux2);
        System.out.println(Arrays.toString(aux2));
        
        aux4=unirFinal(aux, aux2);
        System.out.println(Arrays.toString(aux4));
        
//        aux5=ordenarFinal(aux4);
    }
}
