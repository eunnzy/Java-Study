package p04.static_constant_variable;

/*
	field
	1. instance field : 
	  - heap memory에서 생성된 instance 안에 있는 field
	  - instance 생성할 때마다 field가 따로 생성됨.
	  - 항상 instance를 생성한 후, instance를 통해 field 사용해야만 함.
	2. static field ('static' 키워드가 붙어 있는 field)
      - heap memory의 instance안에 존재하지 않음. (힙메모리에 올라가지 않음.)
      - 별도 다른 메모리 영역에 보관 
      - new로 instance를 여러개 만들더라도 오직 1개만 존재
	  - program application 전체에서 공통으로 사용되는 변수 (변수값은 변경 가능)
	    (예를 들면, version, application에서 공통으로 사용하는 folder directory, ... 등)
	  - class 이름으로 static field를 사용하는 것이 원칙. (ex. Earth.EARTH_RADIUS를 사용 가능)
	  - new로 instance를 생성하여 static field 사용하는 것도 가능.
	3. static final을 같이 사용 경우 : 상수(constant)
	  - 상수는 한 개만 필요한데, 만약 final만 사용할 경우는 인스턴스 마다 상수가 반복 생성되고 
	    항상 인스턴스 생성 후에 상수를 사용해야만 함.
	  => 상수는 메모리에 오직 1개만 생성이 되기 때문에 static final을 사용할 것을 권장
	     
	static : 정적변수.
	  - 
*/
public class Earth {
	static final double EARTH_RADIUS = 6400;		// static field
	static final double EARTH_SURFACE_AREA = 4 * Math.PI*EARTH_RADIUS;	// static field
	int age;		// instance field
	
}
