import java.util.Scanner;

public class ThreeOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("숫자 입력 >");
		n = sc.nextInt();
		// 입력한 숫자가 음수면 양수로 바꿈
		// 삼항연선자
		// 조건식 ? 조건식이 true일때 나타낼 값 : 조건식이 false일때 나타낼값;
		n = n < 0 ? -n : n;
		System.out.println(n);

	}

}
