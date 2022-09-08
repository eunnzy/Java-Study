package p11.practice;

import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;

	public GeometricObject() {
		this.dateCreated = new Date();	// 현재 시간
	}

	public GeometricObject(String color, boolean filled) {
		this.dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	// 힙 메모리에 저장된 인스턴스 현재 상태의 필드 정보 제공
	@Override
	public String toString() {
		return "dateCreated : " + dateCreated + "\n color : " + color + ", color field : " + filled;
	}

}
