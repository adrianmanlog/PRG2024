/*
Realiza un programa que dibuje un cuadrado dependiendo del valor (n) introducido por el usuario que debe ser positivo e impar, véase el ejemplo:
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n,div1=5,div2=1,div4=1;
        
        do {            
            System.out.println("Introduce el numero que sea impar");
            n = teclado.nextInt();
        } while (n<0 || n%2==0);
        
        int div3 = n;

        for (int i = 0; i < n; i++) {
            for (int w = 0; w < div4; w++) {
                System.out.print(" ");
            }
            for (int j = 0; j < div3; j++) {
                System.out.print("*");
            }
            System.out.println("");
            for (int q = 0; q < div2 ; q++) {
                System.out.print("*");
            } 
            for (int f = 0; f < div1; f++) {
                System.out.print(" ");
            }

            for (int q = 0; q < div2 ; q++) {
                System.out.print("*");
            }  
            System.out.println("");
            if (div3==n) {
                div3 -= n-1;
            }
        }
    }
}
