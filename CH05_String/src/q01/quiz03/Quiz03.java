package q01.quiz03;

import java.util.Scanner;
// 문자열 포함 관계 여부 확인
public class Quiz03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 문자열을 입력 :" );
		String str1 = input.next();
		System.out.print("두번째 문자열을 입력 :" );
		String str2 = input.next();
		
		int searchNum = str1.indexOf(str2);		// 첫번째 문자열(str1)에서 두번째 문자열(str2)이 있으면 str1에서 그 문자열을 찾아 인덱스 값을 반환한다.
		if(searchNum != -1) {		// 만약에 인덱스 값을 못찾았으면 -1을 반환하기 때문에 -1이 아니면 str2는 str1의 substring이다.
			System.out.println(str1 +"는 " + str2+"의 substring입니다." );
		}else {
			System.out.println(str1 +"는 " + str2+"의 substring이 아닙니다." );
		}
		
		
	}
}
