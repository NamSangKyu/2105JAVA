import java.util.Scanner;

public class InputNumber {

	public static void main(String[] args) {
		//정수형 변수 하나 선언
		int num;
		//입력 받는 객체를 선언
		Scanner sc = new Scanner(System.in);
		
		//숫자 입력
		num = sc.nextInt(); 
		//입력받은 숫자 출력
		System.out.println("입력받은 숫자 : "+num);

	}

}
