
package tema3;

import java.util.Scanner;


public class Ej7 {
    public static void main(String[] args) {
        //Variables
        Scanner teclado = new Scanner (System.in);
        int num1;
        
        //Datos del usuario
        System.out.println("Introduce el dia mayor de un mes");
        num1 = teclado.nextInt();
        
        
        //Resultado
        if (num1 == 31) {
            System.out.println("Los meses con 31 días son: Eneros, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
        } else if (num1 == 30){
            System.out.println("Los meses con 30 días son: Abril, Junio, Septiembre, Noviembre");
        } else if (num1 == 28){
            System.out.println("El mes con 28 días es febrero");
        }else if (num1 == 29){
            System.out.println("El mes con 29 dias es febrero cuando es bisiesto");
        }
        else {
            System.out.println("FALLO DE DATOS");
        }
    }
}
