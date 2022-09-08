package p01.basic;

/*
 	문자열 내부에서 특정 문자를 다른 문자로 바꾸기: replace
 	1. replace (oldChar, newChar)
 	 	- 문자열 내에서 oldChar를 newChar로 바꾸기
*/
public class StringBasic10 {

	public static void main(String[] args) {
		String s1 = "apple";
		
		System.out.println(s1.replace('p', 'n'));
	}

}
