package p03.method_override3;

/*
 	Override한 자식 method의 access modifier는 큰 범위에서 작은 범위로 갈 수 없음.
 	- 부모가 public일 때, 자식이 default, private으로 선언 불가.
 	- 부모가 private, default일 때 자식이 public으로 선언가능.
*/
public class SuperSonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL;
	
	@Override		// @Override annotation : compile할 때, override가 된지를 error check 
	public void fly() {

		// 기본 : super.fly() 재사용
		// 자식 class의 override된 메소드에서는 변경 내용만 코딩
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행입니다.");
		}else {
			super.fly();		// override된 부모 method를 재사용.
		}
	}
	
	
	
}
