package p03.anonymous_class;

/*
  	부모 클래스와 자식 클래스 간에도 자식 클래스를 익명객체로 만들어 부모 클래스 타입으로 자동형변환하여 사용
 */
public class AnonyClassEx {

	public static void main(String[] args) {
		AnonyClass ac = new AnonyClass();
		
		ac.person.wake();
		ac.method1();
		
//		자식 익명객체를 method2의 parameter로 넘김.
		ac.method2(new Person() {
			void study() {
				System.out.println("공부를 합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("9시에 일어납니다.");
				study();
			}
		});
		
	}

}
