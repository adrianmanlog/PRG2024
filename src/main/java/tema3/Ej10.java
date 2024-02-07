
package tema3;

import java.util.Scanner;
import java.lang.Math;


public class Ej10 {
    public static void main(String[] args) throws InterruptedException {
        //Variables
        Scanner teclado = new Scanner (System.in);
        int respu1,respu2,respu3,respu4,respu5,respu6;
        int tiro = (int) (Math.random()*6+1);
        
        System.out.println("¿Quieres jugar? si es que si marca 1, si es que no pon 2\nCada vez que avances ganaras 1000€");
        respu1 = teclado.nextInt();
        Thread.sleep(2000);
        if (respu1 == 1) {
            if (tiro == 1) {
                System.out.println("Mueres");
            } else {
                System.out.println("Introduce 1 si quieres seguir, Si no quieres seguir juango elige 2 si no te quedas con 1000€");
                respu2 = teclado.nextInt();
                Thread.sleep(2000);
                    if (respu2 == 1) {
                    System.out.println("Sigues jugando");
                        if (tiro == 2) {
                            System.out.println("Mueres");
                        } else {
                            System.out.println("Introduce 1 si quieres seguir, Si no quieres seguir jugando elige 2 si no te quedas con 2000€");
                            respu3 = teclado.nextInt();
                            Thread.sleep(2000);
                            if (respu3==1) {
                                System.out.println("Sigues jugando");
                                if (tiro==3) {
                                    System.out.println("Mueres");
                                } else {
                                    System.out.println("Introduce 1 si quieres seguir, Si no quieres seguir jugando elige 2 si no te quedas con 4000€");
                                    respu4 = teclado.nextInt();
                                    Thread.sleep(2000);
                                    if (respu4==1) {
                                        System.out.println("Sigues jugando");
                                        if (tiro==4) {
                                            System.out.println("Mueres");
                                        } else {
                                            System.out.println("Introduce 1 si quieres seguir, Si no quieres seguir jugando elige 2 si no te quedas con 8000€");
                                            respu5 = teclado.nextInt();
                                            Thread.sleep(2000);
                                            if (respu5==1) {
                                                System.out.println("Sigues jugando");
                                                if (tiro==5) {
                                                    System.out.println("Mueres");
                                                } else {
                                                    System.out.println("Introduce 1 si quieres seguir, no quieres seguir jugando elige 2, si no te quedas con 16000€");
                                                    respu6 = teclado.nextInt();
                                                    Thread.sleep(2000);
                                                    if (respu6==1) {
                                                        System.out.println("Sigues jugando");
                                                        if (tiro==6) {
                                                            System.out.println("Mueres");
                                                        }
                                                    } else {
                                                        System.out.println("Te retiras");
                                                    }
                                                }
                                            } else {
                                                System.out.println("Te retiras");
                                            }
                                        }
                                    } else {
                                        System.out.println("Te retiras");
                                    }
                                }
                            } else {
                                System.out.println("Te retiras");
                            }
                        }
                    
                    } else {
                    System.out.println("Te retiras");
                    }
                
                
            }
                
            
        } else {
            System.out.println("Se acabo el juego");
        }
        
        
        
        
        
        
    }
}
