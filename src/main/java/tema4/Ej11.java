/*
Realizar un programa que muestre los primeros 5 números impares, utilizando la instrucción
continue para saltarse los pares y usando la instrucción for.
 */
package tema4;


public class Ej11 {
    public static void main(String[] args) {
        for (int num = 0; num < 10; num++) {
            if (num%2==0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
