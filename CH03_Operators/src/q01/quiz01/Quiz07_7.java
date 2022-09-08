package q01.quiz01;

public class Quiz07_7 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println((x > 7) && (y <= 5));
		/*
			x > 7 -> true, y <= 5 -> true    
			true && ture  = true
		*/
		System.out.println((x%3 == 2) || (y%2 != 1));
		/*
			x % 3 = 1 -> false , y%2 == 1 -> false 
		 	false || false => false
		*/
		
	}

}
