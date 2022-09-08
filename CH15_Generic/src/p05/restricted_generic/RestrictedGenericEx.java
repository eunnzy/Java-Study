package p05.restricted_generic;

import java.util.Arrays;

/*
	<?>, <? extends> <? super> : method의 parameter나 return type에서만 사용 가능
*/

public class RestrictedGenericEx {

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		System.out.println(personCourse.a);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
//		workerCourse.add(new Person("일반인"));
		workerCourse.add(new Worker("직장인"));
//		workerCourse.add(new Student("학생"));
//		workerCourse.add(new HighStudent("고등학생"));
		
		Course<Student> studentCourse = new Course<Student>("직장인과정", 5);
//		studentCourse.add(new Person("일반인"));
//		studentCourse.add(new Worker("직장인"));
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("직장인과정", 5);
//		highStudentCourse.add(new Person("일반인"));
//		highStudentCourse.add(new Worker("직장인"));
//		highStudentCourse.add(new Student("학생"));
		highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highStudentCourse);
		
	}

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}

}
