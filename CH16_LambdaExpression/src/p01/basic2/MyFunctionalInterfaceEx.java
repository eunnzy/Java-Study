package p01.basic2;

/*
	람다 표현식 사용 규칙
	1. method 본문 내용 코딩을 가능하면 1개 명령어로 coding 할 것
	  => 추상메소드 body에 있는 명령어가 1개이면 {} 제거 가능. ex) fi = () -> System.out.println();
*/

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "method call";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {
			System.out.println("method call2");
		};
		fi.method();
		
		fi = () -> System.out.println();
		fi.method();
		
	}

}
