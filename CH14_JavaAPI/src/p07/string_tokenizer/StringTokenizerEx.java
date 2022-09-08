package p07.string_tokenizer;

import java.util.StringTokenizer;

/*
	nextToken() : 메모리에서 해당 데이터를 제거하고 읽어오는 메소드
	 -> Oracle 등 table에서 데이터를 읽어오거나 java collection 등 framework에서도 사용
*/

public class StringTokenizerEx {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();		// token으로 나누어진 전체 개수
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();	
			System.out.println(token);
		}
		
		System.out.println();
		
		/*
		 	위의 for루프에서 nextToken() 실행 하면서, 메모리에 있는 데이터를 제거하고 token들을 
		 	읽었기 때문에 새로 while 루프를 돌기 위해서는 st = new StringTokenizer(text, "/");를
		 	다시 선언해 주어야 한다.
		*/
		
		st = new StringTokenizer(text, "/");		// while 루프 돌기 전에 선언해주어야 함.
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}

}
