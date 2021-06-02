//Person은 이름과 나이를 가지고 있음
//Person 생성자에서는 이름과 나이를 외부에서 받아서
//Person에 선언된 이름과 나이를 저장하는 필드에 초기화
public class Person {
	String name;
	int age;
	String food;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		food = "";//빈 문자열
		food = new String();
	}
	
	//메서드(method) - 기능 작성
	//	리턴타입 메서드명([매개변수]){
	//	}
	void printPersonInfo(){
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	
	void eat(String food) {
		System.out.println(name +"이 "+food+"를 먹습니다.");
		//먹은 음식을 추가
		this.food += food + ",";
//		System.out.println(this.food);
	}
	
	String getFood(){
		return food;
	}
	
}












