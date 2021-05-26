
public class LoopInLoop2 {
	public static void main(String[] args) {
		int dan=2;
		int i=1;
		while(dan<10) {
			System.out.println(dan + "단");
			i=1;
			while(i<10) {
				System.out.println(dan + " * " + i + " = " + dan * i);
				i++;
			}
			dan++;
		}
	}

}
