package p02.runtime_exception;

/*
  	NullPointerException
   	 - String 타입의 인스턴스가 null일 경우, null 객체의 .를 사용하여 method 사용할 경우에 발생하는 에러.
   	 - ex) null인 data(String type) => data.toString() 사용하면 NullPointerException 발생.
 */
public class NullPointerExceptionEx {

	public static void main(String[] args) {
		String data = null;
		
		/*
			println method에서 parameter로 넘어오는 String instance가 null이면, null로 출력
		 */
		try {
			System.out.println(data);
			System.out.println(data.toString());	
		}catch (NullPointerException e) {
			System.out.println("NullPointerException error 발생.");
		}
 	}

}
