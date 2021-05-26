
public class StringTest {
	/*
	 * 	변수 타입
	 * 		primitive : 고정된 byte 할당되는 변수 타입
	 * 					int, float, double, char....	 * 
	 * 
	 * 		reference : 참조형, 메모리가 고정적이지 않음
	 * 					String
	 */
	public static void main(String[] args) {
		String str = "";//빈문자열로 초기화
		str="Hello World";
		str += 10;
		str += "AAAA";
		System.out.println(str);
	}

}
