package dio.gof.singleton;

/**
 * Singleton "pregui�oso"
 * @author leandrocsg
 *
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	public SingletonLazy() {
		super();
		
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null ) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
