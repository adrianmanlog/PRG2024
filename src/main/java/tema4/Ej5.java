/*
Diseñar un programa que muestre, para cada número introducido por teclado, si es par,
positivo y su cuadrado, en el caso que no sea alguna de estas cosas, no mostraremos ningún
mensaje. El proceso se repetirá hasta que el número introducido por teclado sea 0.
 */
package tema4;

import java.util.Scanner;


public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num, rest;
        
        do {
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        rest=num%2;            
        if (rest==0 && num!=0 && num>0 ) {
            System.out.println("Es par, positivo y su cuadrado es: " + num*num);
        }else if (num<0 && rest==0 && num!=0){
            System.out.println("Es negativo, par y su cuadrado es: " + num*num);
        }else if (num<0 && num!=0 ){
            System.out.println("Es negativo y su cuadrado es: " + num*num);
        }else if (rest!=0 && num>0){
            System.out.println("Es positivo y su cuadrado es: " + num*num);
        }
        } while (num!=0);
        System.out.println("Fin del programa");  
        }
    }

