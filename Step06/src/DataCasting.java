
public class DataCasting {

	public static void main(String[] args) {
		int r = 5;
		//자동으로 형변환 되는 경우
		//1. 메모리가 할당되는 바이트 수가 작은 변수 및 값이 바이트수가 큰 변수 또는 값과 계산
		//	  수의 체계상 작은 수나 메모리가 적은 변수 및 값이 바뀜
		//2. 같은 정수나 실수 더라도 메모리 바이트수가 작은 것이 큰걸로 바뀐다.
		System.out.println(r*r*3.1415); //Auto Casting
		
		//강제로 형변환
		double a = 3.56345;
		int n = (int)a;//소수점을 다 버림
		System.out.println(n);
		
		float b = (float)a;
		System.out.println(b==a);
		System.out.println((double)b);
		System.out.println(b==(float)a);

		byte t = 127;
		t++;
		System.out.println(t);
	}

}





