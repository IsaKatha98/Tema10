package ejercicio02;

/**
 * Clase que lanza una excepcion en caso de que los segundos introducidos no sean correctos.
 * Extiende la clase Exception
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class NegativeSecondException extends Exception {
	
	/**
	 * Función que devuelve el mensaje de una excepción.
	 * 
	 * @return res mensaje de la excepción.
	 */
	public String getMessage () {
		
		String res="";
		
		res= "Los segundos no pueden ser negativos.";
		
		return res;
	}
	

}
