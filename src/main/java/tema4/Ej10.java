/*
Modifica el ejercicio 4 para que funcione también con números negativos. 
Por ejemplo: Si n=-15 -> mostraremos por pantalla: -15, -14 … -5, -4, -3, -2, -1, 0.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n, num=1;
    
        System.out.println("Introduce un numero");
        n = teclado.nextInt();
        
        if (n<=num) {
            num=0;
            while (n<=num) {            
                if (n<num) {
                 System.out.print(n + ",");
                 n++;   
                } else {
                    System.out.println(n + ".");
                    n++;
                }
            }    
        } else {
            while (num<=n) {            
                if (num<n) {
                 System.out.print(num + ",");
                 num++;   
                } else {
                    System.out.println(num + ".");
                    num++;
                }
            } 
        }
   }
}
