package q01.quiz04_Quiz03;

public class TestRectangle {

	public static void main(String[] args) {
		// 사각형 인스턴스 2개 생성
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		
		// 가로가 4이고 높이가 40인 r1
		r1.width = 4;
		r1.height = 40;
		
		// 가로가 3.5, 높이가 35.9인 r2
		r2.width = 3.5;
		r2.height = 35.9;
		
		System.out.println("r1의 width : " + r1.width +", height : "+ r1.height + ", 넓이 : " + r1.getArea() + ", 둘레 : " + r1.getPerimeter());
		System.out.println("r2의 width : " + r2.width +", height : "+ r2.height + ", 넓이 : " + r2.getArea() + ", 둘레 : " + r2.getPerimeter());
		
	}

}
