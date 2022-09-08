package p01.not_generic;

/*
	1. Box class 만든 목적
	 - 모든 class의 instance를 사용하고 싶어서 object field의 data type을 Object class로 선언
	2. Box class의 한계 및 문제점 : getObject method 등을 사용할 때 항상 자식 class로 변환하는 casting을 해줘야 함.
	 - 수행 시간이 소요가 되고, 불필요한 promotion과 casting을 계속 반복하는 문제 있음.   
*/

public class BoxEx {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObject("홍길동");		// promotion 
		String name = (String) box.getObject();	// casting
		
		box.setObject(new Apple());		// promotion
		Apple apple = (Apple) box.getObject();	// casting
			
//		box.setObject(new Integer(10));		// promotion
		box.setObject(10);	// auto boxing(int -> Integer로 변환) 후에 promotion 발생
		Integer i  = (Integer) box.getObject();	// casting
	}

}
