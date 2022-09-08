package p01.basic6;

/*
	this : 
	1. heap 메모리에서 생성된 instance를 가리키는 주소를 갖고 있음.
	2. class 내부에서만 사용됨.
	3. plainPizza, largePizza처럼 힙메모리에 생성된 변수에 대하여
	  ex) plainPizza.setRadius(5), largePizza.setRadius(10)라고 한다면
	      setRadius method 본문 안에 this.radius = newRadius; 명령어가 있을 떄, 
	      this는 plainPizza를 사용할 경우에는 this는 plainPizza이고, largePizza를 사용할 경우에는 this는 largePizza를 의미함.
	=> this는 고정된 것이 아니라, 사용하는 인스턴스 변수에 따라서 바뀜.
*/

public class Circle {
	double radius = 1;;
	String name =  "플레인 피자";
	int price;
	
	public Circle() {		// 디폴트 생성자
		System.out.println("Cirlce() this : " + System.identityHashCode(this));
	}
	
//	public Circle(int price) {
//		this.price = price;
//	}

	public Circle(double radius) {
		System.out.println("Cirlce(double newRadius) this : " + System.identityHashCode(this));
		this.radius = radius;
	}
	

	private Circle(String name) {
		this.name = name;
	}
	
	public Circle(double radius, String name) {
		System.out.println("Cirlce(double newRadius, String newName) this : " + System.identityHashCode(this));
		this.radius = radius;
		this.name = name;
	}

	// 원의 면적을 구하는 method 선언
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	// 원의 둘레 구하는 (원주율) method 선언
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public void setRadius(double radius) {
		// plainPizza.setRadius(10)   => plainPiza.radius = newRadius와 같음.
		this.radius = radius;
	}
	
	public void printCircleInformation() {
		System.out.println("name : " + this.name + ", circle : " + this.radius);
	}
	
	
}
