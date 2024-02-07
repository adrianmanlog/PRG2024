package tema2;
/*
Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. Por este motivo, es necesario diseñar 
una aplicación que solicite las ventas (en kilos) de cada trimestre para cada fruta. La aplicación mostrará el importe total sabiendo que 
el precio del kilo de manzanas está fijado en 2.35€ y el kilo de peras está fijado en 1.95€
*/

import java.util.*;
public class Ej8_1{
	public static void main (String [] args){
		//Declaramos las variables
		Scanner entrada = new Scanner(System.in);
		short man_trimes1, man_trimes2, man_trimes3, man_trimes4, per_trimes1, per_trimes2, per_trimes3, per_trimes4;
		float manzanas = (float)2.35, peras = (float)1.95, resultado_per, resultado_man, total_man, total_per;

		//Manzanas
		System.out.println("**************MANZANAS****************");
		System.out.println("Cuantos kg de manzana se han vendido en el primer trimestre");
		man_trimes1 = entrada.nextShort();
		System.out.println("Cuantos kg de manzana se han vendido en el segundo trimestre");
		man_trimes2 = entrada.nextShort();		
		System.out.println("Cuantos kg de manzana se han vendido en el tercer trimestre");
		man_trimes3 = entrada.nextShort();
		System.out.println("Cuantos kg de manzana se han vendido en el cuarto trimestre");
		man_trimes4 = entrada.nextShort();

		//Peras
		System.out.println("**************PERAS****************");
		System.out.println("Cuantos kg de peras se han vendido en el primer trimestre");
		per_trimes1 = entrada.nextShort();
		System.out.println("Cuantos kg de peras se han vendido en el segundo trimestre");
		per_trimes2 = entrada.nextShort();
		System.out.println("Cuantos kg de peras se han vendido en el tercer trimestre");
		per_trimes3 = entrada.nextShort();
		System.out.println("Cuantos kg de peras se han vendido en el cuarto trimestre");
		per_trimes4 = entrada.nextShort();
		
		//Calculos
		resultado_man=(float)(man_trimes1+man_trimes2+man_trimes3+man_trimes4)*manzanas;
		resultado_per=(float)(per_trimes1+per_trimes2+per_trimes3+per_trimes4)*peras;
		
		
		//Resultados
		System.out.println("**************MANZANAS****************");
		System.out.println("Beneficio de las manzanas: " + resultado_man + " euros");
		System.out.println("**************PERAS****************");
		System.out.println("Beneficio de las peras: " + resultado_per + " euros");
		
	}
}