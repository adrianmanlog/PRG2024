package tema4;
import java.util.Scanner;

public class Ej22 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base,expo,acum1=0,acum2=1;
        
        do {            
            System.out.println("Introduce la base");
            base = teclado.nextInt();
            System.out.println("Introduce el exponente");
            expo = teclado.nextInt();
        } while (base<0 || expo<0);


        if (expo == 0) {
            System.out.println("Todo numero elevado a 0 es 1");
        } else {
            for (int i=0; i < expo ; i++) {
               acum1=0;
               for (int j = 0; j < base; j++) {
                acum1 += acum2;
                } 
                acum2=acum1;
            }
        }
        System.out.println(acum1);
    }
}
