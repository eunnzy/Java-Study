package p01.basic;

/*
   	1. 배열 (array) : 특정 type의 원소가 연속적으로 메모리에 할당된 data type을 의미.
	2. int[] arr 
		=> 1) int[] : 배열 type (배열 원소의 data type이 int인 array)
	   	   2) arr : 변수 이름
	3. {10, 60, 30, 40} -> 배열 초기값, 각각의 데이터를 배열 원소의 데이터값으로 설정한다는 의미
	4. arr[index] => index가 0인 경우는 첫번째 배열 원소, 1인 경우는 두번째 배열 원소, ...
*/


public class ArrayBasic {

	public static void main(String[] args) {
		// 1. 배열 선언하면서 초기값 {} 사용 방법
		int[] arr = {10, 60, 30, 40};
		System.out.println("arr 첫번째 원소 : " + arr[0]);
		System.out.println("arr 두번째 원소 : " + arr[1]);
		System.out.println("arr 세번째 원소 : " + arr[2]);
		System.out.println("arr 네번째 원소 : " + arr[3]);
		System.out.println("arr 전체 원소 개수 : " + arr.length);
		

		int[] arr1 = {50, 30, 70, 90};
		System.out.println("arr1 첫번째 원소 : " + arr1[0]);
		System.out.println("arr1 두번째 원소 : " + arr1[1]);
		System.out.println("arr1 세번째 원소 : " + arr1[2]);
		System.out.println("arr1 네번째 원소 : " + arr1[3]);
		System.out.println("arr1 전체 원소 개수 : " + arr1.length);
		
	
		double[] arr2 = {1.2, 2, 3, 4};			// 정수로 넣어도 promotion(자동형변환) 발생.
		System.out.println("arr2 첫번째 원소 : " + arr2[0]);
		System.out.println("arr2 두번째 원소 : " + arr2[1]);
		System.out.println("arr2 세번째 원소 : " + arr2[2]);
		System.out.println("arr2 네번째 원소 : " + arr2[3]);
		System.out.println("arr2 전체 원소 개수 : " + arr2.length);
			
	
		
		// 2. 배열만 선언하고 나중에 초기값 넣는 방법
		int[] arr3;
		arr3 = new int[] {5, 6, 7, 8, 9};			// new + data type (배열 타입인 경우는 예를 들면 int[])
		System.out.println("arr3 첫번째 원소 : " + arr3[0]);
		System.out.println("arr3 두번째 원소 : " + arr3[1]);
		System.out.println("arr3 세번째 원소 : " + arr3[2]);
		System.out.println("arr3 네번째 원소 : " + arr3[3]);
		System.out.println("arr3 다섯번째 원소 : " + arr3[4]);
		System.out.println("arr2 전체 원소 개수 : " + arr3.length);
		
		
		// 3. 배열 원소의 값이 없는 배열 크기만 생성
		int[] arr4 = new int[4];  	// 4개 원소를 가진 배열을 메모리에 생성해달라는 의미
		arr4[0] = 10;
		arr4[1] = 20;
		arr4[2] = 30;
		arr4[3] = 40;
		System.out.println("arr4 전체 배열원소의 개수: " + arr4.length);
		
		int[] intArray;
		intArray = new int[10];
		intArray[4] = 10;
// 		intArray.length = 20; 		// 배열의 길이는 수정불가.
//		intArray = new int[4];
//		intArray[4] = 10;		// 오류 발생: ArrayIndexOutOfBoundsException (인덱스 범위 벗어남)
		
		
		
	}

}
