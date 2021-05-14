import java.util.Scanner;

public class InputQuest {

	public static void main(String[] args) {
		//숫자 두개 입력 받아서
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력> "); //문자열 출력후 줄바꿈 X
		num1 = sc.nextInt();
		System.out.print("숫자 하나 입력> ");
		num2 = sc.nextInt();
		//사칙연산 결과를 출력
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}

}
