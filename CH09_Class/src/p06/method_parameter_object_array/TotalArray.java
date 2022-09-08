package p06.method_parameter_object_array;

public class TotalArray {
	
	public static void main(String[] args) {
		Circle[] circleArray; 
		
		circleArray = createCircleArray();
		printCircleArray(circleArray);

		
	}
	
	public static Circle[] createCircleArray() {
		Circle[] c = new Circle[5];
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(Math.random()*100);
		}
		
		return c;
	}
	
	public static void printCircleArray(Circle[] cArr) {
		System.out.println("Radius \t\t Area");
		
		for(int i=0; i<cArr.length; i++) {
			System.out.println(cArr[i].getRadius() + "\t\t" + cArr[i].getArea());
		}
	}
	
}
