package p11.wrapper_class;

/*
	String을 primitive type 값으로 변환하는 library => Wrapper class내에 존재.
*/
public class StringToPrimitiveEx {

	public static void main(String[] args) {
		int a = Integer.parseInt("10");
		double d = Double.parseDouble("3.14");
		boolean b = Boolean.parseBoolean("true");
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(b);
		
	}

}
