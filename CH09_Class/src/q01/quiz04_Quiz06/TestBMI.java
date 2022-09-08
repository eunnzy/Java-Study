package q01.quiz04_Quiz06;

public class TestBMI {

	public static void main(String[] args) {
		BMI bmi1 = new BMI("홍길동", 68, 1.75);
		System.out.println(bmi1.getName() + "의 BMI : " + bmi1.getBMI() +", 결과 : " + bmi1.getSatus());
		
		BMI bmi2 = new BMI("박명수", 80, 1.7);
		System.out.println(bmi2.getName() + "의 BMI : " + bmi2.getBMI() +", 결과 : " + bmi2.getSatus());
	}

}
