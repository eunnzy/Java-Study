package p01.basic3;

/*
	1. class의 field 초기값 설정은 주로 Constructor(생성자)를 이용.
	  - field를 직접 초기화하 할 수도 있지만, 신중하게 고려해야 함.
 	2. class내에서 선언된 field들은 Constructor나 method에서 직접 사용 가능.
 	  - new Book을 사용하여 인스턴스 만들어서 사용할 필요는 없음.
*/
public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t;
		author = "작가미상";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public void printBookInformation() {
		System.out.println("책제목 : " + title + ", 책작가 :" + author);
	}
	
}
