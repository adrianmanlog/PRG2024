/*
Realizar un programa que haciendo uso de bucles anidados muestre por pantalla la siguiente secuencia de números. El programa recibirá un número entero y positivo.
Ejemplo: Para N=6
Ficha: |1:1|
Ficha: |2:1| |2:2|
Ficha: |3:1| |3:2| |3:3|
Ficha: |4:1| |4:2| |4:3| |4:4|
Ficha: |5:1| |5:2| |5:3| |5:4| |5:5|
Ficha: |6:1| |6:2| |6:3| |6:4| |6:5| |6:6|

 */
package tema5;

import java.util.Scanner;
import Libreria.LibreriaMates;

/**
 *
 * @author Vespertino
 */
public class Ej23 {
    public static String Ficha(int n) {
        String secuencia="";
        int cont=1;
        for (int i = 1; i <= n; i++) {
            secuencia = secuencia +"Ficha: ";
            for (int j = 1; j <= cont; j++) {
                secuencia = secuencia + " "+ i + ":" + j;
            }
            secuencia=secuencia+"\n";
            cont++;
        }
        return secuencia;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n;
        
        n=LibreriaMates.leerNumeroPosi("Introduce el numero debe ser positivo");
        System.out.println(Ficha(n));
        
    }
}
