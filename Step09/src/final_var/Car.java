package final_var;

public class Car {
	private int speed;
	private final int MAX_SPEED;
	
	public Car(int max_speed) {
		super();
		MAX_SPEED = max_speed;
	}
	
	public void carInfo() {
		System.out.println("현재 속도 : "+speed);
		System.out.println("최대 속도 : "+MAX_SPEED);
	}
	
}
