package q01.quiz03;

import java.util.Scanner;

// 문자열 내림차순 정렬)
public class Quiz04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] country = new String[3];
		
		System.out.print("나라 이름을 3개 입력하세요 : ");
		country[0] = input.next();
		country[1] = input.next();
		country[2] = input.next();
		
		
		for(int i=0; i<country.length; i++) {
			for(int j=i+1; j<country.length; j++) { // i+1 부터
				if(country[i].compareTo(country[j]) < 0) {		// i가 j(i+1 : 다음 문자열)보다 작으면 
					String temp = country[i];		// 문자열 위치 바꿔주기 
					country[i] = country[j];
					country[j]= temp;
				}
			}
		}
		
		for(int i=0; i<country.length; i++) {
			System.out.print(country[i] + " ");
		}
		
	}
	

}
