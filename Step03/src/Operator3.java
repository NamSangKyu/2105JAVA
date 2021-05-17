
public class Operator3 {
	/*
	 * 	증감 연산자 : 변수의 내용을 1씩 증가, 1씩 감소시키는 연산자
	 * 				= 이없어도 값을 변경시켜서 저장
	 * 		++		--
	 * 	전위형	++num	  num이 해야될 연산을 하기전에 증가 
	 * 	후위형	num++     num이 해야될 연산을 한 후에 증가
	 */
	public static void main(String[] args) {
		//정수형 변수 두개 선언, 두변수에 값을 10으로 초기화
		int n1, n2;
		n1 = n2 = 10;
		System.out.println(n1); //10
		System.out.println(n1++);//10
		System.out.println(n1); //11
		System.out.println("--------------------");
		System.out.println(n2);//10
		System.out.println(++n2);//11
		System.out.println(n2); //11
		
		//단독으로 실행 할때는 전위든 후위든 상관이 없다.
		n1++;
		++n2;
	}

}
