package p07.singleton_usage;

import java.util.Calendar;

public class SingletonEx {

	public static void main(String[] args) {
//		Singleton s = new Singleton();  // error : The constructor Singleton() is not visible
		
		Singleton s = Singleton.getInstance();
		
		s.printSingletonHello();
		
		Singleton s1 = Singleton.getInstance();
		
		if( s == s1 ) {
			System.out.println("같은 힙메모리 주소를 갖고 있음. 즉, 같은 싱글톤 인스턴스임.");
		} else {
			System.out.println("다른 힙메모리 주소를 갖고 있음. 즉, 다른 싱글톤 인스턴스임.");
		}
		
		// Calendar class : 날짜 정보를 제공하는 class
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		
	}

}
