package p03.method_override;

/*
  	Method Overrides
  	부모 method를 호출하더라도, 자식 class에서 override된 method가 존재하면, 자식 method를 호출.
  	
*/
public class MethodOverridingEx2 {
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.paint();		// 부모 method인 paint() 호출 
		
		Line line = new Line();
		line.paint();		// override된 method draw()를 호출
		
		Rect rect = new Rect();
		rect.paint();		
		
		Circle circle = new Circle();
		circle.paint();		
	}
}
