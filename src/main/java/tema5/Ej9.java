/*
 *Realizar una nueva función que reciba un número entero positivo + 0 (n) y devuelva el
    resultado de calcular: n!+(n-1)!+(n-2)!+ …+ 0!.
 */
package tema5;

import Libreria.LibreriaMates;

public class Ej9 {
    public static int calculoFactor(int n) {
        int acum=0;
        for (int i = 0; i <= n; i++){
            acum += LibreriaMates.factorial(n-i);
        }
        return acum;
    }
    public static void main(String[] args) {
        int auxNum;
        auxNum= LibreriaMates.leerNumeroPosi("Introduce el numero de la operacion");

        System.out.println(calculoFactor(auxNum));
    }
}
