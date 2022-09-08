package p01.basic2;

/*
  	자식 class에서 부모 class의 method, field 사용 가능.
 	Java는 1개의 부모 class만 상속이 가능(다중 상속은 불가) (추천)
 	 - 참고) C++ : 여러개의 부모 class 상속이 가능.(비추천)
 */
public class ColorPoint extends Point {
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setColorAndPoint(String color, int x, int y) {
		this.color = color;
		// 자식 클래스에서 부모 클래스의 field 사용 가능.
		this.x = x;
		this.y = y;
	}
	
	public void showColorPoint() {
		System.out.print("color : " + color + ", " );
		showPoint();		// 자식 클래스에서 부모 클래스의 method 사용 가능.

	}
	
}
