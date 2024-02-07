//Realizar el juego de “número secreto”. El ordenador generará un número aleatorio entre [1,100], y pedirá al usuario que lo adivine. 
//El ordenador debe dar al usuario pistas del tipo “mayor” o “menor” por pantalla. 
//El proceso termina cuando el usuario acierta o se rinde (introduce un número negativo).
package tema4;

import java.util.Scanner;


public class Ej14a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ram1, num = 0;

        ram1 = (int) (Math.random() * 101);
        System.out.println(ram1);
        
        do {            
            System.out.println("Introduce un numero del 1-100, si introduces un numero negativo te rindes");
            num = teclado.nextInt();
            if (num < ram1 && num>=0) {
                System.out.println("El numero es mas grande");
            }else if (num > ram1 && num>=0) {
                System.out.println("El numero es mas pequeño");
            }       
        } while (num!=ram1 && num>=0);
        if (num==ram1) {
            System.out.println("Has acertado el numero");
        } else {
            System.out.println("Te has rendido, SE TERMINO EL JUEGO");
        }
        
    }
}
