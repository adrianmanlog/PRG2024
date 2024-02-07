/*
Realizar una función recursiva en Java que pida un número entero positivo (n) y muestre por pantalla los números de n, n-1, n-2 …. 1.
 */
package tema5;

import Libreria.LibreriaMates;

/**
 *
 * @author Vespertino
 */
public class Ej15 {

    public static void deNa0(int n) {
        int r;
        if (n == 1) {
            System.out.println("1");
        } else {
            System.out.println(n);
            deNa0(n - 1);
        }
    }

//    public static int deNa02(int n) {
//        int r;
//        if (n == 1) {
//            r = 1;
//        } else {
//            System.out.println(n);
//            r = deNa02(n - 1);
//        }
//        return r;
//    }

    public static void main(String[] args) {
        int n;

        n = LibreriaMates.leerNumeroPosi("Introduce un numero positivo");
//        System.out.println(deNa02(n));
        deNa0(n);
    }
}
