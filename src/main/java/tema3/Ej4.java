package tema3;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        //Variables
        Scanner teclado = new Scanner (System.in);
        float num1;
        
        //Datos del usuario
        System.out.println("Introduzca el numero real que quiera");
        num1 = teclado.nextFloat();
        
        //Resultado
        if (num1 == 0) {
            System.out.println("El numero es 0");
        } else if (num1<1.0 && num1>0.0) {
            System.out.println("El numero es casi 0");  
        } else if (num1>-1 && num1<0.0) {
            System.out.println("El numero es casi 0");
        }
        else {
            System.out.println("El numero no es casi 0");
        }
    }
    
}
