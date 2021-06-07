package static_variable_method;

public class Singletone {
	private static Singletone instance = new Singletone();
	private int count;
	private Singletone() {
		System.out.println("Singletone Constructor");
		count++;
	}
	
	public static Singletone getInstance() {
		if(instance == null)
			instance = new Singletone();
		return instance;
	}

	public int getCount() {
		return count;
	}

}
