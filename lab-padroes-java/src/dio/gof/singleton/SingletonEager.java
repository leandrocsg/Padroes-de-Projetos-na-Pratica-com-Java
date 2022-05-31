package dio.gof.singleton;

/**
 * Singleton "apressado"
 * @author leandrocsg
 *
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	public SingletonEager() {
		super();
		
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
