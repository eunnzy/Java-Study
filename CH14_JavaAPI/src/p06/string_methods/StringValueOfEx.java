package p06.string_methods;

/*
 	valueOf method : primitive data type(int, double, long, boolean, ...등)을 문자열로 변환
 */
public class StringValueOfEx {

	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(false);
		
		System.out.println(str1);	// "10"
		System.out.println(str2);	// "10.5"
		System.out.println(str3);	// "false"
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
				
	}

}
