package p01.basic;

/*
 	String 문자데이터의 길이 구하기 : length() 메소드 사용.
	1. 한글과 영어글자 1문자를 length에서는 1개로 인식.
		- 한글, 영어 글자는 unicode로 구성되어 있음.
ㄴ*/
public class StringBasic2 {

	public static void main(String[] args) {
		String message = "Welcome to Java";
		String message2 ="안녕하세요, 자바씨!!";
		
		System.out.println(message + " 변수의 문자 길이 = " + message.length());
		System.out.println(message2 + " 변수의 문자 길이 = " + message2.length());
		
	}

}
