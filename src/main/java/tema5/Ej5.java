/*
Diseñar una función que reciba dos números a y b. La función devolverá true o false indicando si b es un divisor de a.
 */
package tema5;

import Libreria.LibreriaMates;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n1,n2;
        boolean aux;
        
        System.out.println("Introduce el valor de los dos numeros separados con espacios");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        
        aux= LibreriaMates.esDivisor(n1, n2);
        System.out.println(n2 + " Es divisor de " + n1 + ":" + aux);
    }
}
