package tv;
/*
 * TV 클래스
	field
		채널	- int, 채널 최소값 : 1, 채널 최대값 : 777
		음량 - int, 음량 최소값 : 0, 음량 최대값 : 30
		전원 - boolean, 전원On : true, 전원Off : false
		
	method
		채널Up() - void , 채널Down() - void
		음량Up() - void , 음량Down() - void
		전원OnOff() - void
		
		생성자() - 초기값 자유롭게 셋팅
 */
public class TV {
	private int ch;
	private int vol;
	private boolean power;
	private final int MAX_CHANNEL = 777;
	private final int MIN_CHANNEL = 1;
	private final int MAX_VOL= 30;
	private final int MIN_VOL= 0;
	
	public TV() {
		ch = 36;
		vol = 14;
		power = false;
	}
	
	public void chUp() {
		ch++;
		if(ch > MAX_CHANNEL) ch = MIN_CHANNEL;
		System.out.println("현재 채널 : "+ch);
	}
	public void chDown() {
		ch--;
		if(ch < MIN_CHANNEL ) ch = MAX_CHANNEL;
		System.out.println("현재 채널 : "+ch);
	}
	
	public void volUp() {
		if(vol < MAX_VOL) vol++;
		System.out.println("현재 음량 : "+vol);
	}
	public void volDown() {
		if(vol > MIN_VOL) vol--;
		System.out.println("현재 음량 : "+vol);
	}
	
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("TV 전원 On");
		else
			System.out.println("TV 전원 Off");
			
	}
}



