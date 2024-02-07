/*
Modifica el ejercicio 2 para que los números aparezcan separados por una coma menos el
último que aparecerá un punto al final.
Por ejemplo: Si n=5 -&gt; mostraremos por pantalla 1,2,3,4,5.
 */
package tema4;

import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n, num=1;
        
        do {            
            System.out.println("Introduce un numero mayor que 1");
            n= teclado .nextInt();  
        } while (n<=0);

        
        while (num<=n) {            
            if (num<n) {
             System.out.print(num + ",");
             num++;   
            } else {
                System.out.println(num + ".");
                num++;
            }
        }
        System.out.println(" ");
        
        num=1;
        do { 
            if (num<n) {
             System.out.print(num + ",");
             num++;   
            } else {
                System.out.println(num + ".");
                num++;
            }
        } while (num<=n);
    }
}
