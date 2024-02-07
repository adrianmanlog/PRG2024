/*
Realizar un programa que solicite al usuario dos letras del abecedario (l1 y l2) y muestra
por pantalla las letras que van desde l1 hasta l2. Mostraremos error si l1 es mayor que l2.
Ejemplo: Dado C1(‘T’, ‘Y’) -&gt; TUVWY
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej22 {
    public static void deAaZ(char letra1, char letra2) {
        for (; letra1 <= letra2; letra1++) {
            System.out.print(letra1 + " ");
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        char letra1,letra2;

        do {
            System.out.println("Introduce los letras separadas por espacios");
            letra1 = teclado.nextLine().charAt(0);
            System.out.println("Introduce los letras separadas por espacios");
            letra2 = teclado.nextLine().charAt(0);            
        } while (letra1>letra2);

        deAaZ(letra1, letra2);
        
    }
}
