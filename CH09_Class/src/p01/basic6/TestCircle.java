package p01.basic6;


public class TestCircle {

	public static void main(String[] args) {
		Circle plainPizza = new Circle();
		
		System.out.println("plainPizza 변수의 주소 : " + System.identityHashCode(plainPizza));
		plainPizza.printCircleInformation();
		
		System.out.println();
		
		Circle largePizza = new Circle(12);
		System.out.println("largePizza 변수의 주소 : " + System.identityHashCode(largePizza));
		largePizza.printCircleInformation();
		
		System.out.println();
		
		Circle supremePizza = new Circle(15, "슈프림수퍼피자");
		System.out.println("supremePizza 변수의 주소 : " + System.identityHashCode(supremePizza));
		supremePizza.printCircleInformation();
		
		System.out.println();
		
		
	}

}
