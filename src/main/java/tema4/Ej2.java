//Escribir un programa para aprender a contar de forma que se pedirá al usuario un número N y
//se debe mostrar por pantalla los números del 1 a N. Los debemos implementar con while y con
//do-while.
package tema4;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n, num=1;
        
        System.out.println("Introduce un numero mayor que 1");
        n= teclado .nextInt();
        
        while (num<=n) {            
            System.out.println(num);
            num++;
        }
        System.out.println(" ");
        
        num=1;
        do {            
            System.out.println(num);
            num++;
        } while (num<=n);
        
    }
    
}
