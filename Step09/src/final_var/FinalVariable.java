package final_var;

public class FinalVariable {
	//final 키워드 변수 선언하면 최초에 저장된 값을 끝날때까지 유지
	public static void main(String[] args) {
		final int n = 100;//n을 상수로 만듬
		//n++;
		//n+=100;
		System.out.println(n+100);
		final double PI;//상수명은 전부 대문자로, 단어와 단어 사이에 _로 구분
		PI = 3.1415; //최초의 한번은 저장이 됨
	}

}
