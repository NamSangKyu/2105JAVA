
public class MemberVO {
	/*
	 * 회원 클래스
	 * 		이름, 연락처, 이메일
	 */
	private String name;
	private String tel;
	private String email;

	public MemberVO(String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	public void printInfo() {
		System.out.println(name + " " + tel + " " + email);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
