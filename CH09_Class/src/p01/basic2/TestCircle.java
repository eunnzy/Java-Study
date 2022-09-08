package p01.basic2;


public class TestCircle {

	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자");
		double area = pizza.getArea();
		
		System.out.println(pizza.name + "의 면적: " + area);
		
		// 슈프림수퍼피자, 반지름 = 12
		pizza.radius = 12;
		pizza.name = "슈프림수퍼피자";
		System.out.println(pizza.name + "의 면적: " + area);
		
		Circle pineApplePizza = new Circle(11, "파인애플피자");
		area = pineApplePizza.getArea();
		System.out.println(pineApplePizza.name + "의 면적: " + area);

		Circle donut = new Circle();		// radius가 1인
		donut.name = "도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적: " + area);
		
	}

}
