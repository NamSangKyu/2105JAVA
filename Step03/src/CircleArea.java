import java.util.Scanner;

public class CircleArea {
	/*
	 * 	반지름을 Scanner를 이용해서 정수로 입력 받은 후
	 *  입력 받은 반지름을 이용하여 원넓이 출력 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//변수를 선언 - 반지름(int), 원넓이(double)
		int r;
		double area;
		
		//입력 및 초기화
		System.out.println("반지름 입력 : ");
		r = sc.nextInt();
		//계산
		area = r*r*3.1415;
		//결과를 출력
		System.out.println("반지름 "+r+"인 원의 넓이는 "+area);
	}

}
