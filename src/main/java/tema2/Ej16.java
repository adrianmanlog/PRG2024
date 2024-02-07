package tema2;
/*
Desarrolle un programa que calcule el desglose de una cantidad en billetes y monedas en euros tal que se minimice la cantidad de monedas y billetes.
*/

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Ej16{
	public static void main (String [] args){
		//Variables
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");
		int cantidad, operacion1, operacion2, operacion3, operacion4, operacion5;
		float operacion6;
			
		
		//Pedir los datos
		System.out.println("Introduzca una cantidad para desglosar");
		cantidad = entrada.nextInt();

		//Calculos
		//Necesitamos que divida y haga tambien el % para llevarnos el resto y seguir con el desglose
		operacion1 = cantidad / 500;
		operacion2 = cantidad % 500;
		operacion2 = operacion2 / 100;
		operacion3 = cantidad % 100;
		operacion3 = operacion3 / 20;
		operacion4 = cantidad % 20;
		operacion4 = operacion4 / 5;
		operacion5 = cantidad % 5;
		operacion5 = operacion5 / 2;
		operacion6 = cantidad % 2;
		operacion6 = (float)operacion6 / 0.5F;

		//Sacamos el desglose
		System.out.println(operacion1 + " Billetes de 500 euros");
		System.out.println(operacion2 + " Billetes de 100 euros");
		System.out.println(operacion3 + " Billetes de 20 euros");
		System.out.println(operacion4 + " Billetes de 5 euros");
		System.out.println(operacion5 + " Monedas de 2 euros");
		System.out.println(df.format(operacion6) + " Monedas de 0,5 euros");
	}
}