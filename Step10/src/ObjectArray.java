
public class ObjectArray {

	public static void main(String[] args) {
		/*
		 * 클래스 같은 경우 배열 선언시 
		 * 생성된 객체를 저장할 수 있는 변수로 선언
		 * 내용이 비어있다.
		 * 일일이 매번 new 객체 생성을 해줘야 된다.
		 */
		Person[] arr = new Person[10];
		arr[0] = new Person();
		arr[0].setAge(20);
		
	}

}
