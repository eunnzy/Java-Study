package p02.runtime_exception;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

/*
	ClassCastException
	- 부모 인스턴스를 자식인스턴스로 강제형변환(casting) 할 때 발생하는 Exception
*/

public class ClassCastExceptionEx {

	public static void main(String[] args) {
		
		try {
			Dog dog = new Dog();
			changeDog(dog);
			System.out.println("Dog 인스턴스로 강제형변환 되었습니다.");
			
			Cat cat = new Cat();
			changeDog(cat);
			
		}catch(ClassCastException e) {
			System.out.println("Dog 인스턴스로 변환 불가합니다.");
		}
		
	}
	
	public static void changeDog(Animal animal) {
//		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
//			System.out.println("Dog 인스턴스로 강제형변환 되었습니다..");
//		}else {
//			System.out.println("Dog 인스턴스로 변환 불가합니다.");
//		}
	}

}
