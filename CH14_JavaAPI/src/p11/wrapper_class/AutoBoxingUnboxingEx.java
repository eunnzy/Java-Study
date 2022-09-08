package p11.wrapper_class;

public class AutoBoxingUnboxingEx {

	public static void main(String[] args) {
		Integer obj1 = 100;		// auto boxing
		System.out.println(obj1.intValue());
		System.out.println(obj1);	// obj.toString() 실행한 것과 같음.
		
		int i1 = obj1;		// auto unboxing
		System.out.println(i1);
		
		int result = obj1 + 100;	// auto unboxing
		System.out.println(result);
		
		Double obj2 = 100.23;	// auto boxing
		System.out.println(obj2.doubleValue());
		System.out.println(obj2);
		
		double d1 = obj2;
		System.out.println(d1);
		
		double dResult = obj2 + 12.3;
		System.out.println(dResult);
		
	}

}
