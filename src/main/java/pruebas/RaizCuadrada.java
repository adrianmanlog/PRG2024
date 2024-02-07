package pruebas;

import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int a,b,c;
        float raiz1, raiz2;

        System.out.println("introduce a b c");
        a=teclado.nextInt();
        b=teclado.nextInt();
        c=teclado.nextInt();

        raiz1= (float) (-b+Math.sqrt(Math.pow(b, 2)-4*a*c)/(2*a));
        raiz2= (float) (-b-Math.sqrt(Math.pow(b, 2)-4*a*c)/(2*a));

        raiz1= (float) (-b+Math.sqrt(Math.pow(b, 2)-4*a*c)/(2*a));
        raiz2= (float) (-b-Math.sqrt(Math.pow(b, 2)-4*a*c)/(2*a));

    }
}
