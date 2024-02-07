/*
 Escribir una función que retorne la suma de los divisores de un número. El alumno deberá hacer dos versiones de funciones una que permita 
la reutilización de funciones anteriores y otra que no permita realizar internamente ninguna llamada a ninguna otra función.
 */
package tema5;

import Libreria.LibreriaMates;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej11_a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n1,acum=0;
        
        System.out.println("Introduce el valor del numero");
        n1 = teclado.nextInt();

        for (int i = 1; i <= n1; i++) {
            if (n1%i==0) {
                System.out.print(i + " ");
                acum+=i;
            }
        }
        System.out.println("El resultado es: " + acum);
    }
}
