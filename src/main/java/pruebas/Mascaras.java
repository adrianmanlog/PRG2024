package pruebas;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Mascaras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String fecha;

        do {
            System.out.println("introduce la fecha en formato xx/xx/xxx");
            fecha = teclado.nextLine();
        }while(!Pattern.matches("\\d{2}/\\d{2}/\\d{4}",fecha));

        if (Pattern.matches("\\d{2}/\\d{2}/\\d{4}",fecha)){
            System.out.println(fecha);
        }else{
            System.out.println("VAYA PUTA MIERDA");
        }
    }
}
