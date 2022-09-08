package p01.basic;

// 배열을 for문에 사용 방법
public class ArrayBasic2 {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = {10, 20, 30, 40, 50, 60};
		double[] arr2 = {1.0, 2.0, 3.0, 4.0};
		
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println();
		
		// 향상된 for문 (배열 등 여러개의 원소를 가진 type에서 사용가능)
		// arr 배열에서 첫번째 원소부터 마지막 원소의 값을 차례로 element에 넣어줌. 
		for(int element : arr) {
			System.out.println(element);
		}

		for(double element : arr2) {
			System.out.println(element);
		}
		
		
		
	}

}
