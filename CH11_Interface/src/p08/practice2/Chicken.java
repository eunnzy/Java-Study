package p08.practice2;

public class Chicken extends Animal implements Edible{

	@Override
	public String sound() {
		return "꼬꼬댁 꼬꼬";
	}

	@Override
	public String howToEat() {
		return "Fried로 먹음";
	}

}
