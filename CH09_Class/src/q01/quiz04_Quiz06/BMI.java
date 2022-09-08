package q01.quiz04_Quiz06;

public class BMI {
	private String name;
	private int age;
	private double weight;
	private double height;
	
	
	public BMI(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public double getBMI() {
		return this.weight / (this.height * this.height);
	}
	
	public String getSatus() {
		if(this.getBMI() < 18.5) {
			return "저체중입니다.";
		}else if((this.getBMI() >= 18.5) && (this.getBMI() < 25)) {
			return "정상 체중입니다.";
		}else if((this.getBMI() >= 25) && (this.getBMI() < 30)) {
			return "과체중입니다.";
		}else {
			return "비만입니다.";
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}
	
	
}
