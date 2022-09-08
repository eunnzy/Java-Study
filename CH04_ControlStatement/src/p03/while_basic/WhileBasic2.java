package p03.while_basic;

public class WhileBasic2 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 1;
		
		while (number <= 10) {
			sum += number;			// sum = sum + number;		=> sum = 0 + 1 + 2 + ... + 10
			number++;				// number = number + 1;
		}
		
		System.out.println("1~10까지의 합 = " + sum);
		
	}

}
