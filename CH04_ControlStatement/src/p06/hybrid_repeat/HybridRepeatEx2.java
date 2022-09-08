package p06.hybrid_repeat;

/*
	while문 안에 for문이 있는 경우
*/

public class HybridRepeatEx2 {

	public static void main(String[] args) {
		int i = 0;
		
		while(i<5) {
			for(int j=i; j>1; j--) {
				System.out.print(j + " ");
			}
			System.out.println("***************");
			i++;
		}
	}

}
