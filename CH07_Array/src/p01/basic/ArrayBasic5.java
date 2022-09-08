package p01.basic;

/*
	String과 char[]는 data type이 다름.
	참고로, C 언어는 String data type이 없음.
*/
public class ArrayBasic5 {

	public static void main(String[] args) {
		String city1 = "Dallas";
		char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
		
		for(char element : city) {
			System.out.println(element);
		}
		
		System.out.println(city);
		System.out.println(city1);
	}

}
