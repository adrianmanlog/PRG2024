package pruebas;

import java.util.Scanner;

public class cartasPoker {
    public static void main(String[] args) {
        String cartas="1d 2d 3d 4d 5d 6d 7d 8d 9d 10d 11d 12d 1p 2p 3p 4p 5p 6p 7p 8p 9p 10p 11p 12p 1c 2c 3c 4c 5c 6c 7c 8c 9c 10c 11c 12c 1t 2t 3t 4t 5t 6t 7t 8t 9t 10t 11t 12t";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Pulsa enter para que el crupier te de las cartas");
        teclado.nextLine();

        for (int i = 0; i < 5; i++) {
            int random;
            String aux="";
            random = (int) (Math.random()*49);
            
            Scanner leerCartas = new Scanner(cartas);

            for (int j = 0; j < random; j++) {
                if(leerCartas.hasNext()){
                   aux= leerCartas.next(); 
                }
            }
            System.out.println(aux);
        }
    }
}
