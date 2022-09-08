package p02.multi_type_generic;

/*
 	Generic type으로 T, M을 사용하겠다는 의미 (generic multi type)
 	 - generic type 뿐만 아니라, 일반 primitive type, 다른 class들도 사용가능.
 	 - 대부분 class들은 최대 3개까지의 generic type 사용
 */
public class Product<T, M> {
	private T kind;
	private M model;
	private int age;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
	
}
