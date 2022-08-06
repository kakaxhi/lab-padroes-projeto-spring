package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SinlgetonEager;
import one.digitalinnovation.gof.singleton.SinlgetonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
				
		SinlgetonEager eager = SinlgetonEager.getInstancia();
		System.out.println(eager);
		eager = SinlgetonEager.getInstancia();
		System.out.println(eager);
		
		SinlgetonLazyHolder lazyHolder = SinlgetonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SinlgetonLazyHolder.getInstancia();
		System.out.println(lazy);
		
		//Strategy:
		
	
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		
		
		//facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Diego ","18320000");
	
		
	}

}
