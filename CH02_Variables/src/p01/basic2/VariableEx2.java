package p01.basic2;

/*
	<변수이름, class 이름 작명(naming) 규칙(rule)>
	1. 변수이름 naming
	   - 영문, 언더바(_), 달러($)가 포함되는 것은 가능. ('_'와 '$'로 변수이름을 찾는 경우는 주로 SW 제품만의 프로그램에서 사용)
	   - 변수이름 처음에 숫자가 나오면 안 됨. (중간이나 맨 뒤에는 가능) 
	   - 변수이름은 소문자로 시작하는 것이 관행
	   - 변수이름이 여러개의 단어로 구성되면, 두번째 단어부터는 단어의 첫글자는 대문자로 표현하는 것이 관행.
	      ex) interestRate(이자율), salesList(판매내역), ... 등  --> camel notation이라고 함(낙타 표기법)
	   - 변수이름을 naming 할 때, 영어로만 작명하고, 여러개의 단어를 camel notation 사용할 것
	
	2. class 이름
	   - 변수이름과 동일하지만 차이점이 있음.
	   - 첫글자가 대문자로 시작해야 함.

 	3. 변수 사용 방법
 	   - 변수 선언 -> 변수 타입(메모리 방 크기, 데이터 성격: int, double, String,  ...) + 변수이름
 	   - 변수 선언할 때 초기값을 줄 수 있음. ex) int a = 5;
 	   - 변수 사용은 선언된 변수에 할당된 메모리에 새로운 값으로 변경하거나 읽어 오는 경우
	
	**실제 회사에서 업무를 수행할 때, 가급적 변수 선언하면서 초기값 주는 것이 가능하다면 초기값을 주는 것을 추천.
 */

public class VariableEx2 {
	
	public static void main(String[] args) {
		// 변수 선언.
		int count;
		double interestRate;
		double $radius;
		double _radius;
		//		double 1radius;   // 변수 선언시 첫번째 문자는 숫자가 될 수 없음.
		
		int junior = 15;  
		int adult = junior + 5;
		/*
		  	기계어 명령어로는
		  	1. junior 변수의 메모리에 있는 값 15를 읽어오라
		  	2. 15 + 5 의 덧셈 연산 수행
		  	3. adult 변수의 메모리의 값에 덧셈 연산 결과를 넣어줌.
		 */
		

		System.out.println("junior: " + junior);
		System.out.println("adult: " + adult);
	
		// 변수 사용
		count = 10;
		System.out.println("count: " + count);  // count에 저장된 값을 읽어서 출력
	}

}
