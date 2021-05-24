
public class WhileEx4 {

	public static void main(String[] args) {
		/*
		 * 1부터 100까지 합을 출력 코드를 작성
		 */
		int i=1, total = 0;
		while(i<101) {
			//System.out.println(i);
			total += i;
			i++;
		}
		System.out.println(total);
	}

}
