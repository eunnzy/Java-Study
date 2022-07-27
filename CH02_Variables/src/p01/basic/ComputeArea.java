package p01.basic;

//원의 면적(area) 계산하기(compute)
public class ComputeArea {

	// 변수 이름 작명(naming)의 최신 trend: 원래 데이터 or 사용목적에 맞게 긴 단어를 사용.
	public static void main(String[] args) {
		double radius;  // radius 변수 이름을 갖는 데이터 저장소 정의 (반지름)
		double area ; 	// area 변수 이름을 갖는 데이터 저장소 정의 (원의 넓이)
		
		// 1. 입력 데이터 읽기 (반지름 읽기)
		radius = 30;
		
		// 2. 원의 면적 계산하기: 입력 데이터를 출력 데이터로 가공
		area = radius * radius * 3.14159;
		
		// 3. 원의 면적을 출력하기 (console 창에 보여주기)
		System.out.println("원의 반지름: " + radius + "인 원의 면적은 " + area +"입니다.");
		
	}

}
