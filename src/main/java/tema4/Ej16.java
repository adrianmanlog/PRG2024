/*
Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado,
utilizando “*” para ello.
Ejemplo si n=5
****
***
**
*
 */
package tema4;

import java.util.Scanner;


public class Ej16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n;
        
        do {
            System.out.println("Introduce un numero del 1 al 10");
            n = teclado.nextInt();            
        } while (n<0 || n>10);

        
        for (; n > 0 ; n--) {
            for (int cont = n; cont > 0; cont--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
