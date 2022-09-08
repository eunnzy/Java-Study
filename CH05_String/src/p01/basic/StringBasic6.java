package p01.basic;

/*
	문자열 내용(contents) 비교하기: s1.equals(s2)
	 - equals의 return 값이 true이면 s1과 s2의 문자열 내용이 동일. false이면 동일하지 않음. 
	 - toLowerCase()나 toUpperCase()로 변환하여 equals 사용하는 것이 의미 있는 경우도 많음.
*/

public class StringBasic6 {

	public static void main(String[] args) {
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "welcome to java";

		if(s1.equals(s2)) {
			System.out.println("s1과 s2의 문자열 내용이 같습니다.");
		}else {
			System.out.println("s1과 s2의 문자열 내용이 다릅니다.");
		}
		
		if(s1.equals(s3)) {
			System.out.println("s1과 s3의 문자열 내용이 같습니다.");
		}else {
			System.out.println("s1과 s3의 문자열 내용이 다릅니다.");
		}
	
		if(s1.toUpperCase().equals(s3.toUpperCase()))	{
			System.out.println("s1과 s3의 문자열 대문자로 변환한 내용이 같습니다.");
		}else {
			System.out.println("s1과 s3의 문자열 대문자로 변환한 내용이 다릅니다.");
		}
		
	}

}
