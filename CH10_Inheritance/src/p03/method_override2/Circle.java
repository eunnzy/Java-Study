package p03.method_override2;

/*
  	자식 클래스에서 부모 class를 override 하였더라도 명시적으로 부모 class의 인스턴스인
  	super 객체 인스턴스 사용하여 부모 클래스의 field, method 호출 가능
 */
public class Circle extends Shape{
	String name;
	
	// Shape class(부모클래스)와 메소드가 동일(override)
	@Override
	public void draw() {
		this.name = "Circle";		// 부모 클래스의 field를 호출
		super.name = "Shape_new";	// 부모 클래스의 method를 호출
		super.draw();
		System.out.println("Circle class - draw()");
	}
}
