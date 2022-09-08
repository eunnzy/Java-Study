package p06.generic_inheritance;

/*
	자식 generic class는 부모 generic class에서 선언되지 않은 새로운 generic type을 추가로 지정 가능.
	
*/

public class ChildProduct<T, M, C> extends Product<T, M>{
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
	
}
