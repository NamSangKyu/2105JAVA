
public class LoopIfQuest {

	public static void main(String[] args) {
		/*
		 * 	1부터 100까지 숫자 중 3과 5의 배수만을 출력
		 * 	단 3과 5의 공배수는 단 한번만 출력
		 */
		for(int i=1;i<101;i++) {
			if(i % 3 == 0 || i % 5 == 0)
				System.out.print(i + " ");
		}

	}

}
