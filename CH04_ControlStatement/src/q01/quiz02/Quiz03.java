package q01.quiz02;

import java.util.*;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/*
			ArrayList<Integer> arr = new ArrayList<>();
			// 3개의 정수를 받아올 정수형 ArrayList 생성
			
			for(int i=0; i<3; i++) {		// 정수 입력 받기
				System.out.print("정수를 입력해주세요: ");
				int num = input.nextInt();
				arr.add(num);
			}
			
			System.out.println(arr);	// 입력받은 정수들 출력
			
			Collections.sort(arr);	  	// 오름차순 정렬	
			System.out.println(arr);	// 정렬된 숫자 출력
		*/
		
		System.out.print("정수 3개를 입력해주세요: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a < b) {	
			if(a < c) {
				if(b < c) {		// a < b && a < c && b < c		--> a < b < c
					System.out.println("정렬 후 : " + a + ", " + b + ", " + c);
				}else {			// a < b && a < c && b <= c
					System.out.println("정렬 후 : " + a + ", " + c + ", " + b);
				}
			}else {				// a < b && a >= c 
				System.out.println("정렬 후 : " + c + ", " + a + ", " + b);
			}
			
		}else {		// a >= b
			if(a > c) {	
				if(b < c) {			// a >= b && a > c && b < c
					System.out.println("정렬 후 : " + b + ", " + c + ", " + a);
				}else {    		// a >= b && a > c && b >= c
					System.out.println("정렬 후 : " + c + ", " + b + ", " + a);
				}
			}else {				// a <= c && a >= b
				System.out.println("정렬 후 : " + b + ", " + a+ ", " + c);
			}
		}
		
		
		
	}

}
