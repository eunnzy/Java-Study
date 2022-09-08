package p01.basic;

/*
	문자열 합치기 : s1.concat(s2) => s1 + s2
	 - concat => concatenate
	 - 
*/

public class StringBasic4 {

	public static void main(String[] args) {
		String s1 = "Welcome to ";
		String s2 = "Java";
		String s3;
		
		s3 = s1.concat(s2);			// s3 = s1 + s2;
		System.out.println("s3 = " + s3);
		System.out.println("s1.length = " + s1.length());
		System.out.println("s2.length = " + s2.length());
		System.out.println("s3.length = " + s3.length());
		
		s3 = s2.concat(s1);			// s2 = s2 + s1;
		System.out.println("s3 = " + s3);
	
		s3 = s1 + s2;
		System.out.println("s3 = " + s3);
		
		s3 = s2 + s1;
		System.out.println("s3 = " + s3);
		
	}
	

}
