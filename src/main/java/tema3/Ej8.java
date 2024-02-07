package tema3;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        //Variables
        Scanner teclado = new Scanner (System.in);
        int num1, d, u;
        
        //Datos al usuario
        System.out.print("Introduce un numero entre 1 y 99");
        num1 = teclado.nextInt();
        
        //Calculos
        d = num1/10;
        u= num1 % 10;
        
        if (num1>15 && num1<20) {
            System.out.print("Dieci ");
        } else if (num1>10 && num1<16){
            switch (num1) {
                case 11:
                    System.out.println("Once");
                    break;
                case 12:
                    System.out.println("Doce");
                    break;
                case 13:
                    System.out.println("trece");
                    break;
                case 14:
                    System.out.println("Catorce");
                    break;
                case 15:
                    System.out.println("Quince");
                    break;
                default:
                    throw new AssertionError();
            }
        }
        if (num1>19) {
            switch (d) {
            case 1:
                System.out.print("diez y");
                break;
            case 2:
                System.out.print("veinte y");
                break;
            case 3:
                System.out.print("Treinta y");
                break;
            case 4:
                System.out.print("Cuarenta y");
                break;
            case 5:
                System.out.print("Cincuenta y");
                break;
            case 6:
                System.out.print("Sesenta y");
                break;
            case 7:
                System.out.print("Setenta y");
                break;
            case 8:
                System.out.print("Ochenta y");
                break;
            case 9:
                System.out.print("Noventa y");
                break;
            default:
                throw new AssertionError();
        }
            switch (u) {
            case 1:
                System.out.print("uno");
                break;
            case 2:
                System.out.print("dos");
                break;
            case 3:
                System.out.print("tres");
                break;
            case 4:
                System.out.print("cuatro");
                break;
            case 5:
                System.out.print("cinco");
                break;
            case 6:
                System.out.print("seis");
                break;
            case 7:
                System.out.print("siete");
                break;
            case 8:
                System.out.print("ocho");
                break;
            case 9:
                System.out.print("nueve");
                break;
            default:
                throw new AssertionError();
        }
                
        }
        
        
         
        

    }
    
}
