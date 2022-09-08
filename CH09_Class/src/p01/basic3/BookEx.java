package p01.basic3;

/*
 	다른 class를 사용할 때 주로 class method를 주로 사용하고, field는 사용하지 않는 것이 원칙. 
 	 - 예를 들면, Book class의 title, author field를 직접 사용하는 것 대신에
 	   printBookInformation() 메소드등을 활용하여 사용.
*/
public class BookEx {

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생택쥐베리");
		Book chunHyang = new Book("춘향전");
		
		littlePrince.printBookInformation();
		chunHyang.printBookInformation();
		
		littlePrince.title = "2021년 어린왕자";		//특히, 이처럼 다른 class의 field값을 수정한느 것은 실제로는 거의 없음.
		littlePrince.printBookInformation();
		
	}

}
