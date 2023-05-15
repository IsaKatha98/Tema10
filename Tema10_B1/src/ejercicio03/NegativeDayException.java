package ejercicio03;

public class NegativeDayException extends Exception{
	
public String getMessage () {
		
		String res="";
		
		res= "Los días no pueden ser negativos.";
		
		return res;
	}

}
