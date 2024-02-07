/*
Diseñar una función que calcule el n-ésimo término de la serie de Fibonacci. 
En esta serie el n-ésimo valor se calcula sumando los dos valores anteriores. Es decir: Recursivo
fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
fibonacci(1) = 1
fibonacci(0) = 0

 */
package tema5;
import Libreria.LibreriaMates;

/**
 *
 * @author Vespertino
 */
public class Ej25 {
    public static int fibonacci(int n) {
        if (n==0 || n==1) {
            return n;
        } else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        int n;
        
        n=LibreriaMates.leerNumeroPosi("Introduce un numero positivo");
        System.out.println(fibonacci(n));
        
    }
}
