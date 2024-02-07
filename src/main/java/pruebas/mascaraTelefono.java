package pruebas;

import java.util.Scanner;
import java.util.regex.Pattern;

public class mascaraTelefono {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String telefono,aux;
        int cuenta=0,aux2=0;

        do {
            System.out.println("introduce el numero de telefono (xxx-xxx-xxx");
            telefono = teclado.nextLine();
        } while (!Pattern.matches("[0-9]{3}-[0-9]{3}-[0-9]{3}", telefono));
        
    }
}
