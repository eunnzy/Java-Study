package q01.quiz03;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = input.next();
		
		if(passwordCheck((pw))) {
			System.out.println(pw + "는 유효합니다.");
		}else {
			System.out.println(pw + "는 유효하지 않습니다.");
		}
		
	}
	
	public static boolean passwordCheck(String pw) {
		if(pw.length() < 10) {
			return false;
		}
		
		int countNum = 0;
		for(int i=0; i<pw.length(); i++) {
			if(Character.isLetterOrDigit(pw.charAt(i))) {
				if(Character.isDigit(pw.charAt(i))) {
					countNum++;
				}
			}
		}
		
		if(countNum >=3) 
			return true;

		return false;
	}

}
