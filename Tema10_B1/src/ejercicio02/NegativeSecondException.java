package ejercicio02;

public class NegativeSecondException extends Exception {
	
	public String getMessage () {
		
		String res="";
		
		res= "Los segundos no pueden ser negativos.";
		
		return res;
	}
	

}
