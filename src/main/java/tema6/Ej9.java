/*
Haciendo uso de la clase StringBuilder vista en clase, crea una función que permita hacer más compleja una contraseña. 
Para ello, crea una función de nombre ofuscaPass,  que reciba un String y devuelva un String con la cadena ofuscada. 
La ofuscación será básicamente cambiar las vocales según esta estructura:
‘a’ y ‘A’ por ‘@’
‘e’ y ‘E’ por ‘3’
‘i’ e ‘I’ por ‘1’
‘o’ y ‘O’ por ‘0’
‘u’ y ‘U’ por ‘V’
       Ejemplo: Entrada: contraseña -> c0ntr@s3ñ@

 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej9 {

    public static StringBuilder ofuscaPass(StringBuilder pass) {
        char aux;
        int e = 1, longitudPass = pass.length();
        for (int i = 0; i < longitudPass; i++) {
            aux = pass.charAt(i);
            switch (aux) {
                case 'a', 'A':
                    pass.delete(i, e);
                    pass.insert(i, "@");
                    break;
                case 'e', 'E':
                    pass.delete(i, e);
                    pass.insert(i, "3");
                    break;
                case 'i', 'I':
                    pass.delete(i, e);
                    pass.insert(i, "1");
                    break;
                case 'o', 'O':
                    pass.delete(i, e);
                    pass.insert(i, "0");
                    break;
                case 'u', 'U':
                    pass.delete(i, e);
                    pass.insert(i, "V");
                    break;
            }
            e++;
        }
        return pass;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in,"ISO-8859-1");

        System.out.println("Introduce la contraseña simple");
        StringBuilder pass = new StringBuilder(teclado.nextLine());
        System.out.println(ofuscaPass(pass));
    }
}
