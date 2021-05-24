import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수하나 입력을 받은 후
		int n;
		System.out.print("출력할 개수 입력 : ");
		n = sc.nextInt();
		//입력받은 정수 개수 만큼 Hello World를 출력
		//1번째 방법
		int i = 0;
		while(i<n) {
			System.out.println("Hello World");
			i++;
		}
		//2번째 방법
//		while(n > 0) {
//			System.out.println("Hello World");
//			n--;
//		}
	}

}



