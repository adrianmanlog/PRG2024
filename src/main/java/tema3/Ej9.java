package tema3;


import java.lang.Math;

public class Ej9 {
    public static void main(String[] args) {
        int ran1, ran2;
        
        ran1 = (int) (Math.random()*6+1);
        ran2 = (int) (Math.random()*6+1);
        
        switch (ran1) {
            case 1:
                System.out.println("As");
                break;
            case 2:
                System.out.println("J");
                break;
            case 3:
                System.out.println("Q");
                break;
            case 4:
                System.out.println("K");
                break;
            case 5:
                System.out.println("7");
                break;
            case 6:
                System.out.println("8");
                break;       
        }
        
                switch (ran2) {
            case 1:
                System.out.println("As");
                break;
            case 2:
                System.out.println("J");
                break;
            case 3:
                System.out.println("Q");
                break;
            case 4:
                System.out.println("K");
                break;
            case 5:
                System.out.println("7");
                break;
            case 6:
                System.out.println("8");
                break;
                
        }
    }
}