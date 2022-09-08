package p03.method_override2;

/*
  	Method Overrides
  	부모와 자식 class간의 관계가 없는 일반 class에서는 override된 method나 field가 있을 때 항상 자식 class의 field, method만 호출 가능
*/
public class MethodOverridingEx {
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		Line line = new Line();
		line.draw();		// Line class에서 선언한 메소드 draw()를 호출
		
		Rect rect = new Rect();
		rect.name = "Rect_New";
		rect.draw();		// Rect class에서 선언한 메소드 draw()를 호출
		
		Circle circle = new Circle();
		circle.draw();		// Circle class에서 선언한 메소드 draw()를 호출
	}
}
