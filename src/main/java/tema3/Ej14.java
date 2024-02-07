
package tema3;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1, num2,num3;
        
        System.out.println("Introduce 3 numero distintos");
        System.out.println("Introduce el numero 1");
        num1 = teclado.nextInt();
        System.out.println("Introduce el numero 2");
        num2 = teclado.nextInt();
        System.out.println("Introduce el numero 3");
        num3 = teclado.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es " + num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("El mayor es " + num2);
        }else if (num3 > num1 && num3 > num2){
            System.out.println("El mayor es " + num3);
        }
    }
 
}
