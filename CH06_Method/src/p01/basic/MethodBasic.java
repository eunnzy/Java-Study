package p01.basic;

public class MethodBasic {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("1과 10사이의 합 = " + sum);
		
		
		sum = 0;
		for(int i=20; i<=27; i++) {
			sum += i;
		}
		System.out.println("20과 27사이의 합 = " + sum);
		
		sum = 0;
		for(int i=35; i<=49; i++) {
			sum += i;
		}
		System.out.println("35과 49사이의 합 =" + sum);
	}

}
