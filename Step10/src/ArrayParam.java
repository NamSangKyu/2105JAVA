
public class ArrayParam {
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println("]");
	}
	//데이터 타입이 참조형인 경우 매개변수 전달시 원본을 전달이 가능
	//메서드에서 데이터를 직접적으로 변경이 가능 --> Call By Reference
	public static void addArray(int[] arr, int n) {
		for(int i=0;i<arr.length;i++)
			arr[i] += n;
	}
	public static void main(String[] args) {
		//정수형 배열 개수가 5인 배열 선언 초기화
		int[] arr1 = new int[]{1,2,3,4,5};
		//정수형 배열 개수가 7인 배열 선언 초기화 
		int[] arr2 = new int[]{10,11,12,13,14,15,16};
		//정수형 배열 개수가 10인 배열 선언 초기화 
		int[] arr3 = new int[]{20,21,22,23,24,25,26,27,28,29};
		addArray(arr1, 1);
		addArray(arr2, 1);
		addArray(arr3, 1);
		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
	}

}
