package p01.basic4;

/*
 	@FunctionalInterface : Lamda expression에서 사용하는 interface라는 것을 의미하는 annotation
 	 - 추상메소드가 1개만 허용됨.
*/
@FunctionalInterface
public interface MyFunctionalInterface {
	int method(int x, int y);
}
