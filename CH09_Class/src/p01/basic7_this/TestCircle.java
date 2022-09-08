package p01.basic7_this;

public class TestCircle {

	public static void main(String[] args) {
		Circle plainPizza = new Circle();
		plainPizza.printCircleInformation();
		System.out.println();
		
		Circle largePizza = new Circle(12);
		largePizza.printCircleInformation();
		System.out.println();
		
		Circle supremePizza = new Circle(15, "슈프림수퍼피자");
		supremePizza.printCircleInformation();
		
	}

}
