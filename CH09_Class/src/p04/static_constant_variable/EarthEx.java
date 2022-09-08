package p04.static_constant_variable;

public class EarthEx {

	public static void main(String[] args) {
		Earth earth = new Earth();
		System.out.println("지구 반지름 : " + earth.EARTH_RADIUS);
		System.out.println("지구 표면적 : " + earth.EARTH_SURFACE_AREA);
		System.out.println("지구 나이 : " + earth.age);
		
		System.out.println();
		
		System.out.println("지구 반지름 : " + Earth.EARTH_RADIUS);
		System.out.println("지구 표면적 : " + Earth.EARTH_SURFACE_AREA);
//		System.out.println("지구 나이 : " + Earth.age );
		
		
	}

}
