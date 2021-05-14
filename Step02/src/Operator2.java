
public class Operator2 {
	/*
	 * 복합대입연산자 ---> 연산 결과를 왼쪽에 있는 변수에 연산 후 저장(누적)
	 * 		 += -= *= /= %=
	 */
	public static void main(String[] args) {
		int num = 10;

		num += 20;// num = num + 20;
		System.out.println(num);
		num -= 5;
		System.out.println(num);
		num *= 3;
		System.out.println(num);
		num /= 2;
		System.out.println(num);
		num %= 6;
		System.out.println(num);
	}

}
