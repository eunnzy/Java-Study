package p08.polymorphism;

/*
	다형성(polymorphism) 
	1. promotion(자동형변환) 발생
	  - 부모 인스턴스 = 자식 인스턴스 (ex : Parent parent = child;)
	2. 보무 메소드를 자식 메소드에서 override한 경우에만 해당
	3. 자동형변환과 override 모두 충족이 될 때, 부모 메소드를 실행하는 것이 아니라
	   override된 자식 메소드를 실행.
*/
public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		Parent parent = child;		// promotion 발생 (자동형변환) 
		parent.method1();
		parent.method2();		// child method가 실행이 됨. 
//		parent.method3();		// error 
		
	}

}
