package q01.quiz04_Quiz03;

public class Rectangle {
	double width=1;
	double height=1; 
	
	// default 생성자.
	public Rectangle() {
	}
	
	// 사각형의 넓이 double형으로 리턴
	public double getArea() {
		return width * height;
	}
	
	// 사각형의 둘레 double형으로 리턴
	public double getPerimeter() {
		return (width * 2) + (height * 2);
	}
}
