package one.digitalinnovation.gof.singleton;
/**
 * Singleton "apressado"
 * @author Diegaço
 *
 */

public class SinlgetonEager {
	private static SinlgetonEager instancia = new SinlgetonEager();
	
	private SinlgetonEager () {
		super();
	}
	
	public static SinlgetonEager getInstancia() {
		return instancia;	
	}

}
