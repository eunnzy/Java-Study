package p06.method_parameter_object;

/*
	1. method return type을 class로 선언한 경우 (return값이 힙메모리에 생성된 인스턴스 주소)
	2. method parameter로 class 사용한 경우 (힙메모리에 생성된 인스턴스 주소가 parameter에 copy됨)
*/
public class TestPassObject3 {

	public static void main(String[] args) {
		Circle circle = createCircleInstance(1);
		
		System.out.println("circle 주소 : " + System.identityHashCode(circle));
		
		int times = 5;
		
		printAreas(circle,times);
		
	}
	
	public static void printAreas(Circle c, int times) {
		System.out.println("Radius \t\t Area");
		while(times >= 1) {
			System.out.println(c.getRadius() +"\t\t" + c.getArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
	}
	
	public static Circle createCircleInstance(double radius) {
		if(radius < 0) {
			return null;
		}
		
		Circle c = new Circle(radius);
		System.out.println("c 주소 : " + System.identityHashCode(c));
		
		return c;
	}

}
