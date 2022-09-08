package p05.class_class;

/*
	Class class 의미
	1. Circle class와 같은 특정 class에 대한 정보를 갖고 있는 class 
	  - 특정 class에 대한 정보 : Circle class와 같이 class 이름, package 이름, 
	  						 field 이름, constructor 이름, method 이름 등의 정보를 갖고 있음.
	2. 사용 방법
	  1) Object class의 getClass() method 사용
	    - class 정보를 알고 싶은 특정 class에 대해 new로 인스턴스 만든 후 사용 (비추천)
	  2) Class class의 static method인 forName method 사용 (추천)
	    - Class.forName("특정 package 이름 + class 이름");

*/
public class CircleEx {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Class cls = circle.getClass();
		
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getPackage());
		System.out.println();
		
		try {
			Class cls2 = Class.forName("p05.class_class.Circle");
			System.out.println(cls2.getName());
			System.out.println(cls2.getSimpleName());
			System.out.println(cls2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			System.err.println("해당하는 class 이름이 없습니다.");
		}
	}

}

