
public class Student {
	//학번
	String sno; 
	//이름
	String name;
	//학과
	String major;
	//평점
	double score;
	
	//기본생성자 -- 학번 00000000, 이름 김철수, 학과 임시학과, 평점 : 1.0으로 초기화하는 생성자 작성
	Student() {
		sno = "000000000";
		name = "김철수";
		major = "임시학과";
		score = 1.0;
	}

	//필드 초기화하는 생성자 작성 학번 이름 학과 평점 모두 초기화
	public Student(String sno, String name, String major, double score) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
		this.score = score;
	}
	
	
	
	
	
}








