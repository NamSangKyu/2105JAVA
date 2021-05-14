
public class OperatorEx1 {
	/*
	 * 사칙연산
	 * 		덧셈		+
	 * 		뺄셈		-
	 * 		곱셈		*
	 * 		나눗셈	/ (몫)
	 * 		나눗셈	% (나머지)
	 * 
	 */
	public static void main(String[] args) {
		//정수형 변수 2개 선언 , 변수명 자유롭게
		//초기화는 각각 5, 3으로 변수를 초기화
		int n1 = 5, n2 = 3;

		//정수와 정수를 계산하면 정수가 결과값으로 나옴
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
		
		int result = 0;//변수 선언
		result = n1 + n2; // n1 + n2 결과를 result에 저장
		System.out.println("result : " + result);
		result = n1 * n2; // n1 * n2 결과를 result에 저장
		System.out.println("result : " + result);//마지막에 저장된 값만 유지
		
	}

}





