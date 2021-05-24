
public class DoWhileEx {

	public static void main(String[] args) {
		int i=60;
		//do-while 선처리 후검사 방식이기 때문에,
		//처음 조건이 거짓이더라도 단 한번은 실행
		do {
			System.out.println("Hello World");
			i++;
		}while(i<5);
	}

}
