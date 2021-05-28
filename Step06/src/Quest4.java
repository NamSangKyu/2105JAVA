import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {
		//숫자 하나를 입력 받은 후
		//입력 숫자가 소수인지 아닌지 판단하는 코드를 작성
		//소수는 1과 자기자신 숫자로만 나누어지는 숫자
		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		for(i=2;i<n;i++) {
			if(n%i == 0)
				break;
		}
		if(n == i) System.out.println("입력하신 숫자는 소수 입니다.");
		else  System.out.println("입력하신 숫자는 소수가 아닙니다.");
	}	

}
