
public class ArrayEx1 {

	public static void main(String[] args) {
		//배열 선언 방법
		//정수형으로 배열을 5개짜리 선언
		int[] arr = new int[5];
		
		//번호표 ---> 인덱스
		//인덱스 0부터 시작  ---> 마지막 인덱스 번호는 배열 개수 - 1
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		//arr.length --> 배열 개수
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println("-------------");
		arr = new int[10];
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}

}


