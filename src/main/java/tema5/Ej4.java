/*
Diseña una función cuyo cometido sea el mismo que el del ejercicio 1 pero esta vez, se
recibirán tres números y devolverá máximo de los tres.
 */
package tema5;

import Libreria.LibreriaMates;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n1, n2, n3,aux;
        
        System.out.println("Introduce 3 numeros separados con espacios");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();
        
        aux= LibreriaMates.maximo(n1,n2,n3);
        
        System.out.println("El maximo es: " + aux);
        
    }
}
