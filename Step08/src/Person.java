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
		return food;//결과값을 전달하고 메서드가 종료
		//food = "";//실행되지 않는 무의미한 코드
	}
	//이 메서드는 나이를 외부로 부터 받아서 field age에 저장하는 메서드
	//단 나이를 외부에서 받아서 저장을 할때 나이는 0보다 큰 값만 저장
	//만약 0이하의 값이 들어오면 값을 저장 못하게끔 처리
	void setAge(int age) {
		/*
		 * if(age > 0) this.age = age;
		 */
		if(age < 1)
			//메서드를 강제 종료(리턴타입이 void이면 전달해줄 값이 없기 때문에 return;으로 처리)
			return;
		this.age = age;
	}
	
}












