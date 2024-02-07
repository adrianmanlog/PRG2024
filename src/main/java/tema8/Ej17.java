/*
 * Realiza un comparador de arrays que muestre primero aquellos cuya suma es menor y
    luego los que son mayor. Para probarlo, crea primero una colección cuyos objetos sean
    arrays de 3 números enteros aleatorios. Usa una clase anónima para implementar este
    comparador.
 */
package tema8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Vespertino
 */
public class Ej17 {
    public static void main(String[] args) {
        List<int[]> sumaNumeros= new ArrayList<>();
        rellenarSumas((ArrayList<int[]>) sumaNumeros);
        Collections.sort(sumaNumeros, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                int suma1=0, suma2=0;
                for (int i = 0; i < o1.length; i++) {
                    suma1+=o1[i];
                }
                for (int i = 0; i < o2.length; i++) {
                    suma2+=o2[i];
                }
                if (suma1>suma2) {
                    return -9;
                }else if(suma1<suma2){
                    return 9;
                }
                return -1;
            }
            
        });
        for (int i = 0; i < sumaNumeros.size(); i++) {
            for (int j = 0; j < 10; j++) {
                
            }
        }
    }
    public static void rellenarSumas(ArrayList<int[]> sumaNumeros) {
        int[] vector;
        for (int i = 0; i < 3; i++) {
            vector= new int[3];
            for (int j = 0; j < 3; j++) {
                vector[j]=(int)(Math.random() * (10 + 1 - 0) + 0);
            }
            sumaNumeros.add(vector);
        }
    }
}
