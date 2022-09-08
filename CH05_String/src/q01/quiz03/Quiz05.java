package q01.quiz03;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String s = input.next();
		int resultCount = countLetters(s);
		System.out.println("전체 문자 개수는 " + resultCount+"입니다.");
	}
	
	public static int countLetters(String s) {
		int count = 0;		// 문자열에 있는 문자 개수 세기 위한 변수
		for(int i=0; i<s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {		// i번째 문자가 문자라면
				count++;	// 개수 증가
			}
		}
		return count;
	}

}
