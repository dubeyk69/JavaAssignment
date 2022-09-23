package test1;

import java.util.ArrayList;
import java.util.Comparator;

public class Student implements Comparable {
	String name;
	String gender;
	int enrollmentID;
	ArrayList<Courses> courses;
	String college;
	
	public Student(String name, String gender, int enrollmentID, ArrayList<Courses> courses, String college) {
		super();
		this.name = name;
		this.gender = gender;
		this.enrollmentID = enrollmentID;
		this.courses = courses;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", enrollmentID=" + enrollmentID + ", courses="
				+ courses + ", college=" + college + "]";
	}

	public int compareTo(Student o) {
		
		return this.enrollmentID - o.enrollmentID;
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
	
	
}
