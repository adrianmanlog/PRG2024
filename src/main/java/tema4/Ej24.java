/*
 *Realiza un programa que dibuje un rombo dependiendo del valor (n) introducido por el usuario que debe ser positivo e impar, véase el ejemplo:
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n,div1,div2,c1=0,c2=1;
        
        do {            
            System.out.println("Introduce el valor de n debe ser positivo e impar");  
            n = teclado.nextInt();
        } while (n<0 || n%2==0);
        
        div1= n/2;
        div2=1;
        
        for (int j=0; j < n; j++) {
            for (int i = 0; i < div1; i++) {
                System.out.print(" ");
            }
            for (int o = 0; o < div2; o++) {
                System.out.print("*"); 
            }
            System.out.println("");
//            System.out.print(div1 + " " + div2);
            if (j<n/2) {
                div1--;
                div2 = div2+2;
            } else{
                div1++;
                div2=div2-2;
            }
        }
    }
}