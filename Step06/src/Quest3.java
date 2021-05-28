import java.util.Scanner;

public class Quest3 {

	public static void main(String[] args) {
		//숫자 두개를 입력 받은 후
		//입력 받은 두 수의 최대 공약수를 출력
		int n1, n2, gcd=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		n2 = sc.nextInt();
		
		if(n1>n2) {
			//n1과 n2의 값을 교환
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
				
		for(int i=2;i<=n1;i++) {
			if(n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		System.out.println("두 수의 최대 공약수 : " + gcd);
	}

}
