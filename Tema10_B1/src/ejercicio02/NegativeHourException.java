package ejercicio02;

/**
 * Clase que lanza una excepcion en caso de que la hora no sea correcta.
 * Extiende la clase Exception
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class NegativeHourException extends Exception {
	
	/**
	 * Función que devuelve el mensaje de una excepción.
	 * 
	 * @return res mensaje de la excepción.
	 */
	public String getMessage() {
		
		String res="";
		
		res="La hora no puede ser un número negativo";
		
		return res;
	}
}
