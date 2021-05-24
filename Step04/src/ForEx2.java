
public class ForEx2 {
	//for문 구성요소로 for(초기화;조건식;증감식) 영역이 있을때
	//이미 외부나 내부에서 제어하는 부분이 있어서
	//초기화, 조건식, 증감식이 필요 없는 경우도 있음
	//그럴경우 해당 영역을 표시하기위해 ;만 찍어 놓음, 내용은 빈칸으로 두면 됨
	public static void main(String[] args) {
		int i=5;
		for(	;i>0;	) {
			System.out.println("Hello World");
			i--;
		}
		for(;;)
			System.out.println("for world");

	}

}
