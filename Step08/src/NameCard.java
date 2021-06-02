
public class NameCard {
	private String name;
	private String company;
	private String tel;
	private String email;
	private String position;
	private String address;

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

	//setter/getter 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
