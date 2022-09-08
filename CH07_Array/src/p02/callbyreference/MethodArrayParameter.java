package p02.callbyreference;

/*
	1. number : call by value(값에 의한 호출) 의해 x의 값이 1이 number로 copy
	2. numbers : y의 값(주소값)이 numbers로 copy (주소를 copy해서 call by reference라고 함)
	 	=> call by reference에 의해서 호출된 메소드 안에서 배열 원소 값을 수정하면 
	 	   main 메소드에서 해당 배열 원소값이 수정됨.
*/

public class MethodArrayParameter {

	public static void main(String[] args) {
		int x = 1;
		int[] y = new int[10];
		
		for(int i=0; i<y.length; i++) {
			y[i] = 100;
		}
		
		testArrayParameter(x, y);
		System.out.println("x = " + x);			// testArrayParameter(x, y); 실행 후, 출력하면 x 값은 변하지 않음.
		for(int i=0; i<y.length; i++) {
			System.out.println("y[" + i + "] = " + y[i]);
		}
		
	}

	public static void testArrayParameter(int number, int[] numbers) {
		number = 1001;
		numbers[0] = 3333;
		
	}
	
}
