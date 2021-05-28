import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		//완전수 : 약수들 중 자기 자신 약수를 제외한 약수들의 합이 해당 숫자가 나오는 경우
		//        대표적으로 6 --> 1 2 3 --> 1 + 2 + 3 == 6 완전수
		//숫자 하나 입력 받은 후 해당 숫자가 완전수 인지 아닌지 출력
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		for(int i=1;i<n/2;i++) {
			if(n % i == 0)
				sum += i;
		}
		if(sum == n)
			System.out.println("입력 숫자는 완전수 입니다.");
		else
			System.out.println("입력 숫자는 완전수가 아닙니다.");
	}

}



