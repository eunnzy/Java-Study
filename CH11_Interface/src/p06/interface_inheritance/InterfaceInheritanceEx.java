package p06.interface_inheritance;

public class InterfaceInheritanceEx {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB();		// InterfaceA에는 methodA() 메소드만 존재하므로 methodB(), methodC()는 불가능.
//		ia.methodC();
		
		InterfaceB ib = impl;
		ib.methodB();
//		ib.methodA();	
//		ib.methodC();
		
		InterfaceC ic = impl;
//		InterfaceC는 InterfaceA, InterfaceB를 상속하기 때문에 methodA(), methodB()에도 접근이 가능하다.
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		
	}

}
