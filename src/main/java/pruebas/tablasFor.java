package pruebas;

import java.util.Scanner;

public class tablasFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n;

        System.out.println("Introduce el numero y te mostrare las tablas de n a 10");
        n= teclado.nextInt();

        for (; n <= 10; n++) {
            for (int i = 0; i < 10; i++) {
                System.out.println(n + "*" + i + "=" + n*i);
            }
        }
    }
    
}
