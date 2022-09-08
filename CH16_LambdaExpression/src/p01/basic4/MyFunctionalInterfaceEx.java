package p01.basic4;

/*
	인터페이스 추상 메소드에 매개변수가 있는 경우의 람다표현식
	1. 추상 메소드의 body가 return 키워드를 포함하여 1개의 명령어로 되어 있으면 {}와 return 키워드 제거 가능
	  ex) fi = (x, y) -> x + y;
*/

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) ->  {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(5, 2));
		
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(5, 2));
		
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(5, 2));
		
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}

}
