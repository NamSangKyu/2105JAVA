import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberService service = new MemberService();
		
		while(true) {
			System.out.println("--- 회원관리 프로그램 ---");
			System.out.println("register - 회원정보등록");
			System.out.println("search - 회원정보검색");
			System.out.println("update - 회원정보수정");
			System.out.println("delete - 회원정보삭제");
			System.out.println("all - 전체회원정보 출력");
			System.out.println("exit - 프로그램 종료");
			System.out.print("사용할 명령문을 입력하세요 : ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "register":
				service.addMemberVO(sc);
				break;
			case "search":
				service.searchMemberVO(sc);
				break;
			case "update":
				service.updateMemberVO(sc);
				break;
			case "delete":
				service.deleteMemberVO(sc);
				break;
			case "all":
				service.allPrintMemberVO();
				break;
			case "exit":
				System.out.println("프로그램 종료합니다....");
				return;
			}
		}
	}

}


