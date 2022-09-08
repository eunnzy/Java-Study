package p01.basic;

/*
	Professor class는 Researcher의 자식 class이고, Person의 손자 class
	 - Professor는 Researcher, Person class의 field, method 모두 사용 가능
*/
public class Professor extends Researcher {
	
	void teach() {
		System.out.println(name + "는 가르칩니다.");
	}
}
