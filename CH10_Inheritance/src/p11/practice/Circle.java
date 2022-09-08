package p11.practice;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// 원의 면적
	public double getArea() {
		return (Math.PI * this.radius * this.radius);

	}

	// 원의 지름
	public double getDiameter() {
		return (2 * this.radius);
	}

	public double getPerimeter() {
		return (Math.PI * 2 * this.radius);
	}

	public void printCircle() {
		System.out.println("Circle createdDate : " + getDateCreated() + ", radius : " + this.radius);
	}

	@Override
	public String toString() {
		return super.toString() + ", radius : " + this.radius;
	}
}
