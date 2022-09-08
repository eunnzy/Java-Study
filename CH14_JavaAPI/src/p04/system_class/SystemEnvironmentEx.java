package p04.system_class;

/*
	System.getenv() : PC의 시스템 환경 (system environment)에 설정된 값을
*/
public class SystemEnvironmentEx {
	
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("Java_HOME : " + javaHome);
	}

}
