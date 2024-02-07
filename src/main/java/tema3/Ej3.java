
package tema3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        //Variables
        Scanner teclado = new Scanner (System.in);
        int num1, num2;
        
        //Datos del usuario
        System.out.println("Inserte el numero que quiera");
        num1 = teclado.nextInt();
        System.out.println("Inserte el numero que quiera");
        num2 = teclado.nextInt();
        
        //Resultado
        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else {
            System.out.println("El numero mayor es: " + num2);
        }
    }
    
}
