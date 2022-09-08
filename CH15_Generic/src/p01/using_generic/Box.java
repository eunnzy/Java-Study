package p01.using_generic;

/*
	<T> : generic data type (<-> specific)
	1. class 이름 바로 다음에 사용
	2. T는 class Box에서 사용하는 data type (가상의 데이터 타입, 아직 결정되지 않은 데이터 타입)
	3. T 대신에 어떠한 다른 글자를 사용해도 됨. (T: template) => Box<A> 같이 가능.
	4. 일반적으로 1글자의 영문자를 사용.
	5. Box<T> : data type이면서 class이름 으로 간주 가능.
*/
public class Box<T> {
	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}
