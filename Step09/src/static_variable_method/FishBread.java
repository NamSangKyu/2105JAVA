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
	
	public static void eat() {
		count--;
		//System.out.println(toping + " 붕어빵 섭취 완료");
		//static으로 선언된 메서드에서 static으로 선언이 안된 변수나 메서드를 쓸수 없다.
		//static이 할당된 시점에서는 해당 변수나 메서드에 대한 정보가 없다.
	}
	
	
}



