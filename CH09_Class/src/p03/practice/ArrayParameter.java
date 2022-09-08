package p03.practice;

public class ArrayParameter {
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++) 
			if (a[i] == ' ')
				a[i] = ',';
	}

	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		
		System.out.println();
	}
	
	public void dummy() {		
		System.out.println("This is a dummy");
	}
	
	public static void main(String[] args) {
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a',
				    ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.'};

		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		
		ArrayParameter ap = new ArrayParameter();
		// (main method가 static으로 선언되어서 직접 호출 불가능)
		ap.dummy();		// dummy method는 직접 호출 불가능. 
	}

}
