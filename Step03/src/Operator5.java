
public class Operator5 {

	public static void main(String[] args) {
		int n1 = 10, n2 = 5;

		// AND 연산 : 조건식1 && 조건식2 ---> 조건식이 둘다 true일떄만 true가 되는 연산자
		//				    true      true
		System.out.println(n1 > 5 && n2 < 10);
		System.out.println(n1 > 5 && n2 > 10);
		// AND는 모든 조건이 전부 true일때 true
		System.out.println(n1 > 5 && n2 < 10 && n1 != n2);
		
		//OR 연산 : 조건식1 || 조건식2 ---> 조건식이 둘중에 하나가 true이면 true가 되는 연산자
		System.out.println(n1 < 5 || n2 < 10);
		System.out.println(n1 < 5 || n2 > 10);
		// OR는 하나라도 조건이 true면 결과가 true
		System.out.println(n1 > 5 || n2 > 10 || n1 == n2);
		
		//NOT 연산 : !조건식  --> true면 false, false면 true 뒤집는 연산
		System.out.println(!(n1 < 5));
		boolean result = n1 < 5;
		System.out.println(!result);
	}

}





