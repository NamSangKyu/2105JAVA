
public class VariableEx1 {
	/*
	 * Variable(변수) : 데이터를 하나 저장할 공간
	 * 	변수 타입
	 * 		정수형 : byte(1) short(2) int(4) long(8)
	 * 		실수형 : float(4) double(8)
	 * 		문자형 : char(2)
	 * 		논리형 : boolean(1)
	 * 
	 * 변수 선언 방법
	 * 		변수타입 변수명;
	 * 
	 * 변수 선언 규칙
	 * 		1. 변수명은 중복 X
	 * 		2. 변수명은 대소문자 구분
	 * 		3. 변수명으로 쓸수있는 문자는 알파벳 대소문자, 숫자, 특수문자 _ $
	 * 		4. 키워드와 동일하게 변수명을 쓸수 없음
	 *		5. 첫글자로 쓸수 있는 글자는 알파벳 대소문자, 특수문자 _ $
	 *				-> 변수명 첫글자에는 숫자가 올수 없음 
	 */
	public static void main(String[] args) {
		int num;//정수형 변수하나 num이름으로 공간을 임대받았다.
		//initialize --> 초기화 --> 변수를 만든 후에 데이터를 저장하는 행위
		num = 100;//초기화
		System.out.println(num);
		System.out.println(num+200);

		//변수를 선언하자마자 초기화
		int age = 30;
		System.out.println(age);
		
		//변수 동시에 3개 선언
		int n1=10, n2=20, n3=30;
		System.out.println(n1+n2+n3);
	}

}






