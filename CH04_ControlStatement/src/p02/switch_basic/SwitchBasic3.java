package p02.switch_basic;

/*
	switch문에서 case에 사용 가능한 data type
	- 정수형 data type : byte, char, short, int, long
	- String data type 
	
	 ** 참고로 float, double은 사용 불가(오차가 있기 때문에)
 */

public class SwitchBasic3 {

	public static void main(String[] args) {
		String position = "과장";

		switch(position) {
		case "부장" :
			System.out.println("급여가 700만원입니다.");
			break;
		case "과장" :
			System.out.println("급여가 500만원입니다.");
			break;
		case "대리" :
			System.out.println("급여가 400만원입니다.");
			break;
		default :
			System.out.println("급여가 300만원입니다.");
			break;
		}
	
	}

}
