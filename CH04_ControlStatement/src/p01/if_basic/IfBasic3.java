package p01.if_basic;

/*
	가급적 중첩 if문은 사용하지 않는 것이 바람직
 	   - 만약 중첩 if문을 사용해야 한다면, depth를 가능하면 낮게 해야 한다.
 	   
*/

public class IfBasic3 {

	public static void main(String[] args) {
		int i = 10;
		int j = 5;
		int k = 7;
		
		if(i > k) {
			if(j > k) {
				System.out.println("i와 j는 k보다 큽니다.");
			}else {
				System.out.println("k는 i보다 작지만 j보다 큽니다.");
			}
		}else {
			System.out.println("i는 k보다 작거나 같습니다.");
		}
		
		
	}

}
