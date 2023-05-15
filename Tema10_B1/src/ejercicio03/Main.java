package ejercicio03;

import java.util.Scanner;

import ejercicio02.NegativeHourException;

public class Main {

	public static void main(String[] args) throws NegativeDayException, NegativeMonthException {

		/*
		 * Creamos un escáner para poder leer los datos que introduzca el usuario por la
		 * consola.
		 */

		Scanner sc = new Scanner(System.in);

		// Creamos el objeto.
		Fecha fecha = new Fecha();

		/*
		 * Le pediremos al usuario que introduzca los datos y los guardaremos en la
		 * variable correspondiente.
		 */

		System.out.print("Introduzca el día y pulse Intro: ");
		int dia = sc.nextInt();
		System.out.print("Introduzca el mes y pulse Intro: ");
		int mes = sc.nextInt();
		System.out.print("Introduzca el año y pulse Intro: ");
		int año = sc.nextInt();

		// Pasamos los valores de las variables a la clase de las funciones.
		// Los metemos en los bloques try-catch.

		try {
			fecha.setDia(dia);
		
		} catch (NegativeDayException e) {
			System.err.println(e.toString());

			System.out.print("Introduzca una fecha válida y pulse Intro: ");
			dia = sc.nextInt();

			fecha.setDia(dia);
		}

		try {
			fecha.setMes(mes);
			
		}  catch (NegativeMonthException e) {
			System.err.println(e.toString());

			System.out.print("Introduzca una fecha válida y pulse Intro: ");
			mes = sc.nextInt();

			fecha.setMes(mes);
		}
		
		fecha.setAño(año);

		if (fecha.fechaCorrecta()) {
			System.out.println(fecha);

		} else {

			System.out.println("La fecha introducida no es válida.");
		}

		/*
		 * if (!fecha.esBisiesto()) {
		 * 
		 * System.out.println("No es bisiesto.");
		 * 
		 * } else {
		 * 
		 * System.out.println("Es bisiesto."); }
		 */

		System.out.println("Si le añadimos un día resulta: ");

		fecha.diaSiguiente();

		System.out.println(fecha);

	}

}
