package static_variable_method;

public class FishBread {
	private String toping;
	public static int count = 0;
	public FishBread(String toping) {
		this.toping = toping;
		count++;
		System.out.println(toping+" 붕어빵 완성, 총생성된 붕어빵 누적개수 : " + count);
	}
	public static int getCount() {
		return count;
	}
	public void printInfo() {
		System.out.println("이 붕어빵 토핑은 "+toping + "입니다.");
	}
	
}
