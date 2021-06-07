package tv;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.powerOnOff();
		tv.powerOnOff();
		tv.powerOnOff();
		tv.powerOnOff();
		
		for(int i=0;i<50;i++)
			tv.chDown();
		for(int i=0;i<50;i++)
			tv.chUp();
		for(int i=0;i<50;i++)
			tv.volDown();
		for(int i=0;i<50;i++)
			tv.volUp();
	}

}
