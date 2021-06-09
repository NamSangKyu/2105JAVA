import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		//배열 초기화
		int arr1[] = new int[5];
		float arr2[] = new float[5];
		boolean arr3[] = new boolean[5];
		String arr4[] = new String[5];
		//배열은 생성을 하면 기본적으로 0이 저장
		//false --> 0, 객체 --> null
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		//            0 1 2 3 4
		int arr5[] = {1,2,3,4,5};//C언어 방식
		int arr6[] = new int[]{1,2,3,4,5};
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
	}

}



