package p03.method_override;

public class Rect extends Shape{
	
	// Shape class(부모클래스)와 메소드가 동일(override)
	@Override
	public void draw() {
		System.out.println("Rect class - draw()");
	}
	
}
