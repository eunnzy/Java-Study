package p08.default_method_inheritance;

public class ChildInterfaceEx {
	
	public static void main(String[] args) {
		ChildInterface ci = new ChildInterface() {
			
			@Override
			public void method1() {
				System.out.println("annoy method1 실행");
			}
			
			@Override
			public void method2() {
				System.out.println("annoy method2 실행");
			}
			
			@Override
			public void method3() {
				System.out.println("annoy method3 실행");
			}
		};
		
		ci.method1();
		ci.method2();
		ci.method3();
		
	}
}
