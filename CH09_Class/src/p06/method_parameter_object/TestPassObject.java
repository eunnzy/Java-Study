package p06.method_parameter_object;

// 기본
public class TestPassObject {

	public static void main(String[] args) {
		Circle circle = new Circle(1);
		
		int times = 5;
		
		System.out.println("Radius \t\t Area");
		while(times >= 1) {
			System.out.println(circle.getRadius() +"\t\t" + circle.getArea());
			circle.setRadius(circle.getRadius()+1);
			times--;
		}
		
	}

}
