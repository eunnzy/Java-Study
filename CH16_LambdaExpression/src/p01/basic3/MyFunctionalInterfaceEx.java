package p01.basic3;

/*
	인터페이스 추상 메소드에 매개변수가 있는 경우의 람다표현식
	1. 추상 메소드의 parameter 개수가 1개이면 () 제거 가능.
*/

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x) ->  {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(5);
		
		fi = (x) -> {
			System.out.println(x * 5);
		};
		fi.method(5);
		
		fi = x -> System.out.println(x * 5);
		fi.method(5);
		
	}

}
