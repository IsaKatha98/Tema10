package ejercicio02;

/**
 * Clase Hora que gestiona un reloj que comprueba que las horas, minutos y segundos introducidos son válidos,
 * muestra la hora correcta y modifica la hora en caso de que se le pase un número concreto de segundos.
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class Hora {

	//Declaramos los atributos con private.
	/**
	 * Atributo privado de tipo entero, referente a la hora.
	 */
	private int hora;
	
	/**
	 * Atributo privado de tipo entero referente a los minutos.
	 */
	private int min;
	
	/**
	 * Atributo privado de tipo entero referente a los segundos.
	 */
	private int seg;
	
	/**
	 * Constructo por defecto, no tiene parámetros y no devuelve nada.
	 */
	
	public Hora() {
		
	}

	/**
	 * Constructor de la clase Hora, con parámetros.
	 * @param hora
	 * @param min
	 * @param seg
	 */
	
	public Hora (int hora, int min, int seg) throws NegativeHourException, NegativeMinuteException, NegativeSecondException{
		
		if (hora>=0&&hora<=23) {
			this.hora=hora;
		
		} else {
			throw new NegativeHourException();
		}
		
		if (min>=0&&min<=59){
			this.min=min;
		
		} else {
			throw new NegativeMinuteException();
		}
		
		if (seg>=0&&seg<=59) {
			this.seg=seg;
		
		} else {
			throw new NegativeSecondException();
		}
		
	}
	
	/**
	 * Método get del atributo hora.
	 * @return un tipo entero hora.
	 */
	public int getHora () {
		
		return hora;
	}
	
	/**
	 * Método set del atributo hora, debe estar entre 0 y 23.
	 * @param hora valor de tipo entero que introduce el usuario.
	 */
	public void setHora(int hora) throws NegativeHourException{
		if (hora>=0&&hora<=23) {
			this.hora=hora;
		
		} else {
			throw new NegativeHourException();
		}
		
	}
	
	/**
	 * Método get del atributo min.
	 * @return un tipo entero min.
	 */
	public int getMin () {
		
		return min;
	}
	
	/**
	 *  Método set del atributo min, debe estar entre 0 y 59.
	 * @param min valor de tipo entero que introduce el usuario.
	 */
	public void setMin (int min) throws NegativeMinuteException {
		if (min>=0&&min<=59) {
			this.min=min;
			
		} else {
			throw new NegativeMinuteException();
		}
		
	}
	
	/**
	 * Método get del atributo seg.
	 * @return un tipo entero seg.
	 */
	public int getSeg () {
		
		return seg;
	}
	
	/**
	 *  Método set del atributo seg, debe estar entre 0 y 59.
	 * @param seg valor de tipo entero que introduce el usuario.
	 */
	public void setSeg (int seg) throws NegativeSecondException {
		
		if (seg>=0&&seg<=59) {
			this.seg=seg;
		
		} else {
			throw new NegativeSecondException();
		}
		
	}
	
	/**
	 * Función que incrementa en un número de segundos la hora.
	 * @param incremento
	 */
	public void incrementaSegundos(int incremento) {
		
		//Creamos un bucle que se ejecute hasta el incremento marcado, una vez por bucle. Añadimos un segundo.
		for (int i=1; i<=incremento; i++) {		
				
			this.seg++;
			
			//Al aplicar el incremento de un segundo, en el caso de que sean mayores de 59, tendrán valor 0 y se incrementa 1 min.
			if (this.seg>59) {
					
				this.seg=0;
				this.min++;
				
				//Al aplicar el incremento de un minuto, en el caso de que sea mayor que 59, tendrá valor 0 y se incrementa 1 hora.
				if ( this.min>59) {
						
					this.min=0;
					this.hora++;
					
					//En el caso de se sobrepase las 23 horas, estas pasarán a valer 0.
					if (this.hora>23) {
							
						this.hora=0;	
					}
				}
					
			}
						 
		} 
		
	}
	
	/**
	 * Función que muestra la hora que es, como un toString.
	 */
	public void muestraHora () {
		
		System.out.println("Esta es la hora: "+getHora()+":"+getMin()+":"+getSeg());
		
		
	}
	
} 

