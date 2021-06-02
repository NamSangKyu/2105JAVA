//명함정보 저장하는 클래스
public class NameCard {
	String name;
	String company;
	String tel;
	String email;
	String position;
	String address;
	
	NameCard() {
		name = "이름";
		company = "회사명";
		tel = "연락처";
		email = "이메일 주소";
		position = "직급";
		address="회사 주소";
	}

	//이름 회사명 연락처 초기화하는 생성자
	public NameCard(String name, String company, String tel) {
		this.name = name;
		this.company = company;
		this.tel = tel;
	}

	//이름 회사명 연락처 이메일 초기화하는 생성자
	public NameCard(String name, String company, String tel, String email) {
		super();
		this.name = name;
		this.company = company;
		this.tel = tel;
		this.email = email;
	}

	//전체 필드 초기화하는 생성자
	public NameCard(String name, String company, String tel, String email, String position, String address) {
		super();
		this.name = name;
		this.company = company;
		this.tel = tel;
		this.email = email;
		this.position = position;
		this.address = address;
	}

	
	
	
}








