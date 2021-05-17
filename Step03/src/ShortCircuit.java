
public class ShortCircuit {

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		// 단락회로 : AND나 OR 연산시 앞에는 조건이 이미 true나 false 결정된 경우 뒤에있는 연산은 생략
		boolean result = n1 < 10 && ++n2 > 10;
		System.out.println(n2);
		result = n1 > 5 || ++n2 > 20;
		System.out.println(n2);
	}

}
