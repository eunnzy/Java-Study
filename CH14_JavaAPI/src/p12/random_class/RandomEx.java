package p12.random_class;

import java.util.Random;

/*
	Math.random() => 0 ~ 0.99999 사이의 값을 return
	Random class가 별도로 존재.
	random.nextInt(45) == (int) (Math.random * 45) ==> 0 ~ 44
	
	* Random(long seed) : 똑같은 난수를 반복적으로 생성하고 싶을 때 seed를 지정해 주면 됨.
	  - ex) Random random2 = new Random(1);	Random random2 = new Random(1);  => random1과 random2는 똑같은 난수를 return함.
*/

public class RandomEx {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random1 = new Random(1);
		
		System.out.print("선택번호 : ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random1.nextInt(45) + 1;	// 1 ~ 45 사이의 난수 정수값 return
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		int[] winNumber = new int[6];
		Random random2 = new Random(1);
		
		
		System.out.print("당첨번호 : ");
		for(int i=0; i<6; i++) {
			winNumber[i] = random2.nextInt(45) + 1;
			System.out.print(winNumber[i] + " ");
		}
		System.out.println();
		
	}

}
