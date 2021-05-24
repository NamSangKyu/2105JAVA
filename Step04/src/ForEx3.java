import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		int dan;
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고싶은 구구단의 단을 입력하세요 : ");
		dan = sc.nextInt();
		for(int is=1;is < 10;is++) {
			System.out.println(dan + " * " + is + " = " + dan * is);
		}
	}

}
