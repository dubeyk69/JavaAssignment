package assignmentCollection;

public class Student {
	String name;
	String college;
	int rollNo;
	public Student(String name, String college, int rollNo) {
		super();
		this.name = name;
		this.college = college;
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", college=" + college + ", rollNo=" + rollNo + "]";
	}
	
}
