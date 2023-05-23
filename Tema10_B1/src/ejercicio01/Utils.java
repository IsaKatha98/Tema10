package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

	/**
	 * Función que lee un double y devuelve una excepción en caso de que el sc que le pasemos no sea double.
	 * @param sc número leído por el scanner.
	 * @return res devuelve un double
	 */
	public static double readDouble (Scanner sc) {
		
		double res=0.0;
		
		try {
			
			res=sc.nextDouble();
			
		} catch (InputMismatchException e) {
			
			System.out.println("El número introducido no es de tipo double.");
		}
		
		return res;
		
	}
	
	/**
	 * Función que lee un int y devuelve una excepción en caso de que el número leído por el scanner no sea int.
	 * @param sc respuesta leída por el escáner.
	 * @return res devuelve el número si es del tipo correcto.
	 */
	public static int readInt (Scanner sc) {
		
		int res=0;
		
		try {
			
			res=sc.nextInt();
			
		} catch (InputMismatchException e) {
			
			System.out.println("El número introducido no es de tipo int.");
		}
		
		return res;
	}
}
