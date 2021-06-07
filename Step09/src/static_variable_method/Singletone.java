package static_variable_method;

public class Singletone {
	private static Singletone instance = new Singletone();

	private Singletone() {
		System.out.println("Singletone Constructor");
	}
	
	public static Singletone getInstance() {
		if(instance == null)
			instance = new Singletone();
		return instance;
	}
	
}
