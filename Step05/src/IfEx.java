import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//숫자 입력
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		//입력한 숫자가 양수면, 양수라고 출력
		if(num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		}
		//			음수면, 음수라고 출력
		if(num < 0) {
			System.out.println("입력하신 숫자는 음수입니다.");
		}
		//			0이면 0이라고 출력
		if(num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
	}

}





