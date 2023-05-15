package ejercicio03;

public class NegativeMonthException extends Exception {
	
	public String  getMessage() {

		String res = "";

		res = "Los meses no pueden ser negativos.";

		return res;
	}
}
