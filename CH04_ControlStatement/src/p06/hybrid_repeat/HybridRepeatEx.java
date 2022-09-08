package p06.hybrid_repeat;

public class HybridRepeatEx {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			int j=0;
			while(j < i) {
				System.out.print(j + " ");
				j++;
			}
			// print + ln(line, enter key) -> 줄바꿈.
			System.out.println();
		}
	}

}
