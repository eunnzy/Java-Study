package q01.quiz04_Quiz05;

public class Fan {
	static final int SLOW = 1;
	static final int MEDIUM = 2;
	static final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	public Fan() {		// default Constructor 와 field의 초기값
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSLOW() {
		return SLOW;
	}

	public int getMEDIUM() {
		return MEDIUM;
	}

	public int getFAST() {
		return FAST;
	}
	
	public void printFanInformation() {
		if(on == true) {
			System.out.println("speed : " + this.speed +", radius : " + this.radius + ", color : " + this.color);
		}else {
			System.out.println("선풍기가 꺼져있습니다.");
		}
	}
}
