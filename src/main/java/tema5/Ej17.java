/*
Realizar un programa que tenga una función que muestre cuál es el más grande de entre los números enteros positivo + 0, 
introducidos por teclado. Los números se entregan al programa todos en una línea y la entrada de datos termina cuando el usuario introduce -1.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej17 {

    public static String lecturaHastaMenosUno(String numeros) {
        Scanner teclado = new Scanner(numeros);
        String numerosSinMenosUno = "";
        int x;

        while (teclado.hasNext()) {
            x = Integer.parseInt(teclado.next());

            if (x == -1) {
                break;
            } else {
                numerosSinMenosUno = x + "";
            }
        }
        return numerosSinMenosUno;
    }

    public static int MaximoString(String numerosSinMenosUno) {
        Scanner teclado = new Scanner(numerosSinMenosUno);
        int x, numeroMayor = 0;
        while (teclado.hasNext()) {
            x = Integer.parseInt(teclado.next());
            if (x > numeroMayor) {
                numeroMayor = x;
            }
        }
        return numeroMayor;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numeros,numerosSinMenosUno;

        System.out.println("Introduce los numeros");
        numeros = teclado.nextLine();
        
        numerosSinMenosUno = lecturaHastaMenosUno(numeros);
        System.out.println(MaximoString(numerosSinMenosUno));
    }
}
