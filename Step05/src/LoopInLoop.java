
public class LoopInLoop {
	/*
	 * 반복문 중첩
	 * 		반복문안에 또다른 반복문이 있는 형태
	 * 	대표 예제로 2단~9단까지 반복문을 출력
	 */
	public static void main(String[] args) {
		for(int dan=2;dan<10;dan++) {
			System.out.println(dan + "단");
			for(int i=1;i<10;i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}
	}

}
