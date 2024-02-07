/*
 Realizar un programa en Java que pida un número al usuario y muestre la tabla de multiplicar de ese número por pantalla siguiendo el formato siguiente:

Siendo número=6;
6x1=6
6x2=12
…
6x10=60

 */
package tema4;

import java.util.Scanner;


public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num;
           
        System.out.println("Introduce un numero");
        num = teclado.nextInt();                  
        
        for (int tab = 1; tab <= 10; tab++) {
            System.out.println(num + "x" + tab + "=" + num*tab);  
        }

        
    }
}
