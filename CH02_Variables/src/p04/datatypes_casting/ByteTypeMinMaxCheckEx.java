package p04.datatypes_casting;

/*
 	강제형변환 할 때 사용하는 programming tip
 	 ** casting 가능한지 MIN_VALUE와 MAX_VALUE를 check하여 확인할 것
 */

public class ByteTypeMinMaxCheckEx {

	public static void main(String[] args) {
		int num = 128;
	
		System.out.println("byte 최대값 : " + Byte.MIN_VALUE);    // -128
		System.out.println("byte 최대값 : " + Byte.MAX_VALUE);	// 127
		
		if ( (num < Byte.MIN_VALUE) || (num > Byte.MAX_VALUE) ) {  
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		}else { 
			byte bNum = (byte) num;
			System.out.println("bNum = " + bNum);
		}
		
	}

}
