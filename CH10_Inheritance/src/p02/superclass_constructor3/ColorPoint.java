package p02.superclass_constructor3;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);	// Point(x, y) 호출.
	}
	
	public ColorPoint(String color, int x, int y) {
		super(x, y);	// Point(x, y) 호출. 항상 super부터 선언해야함.
		this.color = color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setColorAndPoint(String color, int x, int y) {
		this.color = color;
		super.x = x; 	// this.x = x;
		super.y = y; 	// this.y = y;
	}
	
	public void showColorPoint() {
		System.out.print("color : " + color + ", " );
		super.showPoint();			// this.showPoint();
	}
	
}
