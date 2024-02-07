/*
 *Realiza un programa que dibuje un rombo dependiendo del valor (n) introducido por el usuario que debe ser positivo e impar, véase el ejemplo:
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n,espacioexterno,espaciointerno=-1;
        
        do {            
            System.out.println("Introduce el valor de n debe ser positivo e impar");  
            n = teclado.nextInt();
        } while (n<0 || n%2==0);
        
        espacioexterno= n/2;
        
        
        for (int j=0; j < n; j++) {
            for (int i = 0; i < espacioexterno; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 0; i < espaciointerno; i++) {
                System.out.print(" ");
            }
            if (!(j==0 || j==n-1)) {
                System.out.print("*");
            }
            System.out.println("");
            
            if (j<n/2) {
                espacioexterno--;
                espaciointerno += 2;
            } else{
                espacioexterno++;
                espaciointerno -= 2;
            }
        }
    }
}