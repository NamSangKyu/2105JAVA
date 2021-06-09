import java.util.Scanner;

/*
 * 회원정보 관리하는 클래스
 * 		배열로 회원 정보를 관리
 * 		데이터를 추가, 삭제, 수정, 검색
 */
public class MemberService {
	private MemberVO arr[];
	private int index;//데이터를 추가할 인덱스
	
	public MemberService() {
		arr = new MemberVO[10];
	}
	//추가
	public void addMemberVO(Scanner sc) {
		if(index == arr.length) {
			System.out.println("더이상 저장할 공간이 없습니다.");
			return;
		}
		String name, tel, email;
		System.out.println("회원 정보 추가를 시작합니다............");
		System.out.print("회원명 : ");
		name = sc.nextLine();//문자열 입력
		System.out.print("연락처 : ");
		tel = sc.nextLine();//문자열 입력
		System.out.print("이메일 : ");
		email = sc.nextLine();//문자열 입력
		
		arr[index++] = new MemberVO(name, tel, email);
		System.out.println("데이터 추가 완료");
	}
	//검색
	public MemberVO searchMemberVO(Scanner sc) {
		//검색할 이름
		String name;
		System.out.println("회원 정보 검색을 시작합니다.........");
		System.out.println("검색할 회원명 : ");
		name = sc.nextLine();
		
		for (int i = 0; i < index; i++) {
			if(arr[i].getName().equals(name)) {
				System.out.println("검색 결과");
				arr[i].printInfo();
				return arr[i];
			}
		}
		System.out.println("검색 결과 없음");
		return null;
	}
	//수정
	public void updateMemberVO(Scanner sc) {
		System.out.println("회원정보 수정을 시작합니다......");
		MemberVO vo = searchMemberVO(sc);//수정할 대상을 조회
		if(vo == null) return;
		String name, tel, email;
		System.out.print("수정할 회원명 : ");
		name = sc.nextLine();//문자열 입력
		System.out.print("수정할 연락처 : ");
		tel = sc.nextLine();//문자열 입력
		System.out.print("수정할 이메일 : ");
		email = sc.nextLine();//문자열 입력
		
		vo.setName(name);
		vo.setTel(tel);
		vo.setEmail(email);
		
		System.out.println("회원정보 수정이 완료되었습니다.");
	}
	//삭제
	public void deleteMemberVO(Scanner sc) {
		//삭제할 데이터를 검색
		String name;
		System.out.println("회원 정보 삭제를 시작합니다.........");
		System.out.println("삭제할 회원명 : ");
		name = sc.nextLine();
		
		for (int i = 0; i < index; i++) {
			if(arr[i].getName().equals(name)) {
				for(int j=i;j<index-1;j++) {
					arr[j] = arr[j+1];
				}
				index--;
				System.out.println("삭제가 완료 되었습니다.");
				return;
			}
		}
		System.out.println("삭제할 데이터가 없습니다.");
	}
	public void allPrintMemberVO() {
		System.out.println("전체 회원정보 출력을 시작합니다.....");
		if(index == 0) {
			System.out.println("등록된 회원 정보가 없습니다.");
			return;
		}
		
		for(int i=0;i<index;i++)
			arr[i].printInfo();
	}
	
}






