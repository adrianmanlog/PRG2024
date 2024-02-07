
package tema3;

import java.util.Scanner;


public class Ej13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String mes;
        
        System.out.println("Dime el nombre del mes, la primera letra en mayusculas");
        mes = teclado.nextLine();
       
        switch (mes) {
            case "Enero" , "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre":
                System.out.println("31 dias");
                break;
            case "Febrero":
                System.out.println("28 o 29 dias");
                break;
            case "Abril", "Junio", "Septiembre", "Noviembre":
                System.out.println("30 dias");
                break;
            default:
                System.out.println("Entrada incorrecta");
        }
    }

           
            
}
