package p03.generic_method;

/*
	<T> Box<T> boxing(T t)
	* 처음에 나오는 <T> : method 안에서 T를 data type으로 사용하겠다는 의미
	* Box<T> : return data type
	* boxing(T t) : 메소드 이름과 parameter
*/
public class Util {
	
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setT(t);
		
		return box;
	}
}
