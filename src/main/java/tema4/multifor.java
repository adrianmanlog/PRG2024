package tema4;

import java.util.Scanner;

public class multifor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingrese un numero entre 0 y 10");
            num = teclado.nextInt();
        } while (num<0 || num>10);

        for (num=num; num<11; num++) {
            System.out.println(" ");
            for (int tab = 1; tab<11; tab++) {
                System.out.println(num + "x" + tab + "=" + num*tab);
            }
        }
    }
}
