package p04.generic_extends;

/*
	Double.compare(a, b) method의 return 값
	1) a < b : -1 return
	2) a = b : 0 return
	3) a > b : 1 return
*/
public class GenericExtendsEx {

	public static void main(String[] args) {
//		int result = Util.compare("a", "b");	// String에 대해서 쓸 수 없음.
		
		int result = Util.compare(10, 20);
		System.out.println(result);

		result = Util.compare(4.5, 3);
		System.out.println(result);
		
		
	}

}
