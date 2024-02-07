package tema2;
import java.util.*;
import java.text.DecimalFormat;
public class Ej14{
	public static void main (String [] args){
		//Declarar variables
		DecimalFormat df = new DecimalFormat("#");
		Scanner entrada = new Scanner(System.in);
		byte edad;
		short fRep;
		float fMax, pulsacionesObjetivo70, pulsacionesObjetivo80, pulsacionesObjetivo90, pulsacionesObjetivo100;

		//Pedimos datos
		System.out.println("Dime tu edad");
		edad = (byte)entrada.nextByte();
		System.out.println("Dime tu frecuencia cardiáca en reposo");
		fRep = (short)entrada.nextShort();

		//Cálculos
		fMax = (float)208-(0.7F*edad);
		pulsacionesObjetivo70 = (fMax-fRep)*0.7F+fRep;
		pulsacionesObjetivo80 = (fMax-fRep)*0.8F+fRep;
		pulsacionesObjetivo90 = (fMax-fRep)*0.9F+fRep;
		pulsacionesObjetivo100 = (fMax-fRep)+fRep;
		

		//Resultados
		System.out.println("***************************************");
		System.out.println("*      70%       *    " + df.format(pulsacionesObjetivo70));
		System.out.println("*      80%       *    " + df.format(pulsacionesObjetivo80));
		System.out.println("*      90%       *    " + df.format(pulsacionesObjetivo90));
		System.out.println("*      100%      *    " + df.format(pulsacionesObjetivo100));
		System.out.println("***************************************");
	}
}