package p04.datatypes_casting;

/*
 	casting의 문제점
 	  - 큰 data type의 값이 작은 data type으로 변환되면서 데이터가 유실됨.
 	  - 즉, 정보를 잃어버릴 가능성이 있다. 
 */

public class CastingEx2 {

	public static void main(String[] args) {
		byte byteValue = 0;
		int intValue = 257;
		double doubleValue = 323.142;
		
		// 4 byte 데이터를 1 byte만 남기고 전부 삭제.
		byteValue = (byte) intValue;
		System.out.println("byteValue = " + byteValue);
		
		intValue = (int) doubleValue;
		System.out.println("intValue = " + intValue);

	}

}
