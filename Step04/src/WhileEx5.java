import java.util.Scanner;

public class WhileEx5 {

	public static void main(String[] args) {
		/*
		 * 정수하나 입력받아서
		 * 입력 받은 정수의 팩토리얼(Factorial) 값을 출력
		 * 
		 * 예>
		 * 숫자하나 입력 : 5
		 * 120
		 * 
		 * 팩토리얼은 해당 숫자부터 1까지의 곱을 구한 결과
		 */
		int i=1, n, fac=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		n= sc.nextInt();
		
		while(i<=n) //반복문에서 실행할 일이 한줄이면 {}는 없어도 됨, 다음 ;까지가 실행할 영역으로 잡음
			fac *= i++;
		
		//두번째 버전
//		while(n > 0) 
//			fac*= n--;
//		System.out.println(fac);
		
		System.out.println(n+"! : "+fac);
		
	}

}







