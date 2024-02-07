
package tema3;

import java.util.Scanner;


public class Ej5 {
    public static void main(String[] args) {
        //Variables
        Scanner teclado = new Scanner (System.in);
        int num1, num2;
        String valor;
        
        //Datos del usuario
        System.out.println("Dame el valor del primer numero");
        num1 = teclado.nextInt();
        System.out.println("Dame el valor del segundo numero");
        num2 = teclado.nextInt();
        
        valor= num1>num2? num1 + "mayor que" + num2 : num2  + "mayor que " + num1; 
        
        //Resultado
        System.out.println(valor);
        
    }
}
