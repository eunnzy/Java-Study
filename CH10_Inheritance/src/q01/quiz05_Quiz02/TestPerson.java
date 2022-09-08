package q01.quiz05_Quiz02;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person("홍길동", "서울시", "010-1111-1111", "hong@gmail.com");
		System.out.println("Person의 전체정보 : " + p.toString());
		System.out.println("Person의 name : " + p.getName());
		System.out.println("Person의 address : " + p.getAddress());
		System.out.println("Person의 phoneNo : " + p.getPhoneNo());
		System.out.println("Person의 email : " + p.getEmail());
		System.out.println();
		
		Student s = new Student("김길동", "경기도", "010-1111-2222", "kim@gmail.com", Student.SOPHOMORE);
		System.out.println("Student의 전체정보 : " + s.toString());
		System.out.println("Student의 name : " + s.getName());
		System.out.println("Student의 address : " + s.getAddress());
		System.out.println("Student의 phoneNo : " + s.getPhoneNo());
		System.out.println("Student의 email : " + s.getEmail());
		System.out.println("Student의 status : " + s.getStatus());
		System.out.println();
		
		Employee e = new Employee("이사원", "강원도", "010-1111-3333", "lee@gmail.com", 201, 300);
		System.out.println("Employee의 전체정보 : " + e.toString());
		System.out.println("Employee의 name : " + e.getName());
		System.out.println("Employee의 address : " + e.getAddress());
		System.out.println("Employee의 phoneNo : " + e.getPhoneNo());
		System.out.println("Employee의 email : " + e.getEmail());
		System.out.println("Employee의 office : " + e.getOffice());
		System.out.println("Employee의 office : " + e.getSalary());
		System.out.println();

		
		Faculty f = new Faculty("이순신", "광주", "010-2222-3333", "soon@gmail.com", 302, 600, "8시간", "professor");
		System.out.println("Faculty의 전체정보 : " + f.toString());
		System.out.println("Faculty의 name : " + f.getName());
		System.out.println("Faculty의 address : " + f.getAddress());
		System.out.println("Faculty의 phoneNo : " + f.getPhoneNo());
		System.out.println("Faculty의 email : " + f.getEmail());
		System.out.println("Faculty의 office : " + f.getOffice());
		System.out.println("Faculty의 office : " + f.getSalary() +"만원");
		System.out.println("Faculty의 officeHours : " + f.getOfficeHours());
		System.out.println("Faculty의 rank : " + f.getRank());
		System.out.println();
		
		
		Staff staff = new Staff("강스탭", "서울", "010-1234-1234", "kang@gmail.com", 302, 100, "staff");
		System.out.println("Staff의 전체정보 : " + staff.toString());
		System.out.println("Staff의 name : " + staff.getName());
		System.out.println("Staff의 address : " + staff.getAddress());
		System.out.println("Staff의 phoneNo : " + staff.getPhoneNo());
		System.out.println("Staff의 email : " + staff.getEmail());
		System.out.println("Staff의 office : " + staff.getOffice());
		System.out.println("Staff의 salary : " + staff.getSalary() +"만원");
		System.out.println();
		

	}

}
