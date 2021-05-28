import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
		/*
		 * 	숫자 하나 입력을 하면
		 *  입력한 숫자에 해당하는 약수들을 전부 출력
		 *  
		 *  입력 : 8
		 *  1 2 4 8 출력
		 */
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n % i != 0)
				continue;
			if(i > n / 2) break;
			
			System.out.print(i + " ");
		}
		System.out.print(n);
	}

}




