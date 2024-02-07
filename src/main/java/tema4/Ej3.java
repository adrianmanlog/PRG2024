/*
 * Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A continuación
    solicitará por teclado un número; si ese número está fuera del rango se volverá a solicitar otro
    número, así constantemente mientras el usuario se equivoque. El programa acaba cuando el
    usuario introduce un valor correcto.
 */
package tema4;

import java.util.Scanner;


public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int min,max, num;
        
        System.out.println("Introduce el min y maximo separados con un espacio");
        min = teclado.nextInt();
        max = teclado.nextInt();
        
        do {
            System.out.println("Introduce un numero entre el min y el max");
            num= teclado.nextInt();
        } while(num<min || num>max);
        
        System.out.println("Has intoduciod bien el numero: " + num);
    }
}
