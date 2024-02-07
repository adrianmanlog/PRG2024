package tema1;
import java.util.*;
public class prueba{
	public static void main (String [] args){
		Scanner t = new Scanner (System.in);
		
		//Pedimos los datos al usuario
		System.out.println("Dime como te llamas");
		String nombre = t.nextLine();
		System.out.println("Dime tu correo: ");
		String correo = t.nextLine();
		
		System.out.println("Bienvenido sr " +nombre +" Su email es " +correo);
	}
}