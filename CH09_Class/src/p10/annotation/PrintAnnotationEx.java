package p10.annotation;

import java.lang.reflect.Method;

public class PrintAnnotationEx {

	public static void main(String[] args) {
		// Service class에 선언된 method 정보를 갖는 일차원 배열 
		// reflection이라 함. (class에서 존재하는 method 정보를 가져오는 것)
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			// method 위에 @PrintAnnotation이 존재하는지 check
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				System.out.println("[" + method.getName() + "]");
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					method.invoke(new Service());
				}catch(Exception e) {
					System.out.println();
				}
				
			}
		}
		
	}

}
