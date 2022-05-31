package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.Comportamento;
import dio.gof.strategy.ComportamentoAgressivo;
import dio.gof.strategy.ComportamentoDefensivo;
import dio.gof.strategy.ComportamentoNomal;
import dio.gof.strategy.Robo;

public class Test {
	public static void main(String[] args) {
		
		// Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyholder);
		lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyholder);
		
		//Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNomal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		
		// Facade
		
		Facade facade =  new Facade();
		facade.migrarCliente("Leandro", "2248874");
	
		
	}
}


