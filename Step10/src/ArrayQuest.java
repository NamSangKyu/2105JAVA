import java.util.Iterator;
import java.util.Scanner;

public class ArrayQuest {

	public static void main(String[] args) {
		/*
		 * 1. 정수형 배열 10개짜리 선언 
		 * 2. 정수형 배열에 Scanner를 이용하여 숫자를 전부 입력
		 * 3. 배열에 있는 모든 값의 합을 출력
		 * 4. 배열에 있는 값들 중 최대값을 출력
		 * 5. 배열에 있는 값들 중 최소값을 출력
		 */
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.err.print("숫자 입력 : ");
			arr[i] = sc.nextInt(); 
		}
		int total = 0, max = 0, min = 0;
		
		total = max = min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			total += arr[i];
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
		}
		System.out.println("총합 : " + total);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}

