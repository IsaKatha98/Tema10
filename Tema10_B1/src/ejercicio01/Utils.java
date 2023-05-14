package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

	public static double readDouble (Scanner sc) {
		
		double res=0.0;
		
		try {
			
			res=sc.nextDouble();
			
		} catch (InputMismatchException e) {
			
			System.out.println("El número introducido no es de tipo double.");
		}
		
		return res;
		
	}
	
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
