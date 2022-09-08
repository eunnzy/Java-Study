package q01.quiz05_Quiz05_6;
// 교재 연습 문제 6번
public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		/*
		 	Child 클래스는 Parent 클래스 상속 받고 있는 자식 클래스 이므로, 	인스턴스 생성 되면 부모의 생성자도 호출됨.
		  
		 	<출력결과>
		 	Parent(String nation) call		// 	기본 생성자에서 this("")로 String name 파라미터를 갖고 있는 생성자를 호출 하므로 출력됨.
	 		Parent() call
	 		Child(String name) call
	 		Child() call
		 */
	}
}
