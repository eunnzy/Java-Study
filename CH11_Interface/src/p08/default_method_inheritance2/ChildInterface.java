package p08.default_method_inheritance2;

/*
	부모 인터페이스의 method1(), default method2()를 추상메소드로 override 가능
*/
public interface ChildInterface extends ParentInterface{
	
	void method3();

	@Override
	void method2();
}
