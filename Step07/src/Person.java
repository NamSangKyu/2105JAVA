/*
 * 사람 인적 정보 하나 저장하는 클래스
 * 		Person이 가지고 있는 인적 정보는 이름, 나이
 * 		이름과 나이를 저장할 변수를 Person 클래스{}내에 
 *  	변수 선언을 하면 됨
*/
public class Person {
	//클래스 구성 요소로 선언된 변수를 필드(field)
	//이름
	String name;
	//나이
	int age;
	
	//기본 생성자 - default constructor
	//Person(){} //생성자를 않넣으면 왼쪽과 같은 아무 일도 안하는 기본생성자를 자동으로 추가
	Person(){
		System.out.println("Person Default Constructor");
		//객체를 생성했을때 제일 먼저 해야될 일을 작성
		name = "임시값";
		age = 666;
	}
	
	//필드 초기화하는 생성자
	Person(String n){
		name = n;
		age = 777;
	}
	//필드 중에 나이를 생성자에서 받아서 초기화하는 생성자, 이름은 임시값 저장
	Person(int a){
		age = a;
		name = "임시값";
	}
}

















