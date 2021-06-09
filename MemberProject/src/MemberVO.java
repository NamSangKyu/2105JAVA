
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
	
	
}
