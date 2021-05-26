import java.util.Scanner;

public class IfElseEx {
	/*
	 * 	if(		){
	 * 
	 * 	}else{ //위에 선언 조건들이 전부 거짓일때 실행되는 영역
	 * 
	 * 	}
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//숫자 입력
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//홀짝 나머지 나누기로 확인
		if(num % 2 == 1) {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}

	}

}
