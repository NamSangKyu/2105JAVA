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
	//수정
	//삭제
	
	
	
	
}
