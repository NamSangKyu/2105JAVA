/*
 * 	학생 클래스
 * 		필드
 * 			학번, 이름, 학과, 평점
 * 		생성자는 학번 이름 학과 평점을 모두 초기화
 * 	
 * 		메서드
 * 			학생정보를 출력하는 메서드
 * 				---> 20201111 홍길동 경제학과 3.7(B+)
 * 
 * 		private 은 외부에서 접근 불가
 */
public class Student {
	private String sno;
	private String name;
	private String major;
	private double score;

	public Student(String sno, String name, String major, double score) {
		this.sno = sno;
		this.name = name;
		this.major = major;
		this.score = score;
	}

	// 성적 등급을 구하는 메서드
	public String getGrade() {
		String grade = "F";
		int s = (int) (score / 0.5);
		switch (s) {
		case 9:
			grade = "A+";
			break;
		case 8:
			grade = "A";
			break;
		case 7:
			grade = "B+";
			break;
		case 6:
			grade = "B";
			break;
		case 5:
			grade = "C+";
			break;
		case 4:
			grade = "C";
			break;
		case 3:
			grade = "D+";
			break;
		case 2:
			grade = "D";
			break;
		}
		return grade;
	}

	public void printStudentInfo() {
		System.out.println(sno + " " + name + " " + major + " "
							+ score + "(" + getGrade() + ")");
	}

}
