/*
Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. 
En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. 
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas se emitieron de más de 600 €.
 */
package tema4;

import java.util.Scanner;


public class Ej17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int codart,cantAux=0, cantvl,cont=0;
        float preciol, cantfactu,factotal=0;
        
        for (int i = 0; i < 5; i++) {
            do {                
                System.out.println("Introduce los datos de la factura: cod-articulo, cantidad-vendida-por-litros y precio por litro");
                codart = teclado.nextInt();
                cantvl = teclado.nextInt();
                preciol= teclado.nextFloat();
            } while (codart<0 || cantvl<0 || preciol<0);
            
            cantfactu= cantvl*preciol;
            factotal= factotal + cantfactu; // Acumulador
            
            if (codart==1) { // Alcenamos el codigo del primer articulo
                cantAux=cantvl;
            }
            if (cantfactu>600) { // Contabilizamos > 600
                cont++;
            }
            
        }
        System.out.println("La facturacion total es: " + factotal + " La cantidad total es: " + cantAux + " Facturas con mas de 600€: " + cont);
    }
  
}
