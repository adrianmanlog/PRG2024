/*
Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.
 */
package pruebas;

import java.util.Scanner;


public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n1,n2;
        
        System.out.println("Introduce 2 numeros");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        
        for (; n1 <= n2; n1++) {
            if (n1%2!=0) {
                continue;
            }
            System.out.println(n1);
        }
    }
}
