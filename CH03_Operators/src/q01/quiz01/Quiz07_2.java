package q01.quiz01;

public class Quiz07_2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); 
				// x -> 전위 연산 11, y 후위연산 : 20
		System.out.println(z);
		// 31
	}

}
