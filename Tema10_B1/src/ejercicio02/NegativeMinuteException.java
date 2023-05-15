package ejercicio02;

public class NegativeMinuteException extends Exception{
	
	public String getMessage() {
		
		String res="";
		
		res="Los minutos no pueden ser negativos.";
		
		return res;
	}

}
