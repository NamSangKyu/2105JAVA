
public class PersonMain {

	public static void main(String[] args) {
		//Person 객체 찍어내는 행위 --> 메모리를 할당하는 행위
		Person p1 = new Person();
		//p1.name --> p1안에 있는 변수 name을 나타냄
		System.out.println(p1.name);//null
		System.out.println(p1.age);//0
		//p1이 가지고 있는 변수에 값을 저장
		p1.name = "홍길동";
		p1.age = 20;
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person p2 = new Person();
		p2.name = "김철수";
		p2.age = 33;
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		Person p3 = new Person();
		p3.name = "임시데이터";
		p3.age = 777;
		System.out.println(p3.name);
		System.out.println(p3.age);
		
		
	}

}




