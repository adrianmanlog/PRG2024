/*
Realizar un programa en java que muestr por pantalla los numeros del 0-9. haremos dos versiones con while y do while
 */
package tema4;

import java.util.Scanner;


public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num=0;
        
        while (num<10) {            
            System.out.println(num);
            num++;
        }
        System.out.println(" ");
        num=0;
        do {            
            System.out.print(num + " ");
            num++;
        } while (num<10);
    }
}
