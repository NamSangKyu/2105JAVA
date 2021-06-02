
public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student("1111", "홍씨", "게임학과", 4.423);
//		std1.sno = "11111";//private 으로 선언된 변수나 메서드는 외부에서 접근 불가
		std1.printStudentInfo();
	}

}
