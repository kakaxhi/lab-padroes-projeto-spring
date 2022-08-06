package one.digitalinnovation.gof.singleton;
/**
 * Singleton "Lazy Holder"
 * @author Diegaço
 *
 */

public class SinlgetonLazyHolder {
	
	
	private static class InstanceHolder{
		public static SinlgetonLazyHolder instancia = new SinlgetonLazyHolder();
	}
	
	private SinlgetonLazyHolder () {
		super();
	}
	
	public static SinlgetonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
		}
		
			
	}


