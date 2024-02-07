/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 Realiza ahora otro comparador que muestre 
* alfabéticamente los String pero al revés del 
* “orden natural” de los Strings.
 */
public class Ej15 {

    public static void main(String[] args) {
        List<String> coleccion = Arrays.asList("Adrian", "Andoni", "Raul", "Gabriel", "Sara", "Yoel");

        NumeroVocalesInverso nv = new NumeroVocalesInverso();
        Collections.sort(coleccion, nv);
        System.out.println(coleccion);
    }
}
