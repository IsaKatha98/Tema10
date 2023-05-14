package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Creamos el escáner. 
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduzca un número de tipo int: ");
		System.out.println(Utils.readInt(sc));
		sc.nextLine();
		
		
		System.out.println("Introduzca un número de tipo double:");
		System.out.println(Utils.readDouble(sc));

	}

}
