/*
Realizar un programa en Java que muestre los números entre 1 y 100 salvo los múltiplos del
número que indique previamente el usuario.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n;
        
        System.out.println("Introduce un numero entre 1 y 10");
        n= teclado.nextInt();
        
        for (int i = 0; i < 100; i++) {
            if (i%n==0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
