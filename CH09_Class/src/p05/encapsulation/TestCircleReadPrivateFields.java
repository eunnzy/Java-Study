package p05.encapsulation;

public class TestCircleReadPrivateFields {

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
	/*  
	  	Circle class에서 private로 선언된 field, method는 사용 불가.
		circle.radius = 10; 	//  오류 : The field Circle.radius is not visible
		circle.name = "";
		
	*/
		
		System.out.println("circle radius : " + circle.getRadius() + ", area : " 
						+ circle.getArea() +", 생성인스턴스 개수 : " + circle.getNumberOfObjects());
		
		circle.setRadius(10);

		System.out.println("circle radius : " + circle.getRadius() + ", area : " 
				+ circle.getArea() +", 생성인스턴스 개수 : " + circle.getNumberOfObjects());
		
		
	}

}
