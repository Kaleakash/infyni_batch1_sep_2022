package com;
//import com.education.college.Attendance;
public class DemoTest {

	public static void main(String[] args) {
		Student std = new Student();
		std.display();
		com.education.college.Attendance att1 = new com.education.college.Attendance();
		att1.display();
		
		com.education.school.Attedance att2 = new com.education.school.Attedance();
		att2.display();
	}

}
