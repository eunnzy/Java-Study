package p03.method_override2;

/*
	1. 부모와 자식 class가 동시에 같은 이름으로 field를 선언한 경우, 자식에서 선언한 field 이름을 먼저 사용.
	
*/
public class Rect extends Shape{
	
	// Shape class(부모클래스)와 메소드가 동일(override)
	@Override
	public void draw() {
		System.out.println("Rect class - draw()");
	}
	
}
