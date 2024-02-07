package pruebas;

import java.util.Scanner;
import Libreria.LibreriaMates;

public class HasnextPrueba2 {
    public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in);
     String factorialDeNumero;
     int aux=0,aux2=2;

     System.out.println("Introduce una cadena de numeros");
     factorialDeNumero = teclado.nextLine();

     Scanner leerNumeros = new Scanner (factorialDeNumero);

     while(leerNumeros.hasNext()) {
        aux = leerNumeros.nextInt();
        aux2 = LibreriaMates.factorial(aux);
        System.out.println(aux2);
     }
    }
}
