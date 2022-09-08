package p01.basic;

/*
	문자열 크기 비교 : s1.compareTo(s2) 메소드
	1. s1과 s2의 문자열을 알파벳 순서로 비교하는데 첫번째 문자부터 비교함.
	2. compareTo 메소드 실행 결과 
	 	- s1의 문자열 > s2의 문자열 => 양수의 값을 return
	 	- s1의 문자열 == s2의 문자열 => 0의 값을 return
	 	- s1의 문자열 < s2의 문자열 => 음수의 값을 return
*/

public class StringBasic7 {

	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "banana";
		String s3 = "pineapple";
		String s4 = "banana";
		
		System.out.println(s1 + "과 " + s2 + "의 크기 비교 결과: " + s1.compareTo(s2));			// -1
		System.out.println(s1 + "과 " + s3 + "의 크기 비교 결과: " + s1.compareTo(s3));			// -15
		System.out.println(s2 + "과 " + s1 + "의 크기 비교 결과: " + s2.compareTo(s1));			// 1
		System.out.println(s2 + "과 " + s4 + "의 크기 비교 결과: " + s2.compareTo(s4));			// 0
		System.out.println("kiwi와 orange의 크기 비교 결과 : " + "kiwi".compareTo("orange"));	// -4
		
	}
	

}
