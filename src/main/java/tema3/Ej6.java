
package tema3;

import java.util.Scanner;


public class Ej6 {
    public static void main(String[] args) {
        //Variables
        Scanner teclado = new Scanner (System.in);
        int num1;
        
        //Datos del usuario
        System.out.println("Introduce un numero del 1-7");
        num1 = teclado.nextInt();
        
        //Resultado
        if (num1 == 1) {
            System.out.println("Lunes");
        } else if (num1 == 2){
            System.out.println("Martes");
        } else if (num1 == 3){
            System.out.println("Miercoles");
        } else if (num1 == 4){
            System.out.println("Jueves");
        } else if (num1 == 5){
            System.out.println("Viernes");
        } else if (num1 == 6){
            System.out.println("Sabado");
        } else if (num1 == 7){
            System.out.println("Domingo");
        }
        else {
            System.out.println("FALLO DE ENTRADA");
        }
    }
 
}
