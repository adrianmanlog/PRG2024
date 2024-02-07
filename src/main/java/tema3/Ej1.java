
package tema3;

import java.util.Scanner;




public class Ej1 {
    public static void main(String[] args) {
        //Variables
        Scanner teclado = new Scanner (System.in);
       int numero;
       final int par = 2;
       
       //Datos del usuario
        System.out.println("Muestrame el numero que quieras");
        numero = teclado.nextInt();
       int cuenta = numero % par ; 
        
        //Resultado
        if (cuenta == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        }
    
}
