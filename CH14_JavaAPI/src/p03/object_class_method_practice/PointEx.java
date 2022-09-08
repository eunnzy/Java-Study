package p03.object_class_method_practice;

public class PointEx {
	
	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(1, 3);
		
		
		if(p1.equals(p2)) {
			System.out.println("Point p1과 Point p2는 같은 점입니다.");
		}else {
			System.out.println("Point p1과 Point p2는 다른 점입니다.");
		}
		
		if(p1.equals(p3)) {
			System.out.println("Point p1과 Point p3는 같은 점입니다.");
		}else {
			System.out.println("Point p1과 Point p3는 다른 점입니다.");
		}
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
	}

}
