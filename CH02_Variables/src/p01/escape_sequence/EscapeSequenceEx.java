package p01.escape_sequence;

/*
	escape sequence : \n(엔터키),  \t(탭키), \\, \", \'  
		--> 특수 문자(special character)로 문자열 안에서 사용됨.
	키보드에서 enter key 누르면 -> 2개의 escape sequence 문자가 발생(\n\r)
	 - \n: new line (다음 행으로 넘어감)
	 - \r: carrage return
*/

public class EscapeSequenceEx {
	public static void main(String[] args) {

		System.out.println("n줄 바꿈n연습");
		System.out.println("\n줄 바꿈\n연습");
		System.out.println("t탭키t연습");
		System.out.println("\t탭키\t연습");
		System.out.println("\\ backslash 1개 출력");
		System.out.println("\\\\\\ backslash 3개 출력");
		System.out.println("큰 따옴표 \" 출력");
		System.out.println("작은 따옴표 \' 출력");
	
	}
}
