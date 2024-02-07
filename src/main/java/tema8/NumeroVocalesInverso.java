/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8;

import java.util.Comparator;

/**
 *
 * @author Vespertino
 */
public class NumeroVocalesInverso implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
       int aux;
       
       aux = o1.compareTo(o2);
       return aux*-1;
       
    }

}
