package p02.object_class_tostring2;

/*
	toString method 사용 목적
	1. class를 new로 인스턴스를 만들어 사용할 때, 현재 인스턴스의 모든 field 정보를 얻고자 할 때 사용
		- field가 private으로 선언된 경우 public인 getter method를 통해 field 정보를 개별적으로 알 수 있는데,
		  toString method는 모든 field 정보를 한번에 알 수 있음.(println method 사용하면 됨)
*/

public class SmartPhone {
	private String company;
	private String os;
	
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return (company + ", " + os);
	}
	
	
}
