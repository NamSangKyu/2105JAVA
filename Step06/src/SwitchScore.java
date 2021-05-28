import java.util.Scanner;

public class SwitchScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자 입력
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		/*
		 * 점수 입력을 받으면 아래 등급표에 해당하는 등급을 출력 
		 * 100   A   10
		 * 90~99 A    9 
		 * 80~ 89 B	  8 
		 * 70~ 79 C   7
		 * 50~ 69 D   5  6
		 * 0~ 49 F
		 */
		//switch로 변경
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
		case 5:
			System.out.println("D");
			break;
		default:
			System.out.println("D");
			
		}
	}

}
