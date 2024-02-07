/*
Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números. 
Realizar la media de los números positivos, la media de los negativos y contar el número de ceros introducidos.
 */
package tema7;

import static Libreria.LibreriaVector.*;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej3 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Cuanto numeros deseas introducir");
        n = teclado.nextInt();
        float[] numeros =introducirNum(n);
        System.out.println("La media de los Positivos es: " + mediaPositivos(numeros));
        System.out.println("La media de los Negativos es: " + mediaNegativos(numeros));
        System.out.println("Este es el numero de 0: " + contarCeros(numeros));

    }
}
