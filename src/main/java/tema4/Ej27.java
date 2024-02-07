/*
 Modifica el ejercicio 25 para que se muestre internamente la figura hueca.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n;

        do {            
            System.out.println("Introduce el numero que sea impar");
            n = teclado.nextInt();
        } while (n<0 || n%2==0);

        for (int i = 0; i <= n; i++) {
            System.out.print("*");
            for (int j = 0; j <= n-2; j++) {
                if (i==0 || i==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println("");
        }
    }
}
