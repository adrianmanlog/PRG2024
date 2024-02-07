/*
Realizar un programa en Java que contabilice la cantidad de años bisiestos que hay entre dos
números (año1 y año2) introducidos por el usuario. Se usará el continue para saltarse los
cambios de siglo.
 */
package tema4;

import java.util.Scanner;


public class Ej15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int año1,año2,cont=0;
        
        System.out.println("Introduce un año en formato: 2015 1902");
        año1 = teclado.nextInt();
        año2 = teclado.nextInt();
        
        for (; año1<=año2; año1++) {
            if (año1%4==0 && año1%100!=0) {
                cont++;
                continue;
            }
            if (año1%400==0) {
                cont++;
            }
        }
        System.out.println(cont);
    }
}
