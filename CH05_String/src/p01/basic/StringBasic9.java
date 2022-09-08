package p01.basic;

/*
	문자열에서 찾고자 하는 문자 또는 문자열의 시작 index 가져오기 
	1. indexOf(char 또는 String, startIndex) 
		- startIndex부터 시작하여 찾고자하는 문자열이 있으면 시작 index를 반환.
		- 단, startIndex가 주어지지 않으면, startIndex는 0부터 시작한다고 가정함.
		- 만약 찾고자 하는 문자나 문자열이 없으면, -1을 반환한다.
		- 문자나 문자열을 찾을 때, 대소문자를 구분하여 찾는다.
	2. lastIndexOf : 문자열의 끝 index부터 시작하여 찾음.
*/

public class StringBasic9 {

	public static void main(String[] args) {
		System.out.println("Welcome to Java".indexOf('W'));
		System.out.println("Welcome to Java".indexOf('o'));
		System.out.println("Welcome to Java".indexOf('o', 5));
		System.out.println("Welcome to Java".indexOf("come"));
		System.out.println("Welcome to Java".indexOf("comet"));		
		System.out.println("Welcome to Java".indexOf("Java", 5));		
		System.out.println("Welcome to Java".indexOf("java", 5));
		System.out.println("Welcome to Java".toUpperCase().indexOf("java", 5));
		
		System.out.println();
		
		System.out.println("Welcome to Java".lastIndexOf('W'));
		System.out.println("Welcome to Java".lastIndexOf('o'));
		System.out.println("Welcome to Java".lastIndexOf('o', 5));
		System.out.println("Welcome to Java".lastIndexOf("come"));
		System.out.println("Welcome to Java".lastIndexOf("comet"));		
		System.out.println("Welcome to Java".lastIndexOf("Java", 5));		
		System.out.println("Welcome to Java".lastIndexOf("java", 5));
		System.out.println("Welcome to Java".toUpperCase().lastIndexOf("java", 5));
		
		
	}

}
