package p11.practice2;

import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;		// 인스턴스가 언제 생성됐는지 시간으로 
	
	public GeometricObject() {
		dateCreated = new Date();		// 현재 시간
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
	
	// 인슨턴스에 저장된 현재 상태의 모든 field 정보를 제공
	@Override
	public String toString() {
		return "dateCreated : " + dateCreated + "\n color : " + color + ", color filled : " + filled;
	}
	
	
}
