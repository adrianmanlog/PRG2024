/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

import com.github.javafaker.Faker;

/**
 *
 * @author tanjx
 */
public class Fak {

    public static void main(String[] args) {
        Faker f = new Faker();
        String aux;
        aux = f.pokemon().name();
        System.out.println(aux);
    }
}
