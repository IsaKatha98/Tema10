package ejercicio02;

public class NegativeHourException extends Exception {

	public String getMessage() {
		
		String res="";
		
		res="La hora no puede ser un número negativo";
		
		return res;
	}
}
