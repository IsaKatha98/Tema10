package ejercicio03;

/**
 * Clase que lanza una excepcion en caso de que el día no sea correcto.
 * Extiende la clase Exception
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class NegativeDayException extends Exception{
	
	/**
	 * Función que devuelve el mensaje de una excepción.
	 * 
	 * @return res mensaje de la excepción.
	 */
public String getMessage () {
		
		String res="";
		
		res= "Los días no pueden ser negativos.";
		
		return res;
	}

}
