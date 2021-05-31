
public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.sno = "05035065";
		std1.name = "홍길동";
		std1.major = "경제학과";
		std1.score = 3.14;
		
		System.out.println(std1.sno);
		System.out.println(std1.name);
		System.out.println(std1.major);
		System.out.println(std1.score);
		
		std1 = new Student();
		System.out.println(std1.sno);
		System.out.println(std1.name);
		System.out.println(std1.major);
		System.out.println(std1.score);
	}

}



