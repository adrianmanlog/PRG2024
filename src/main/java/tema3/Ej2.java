
package tema3;

import java.util.Scanner;


public class Ej2 {
    public static void main(String[] args) {
    //Variables
        Scanner teclado = new Scanner (System.in);
        int num1, num2;
        
    //Datos del usuario    
        System.out.println("Dame el primer numero");
        num1 = teclado.nextInt();
        System.out.println("Dame el segundo numero");
        num2 = teclado.nextInt();
        
    //Resultado    
        if (num1 == num2) {
            System.out.println("El numero es igual");
        } else {
            System.out.println("El numero es distinto");
        }
    }
}
