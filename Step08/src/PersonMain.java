
public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		p.printPersonInfo();
		p.eat("파스타");
		p.eat("초밥");
		p.eat("떡볶이");
		System.out.println(p.getFood());
		Person d = new Person("김철수", 30);
		d.printPersonInfo();
		String name = "";
		System.out.println(name);
		d.setAge(33);
		d.printPersonInfo();
		d.setAge(-20);
		d.printPersonInfo();
	}

}



