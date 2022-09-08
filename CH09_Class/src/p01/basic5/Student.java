package p01.basic5;

/*
	모든 class들은 최소한 1개의 생성자가 존재해야 함.
	 - 만약에 class에서 생성자 선언한 것이 하나도 없으면, JVM default 생성자를 자동으로 생성해준다.
	  => But, default constructor 외에 다른 constructor가 이미 존재하면, JVM이 default constructor를 자동으로 생성하지 않음.
	     즉, parameter가 있는 생성자가 있으면 default 생성자를 따로 선언해주어야 함.
*/

public class Student {
	String name;
	int age;
	boolean isComputerMajor;
	char gender;
	
	public Student() {	}	// default constructor (parameter가 없는 생성자)

	public Student(String newName) {	
		name = newName;
	}
	
}
