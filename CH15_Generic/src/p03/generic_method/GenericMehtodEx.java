package p03.generic_method;

public class GenericMehtodEx {

	public static void main(String[] args) {
		Box<Integer> b1 = Util.<Integer>boxing(100);	// auto boxing (primitive -> integer로 형변환)
		
		int i1 = b1.getT();
		System.out.println(i1);
		
		Box<String> s1 = Util.<String>boxing("홍길동");
		String name = s1.getT();
		System.out.println(name);
		
		
		
	}

}
