package p03.methods_overloading;

// method overloading : method signature가 틀리면 overloading 가능.
public class Calculator {
	double area;
	
	
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	

}
