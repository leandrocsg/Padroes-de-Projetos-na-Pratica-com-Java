package dio.gof.singleton;

/**
 * Singleton "apressado"
 * @author leandrocsg
 *
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
	public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	public SingletonLazyHolder() {
		super();
		
	}
	
	public static SingletonLazyHolder getInstancia() {
		return  InstanceHolder.instancia;
	}
}
