package p04.static_mm_block;

public class Television {
	static String company = "Samsung";
	static String model = "LCD" ;
//	static String info = company + "-" +model;
	static String info;
	int channel;
	
	
	
	// static 초기화 block (class를 JVM이 memory에 최초 올릴 때 실행)
	static {
		info = company + "-" + model;
	}
	
	// instance 초기화 block (new로 인스턴스 생성할 때마다 실행)
	{
		info = company + "-" + model; 	// static도 초기화 가능.
		this.channel = 0;
	}

}
