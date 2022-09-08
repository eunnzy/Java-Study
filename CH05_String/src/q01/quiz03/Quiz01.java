package q01.quiz03;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("2문자로 구성된 학생이 소속된 과이름과 학년을 입력하세요: ");
		String student = input.next();
		if(student.length() > 2 ) {
			System.out.println("2개의 문자로 구성된 문자열로 입력해주세요.");
		}
		
		// 각각의 메소드(major과 grade)에서 리턴 받은 문자열 합치기.
		String result = major(student);
		result += grade(student);	
		
		System.out.println(result);
	}
	
	public static String major(String student) {		// 입력한 문자열과 비교하여 알맞은 학과 리턴
		if( student.charAt(0) == 'I') {
			return "정보학과 ";
		}else if(student.charAt(0) == 'A') {
			return "회계학과 ";
		}else if(student.charAt(0) == 'C'){
			return "컴퓨터학과 ";
		}else {
			return	"해당하는 학과가 없습니다.(I, A, C만 가능)";
		}
	}

	public static String grade(String student) {	// 입력한 문자열과 비교하여 알맞은 학년 리턴
		if(student.charAt(1) == '1') {
			return "1학년 입니다.";
		}else if(student.charAt(1) == '2') {
			return "2학년 입니다.";
		}else if(student.charAt(1) == '3') {
			return "3학년 입니다.";
		}else if(student.charAt(1) == '4') {
			return "4학년 입니다.";
		}else {
			return "존재하지 않는 학년입니다. (1, 2, 3, 4만 가능)";
		}
		
	}
}
