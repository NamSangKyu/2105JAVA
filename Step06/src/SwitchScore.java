import java.util.Scanner;

public class SwitchScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자 입력
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		/*
		 * 점수 입력을 받으면 아래 등급표에 해당하는 등급을 출력 
		 * 90~100 A 
		 * 80~ 89 B 
		 * 70~ 79 C 
		 * 50~ 69 D 
		 * 0~ 49 F
		 */
		//switch로 변경
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 50) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
