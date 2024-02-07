package tema2;
/*
Realiza un programa en Java que permita la conversión de días, horas y minutos a segundos. 
El programa pedirá estos tres valores y mostrará por pantalla el número de segundos tras realizar la conversión.
*/
import java.util.*;

public class Ej17{
	public static void main (String [] args){
		//Declarar variables
		Scanner entrada = new Scanner(System.in);
		int dia, hora, minuto, segd, segh, segm, segundosTotal;

		//Pedir valores
		System.out.println("Indica los dias - horas - minutos en la misma linea separado por espacios");
		dia = entrada.nextInt();
		hora = entrada.nextInt();
		minuto = entrada.nextInt();

		//Calculos
		segd = dia * 86400;
		segh = hora * 3600;
		segm = minuto * 60;
		segundosTotal = segd + segh + segm;

		//Mostrar resultado
		System.out.println(dia + " dias " + hora + " horas " + minuto + " minutos " + "son " + segundosTotal +" segundos ");
	}
}