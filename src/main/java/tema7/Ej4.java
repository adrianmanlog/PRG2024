/*
Implementar un programa que inicialice un array con nuestros números favoritos. A continuación, pedir al usuario el índice de un elemento que será eliminado del array. 
Continuaremos eliminando elementos hasta que el índice introducido sea negativo o hasta que no existan más elementos que borrar. 
Es imprescindible controlar que el índice corresponde a un dato válido. Mostraremos los números que no han sido borrados al final.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej4 {

    public static int[] eliminaNumero(int[] numeros, int n) {
        if (n > numeros.length) {
            System.out.println("Error n es mas grande que el indice");
        } else {
            System.out.println("Has borrado la posicion: " + n);
            numeros[n] = 0;
        }
        return numeros;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        int[] numeros =new int[6];
        numeros[0]=8;
        numeros[1]=25;
        numeros[2]=24;
        numeros[3]=31;
        numeros[4]=4;
        numeros[5]=6;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el indice que quieres borrar de adelante");
            n = teclado.nextInt();
            if (n<0) {
                break;
            }
            eliminaNumero(numeros, n);
        }
        for (int i = 0;; i++) {
            System.out.print(numeros[i]+ " ");
        }
        
    }
}
