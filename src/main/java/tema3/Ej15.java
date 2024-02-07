
package tema3;

import java.util.Scanner;


public class Ej15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1, num2,num3;
        
        System.out.println("Introduce los numeros diferentes");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();
        
        if (num1 > num2 && num1 > num3 && num2 > num3) { //caso 1 2 3
            System.out.println(num1 + " " + num2 + " " + num3);
        }else if (num2 > num1 && num2 > num3 && num1 > num3){ //caso 2 1 3
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num3 > num1 && num3 > num2 && num1 > num2){ //caso  3 1 2
            System.out.println(num3 + " " + num1 + " " + num2 );
        } else if (num1 > num2 && num1 > num3 && num3 > num2){ //cas0 1 3 2
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2 > num1 && num2 > num3 && num3 > num1){ //caso 2 3 1
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if (num3 > num1 && num3 > num2 && num3 > num1){ //caso 3 2 1
            System.out.println(num3 + " " + num2 + " " + num1);
        }
}       
}