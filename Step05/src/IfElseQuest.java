
public class IfElseQuest {
	/*
	 * 	1~100까지 숫자를 출력할때
	 *  짝수는 ★를 출력
	 *  홀수는 ☆를 출력 
	 */
	public static void main(String[] args) {
		for(int i=1;i<101;i++) {
			if(i%2 == 0)
				System.out.print("★");
			else
				System.out.print("☆");
		}

	}

}
