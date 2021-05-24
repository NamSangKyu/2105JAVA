import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		//변수 선언 
		int dan, is=1;
		//출력하고 싶은 구구단의 단값을 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고싶은 구구단의 단을 입력하세요 : ");
		dan = sc.nextInt();
		//반복문 - is < 10
		while(is<10) {
		//	제어변수, 입력받은 단값을 곱해서 아래 형태처럼 출력
		//	dan + " * " + is + " = " + dan * is;
			System.out.println(dan + " * "+is+" = " + dan*is);
		//	위에 내용을 출력 후 is값을 증가
			is++;
		}
	}

}
