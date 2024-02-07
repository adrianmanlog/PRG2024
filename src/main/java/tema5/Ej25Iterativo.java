/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej25Iterativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular el Fibonacci: ");
        int n = scanner.nextInt();

        int resultado = calcularFibonacci(n);

        System.out.println("El Fibonacci de " + n + " es: " + resultado);
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;

    }
}
