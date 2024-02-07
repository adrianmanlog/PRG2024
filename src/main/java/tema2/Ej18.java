package tema2;
/*
Realiza un programa que realice justo lo contrario que el anterior. 
Es decir pedirá al usuario un número de segundos y debe devolver cuantos días, horas y minutos son.
*/
import java.util.*;
import java.text.DecimalFormat;

public class Ej18{
	public static void main (String [] args){
		//Declarar variables
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");
		int dia, hora, minuto, seg, dresto, hresto, mresto;

		//Pedir valores
		System.out.println("Indica los segundos");
		seg = entrada.nextInt();

		//Calculos
		dia = seg/86400;
		dresto = seg%86400;
		hora = dresto / 3600;
		hresto = seg%3600;
		minuto = hresto / 60;

		//Mostrar resultado
		System.out.println( seg+" segundos "+ " son " + df.format(dia) + " dias " + df.format(hora) + " horas " + df.format(minuto) + " minutos");
	}
}