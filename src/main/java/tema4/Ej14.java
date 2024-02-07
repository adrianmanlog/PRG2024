//Realizar el juego de “número secreto”. El ordenador generará un número aleatorio entre [1,100], y pedirá al usuario que lo adivine. 
//El ordenador debe dar al usuario pistas del tipo “mayor” o “menor” por pantalla. 
//El proceso termina cuando el usuario acierta o se rinde (introduce un número negativo).
package tema4;

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ram1, num = 0;

        ram1 = (int) (Math.random() * 101);
        System.out.println(ram1);
        System.out.println("Introduce un numero del 1-100");

        for (int c = 5; c > 0; c--) {
            System.out.println("Introduce un numero te quedan " + c + " intentos");
            num = teclado.nextInt();
            if (c == 1 && num != ram1) {
                System.out.println("Has perdido te has quedado sin intentos");
            } else if (num < ram1) {
                System.out.println("El numero es mas grande");
            } else if (num == ram1) {
                System.out.println("HAS ACERTADO EL NUMERO");
                c = c - 5;
            } else if (num > ram1) {
                System.out.println("El numero es mas pequeño");
            }
        }
        System.out.println("SE TERMINO EL JUEGO");
    }
}

