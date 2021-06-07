package static_variable_method;

public class SingletoneMain {

	public static void main(String[] args) {
		//Singletone s1 = new Singletone();
		Singletone s1 =  Singletone.getInstance();
		System.out.println(s1.getCount());
		System.out.println(Singletone.getInstance().getCount());
		
	}

}
