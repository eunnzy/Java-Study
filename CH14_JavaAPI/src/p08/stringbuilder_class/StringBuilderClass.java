package p08.stringbuilder_class;

/*
	String 문제점 : 새로운 문자열이 생길 때마다 기존 문자열과 힙메모리에 새로 생김.
	StringBuilder class : String class의 문제점을 해결
	 - 문자열 연산을 하더라도 힙메모리에 한개의 문자열로 관릭 됨.
	 - 내부적으로 String Builder class가 byte[] 배열을 넉넉한 크기로 초기에 만듬.

*/
public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();		// sb = "";
		
		sb.append("Java ");
		sb.append("Programming Study");
		System.out.println(sb);
		
		sb.insert(4, "2");
		System.out.println(sb);
		
		sb.setCharAt(4, '6');
		System.out.println(sb);
		
		sb.replace(6, 13, "Book");
		System.out.println(sb);
		
		sb.delete(4, 5);
		System.out.println(sb);
		
		System.out.println("총 문자 수 : " + sb.length());
		System.out.println(sb.toString());
	}

}
