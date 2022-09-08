package p03.anonymous_class;

public class AnonyClass {
//	Person의 익명 자식 class의 인스턴스를 만들고, 부모로 promotion시킴.
	Person person = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	public AnonyClass() {	// constructor
		System.out.println("AnonyClass constructor call");
	}
	
	void method1() {	
//		자식 익명객체를 부모인 localVar로 자동형변환(promotion)
		Person localVar = new Person() {	// 익명 자식 인스턴스 
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				walk();
			}
		};
		
		localVar.wake();	// polymorphism 수행.
	}
	
	// promotion 발생(자식 익명객체를 부모로 자동형변환)
	void method2(Person person) {
		person.wake();		// polymorphism 수행
	} 
}
