package tema2;
import java.util.*;

public class ej4{
	public static void main (String [] args){
		Scanner escaner = new Scanner(System.in);
		String nombre_introducido;

		System.out.println("Escribe tu nombre");
		nombre_introducido = escaner.nextLine();
		System.out.println("Bienvenido " +nombre_introducido);
	}
}