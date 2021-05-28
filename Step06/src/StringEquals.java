
public class StringEquals {

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = str1;
		String str3 = new String("Hello World");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
//		String a = new String("A");
		String a = "A";
		//switch는 문자열 비교할때 내용으로 비교한다.
		switch(a) {
		case "A":
			System.out.println("저장된 내용이 A");
			break;
		case "B":
			System.out.println("저장된 내용이 B");
			break;
		case "C":
			System.out.println("저장된 내용이 C");
			break;
		}
	}

}
