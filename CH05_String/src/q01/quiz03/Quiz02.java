package q01.quiz03;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("사원 번호를 입력하세요 : ");
		String id = input.next();
	
		if(isIdCheckTrue(id)) {		// 사원번호 형식 확인
			System.out.println(id + "는 사원 번호 형식이 맞습니다.");
		}else {
			System.out.println(id + "는 사원 번호 형식이 틀립니다.");
		}
	}
	
	public static boolean isIdCheckTrue(String id) {		// 사원 번호 형식 확인
		int rightCount=0;		
		
		 for(int i=0; i<id.length(); i++) {
			 if(i==3 || i==6) {				
				 if(id.charAt(i) =='-') {
					 rightCount++;
				 }
			 }else {
				 if(Character.isDigit(id.charAt(i))) {
					 rightCount++;
				 }
			 }
		 }
		 
		 if(rightCount == 11) {		// 사원 번호 형식 DDD-dd-dddd
			 return true;
		 }
		 
		 return false;
	}

}
