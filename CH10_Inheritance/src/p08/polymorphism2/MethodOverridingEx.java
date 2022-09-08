package p08.polymorphism2;

/*
 	Polymorphism 사용 방법
 	1. 부모 자식 클래스 만들고, 메소드 오버라이드 시킴.
 	2. 실제 코딩은 부모로 promotion시켜서 override된 method 위주로 코딩.
 	
	Polymorphism 사용 목적
	1. 소스코드 재사용하고
	2. 소스코드 수정 최소화
*/
public class MethodOverridingEx {
	
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		
		// promotion 
		shapes[0] = new Line("Lines");
		shapes[1] = new Rect("Rects");
		shapes[2] = new Circle("Circles");
		
		for(int i=0; i<shapes.length; i++ ) {
//			shapes[i].draw();
			shapes[i].paint();
		}
		
	}
}
