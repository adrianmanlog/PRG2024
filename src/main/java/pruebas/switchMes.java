package pruebas;

import java.util.Scanner;
import java.util.regex.Pattern;

public class switchMes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mes;

        do {
            System.out.println("Introduceme el nombre del mes que quieras");
            mes = teclado.nextLine();
        } while (!Pattern.matches("[A-Za-z]*",mes));

        switch (mes) {
            case "abril" ,"mayo","junio","julio":
                System.out.println("MArica el que lo lea");
                break;
            case"septiembre", "noviembre", "diciembre":
                System.out.println("Me cago encima");
                break;
        }
    }
}
