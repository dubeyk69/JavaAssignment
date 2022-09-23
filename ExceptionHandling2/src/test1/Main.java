package test1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		ArrayList<Courses> courses = new ArrayList<>();
		ArrayList<Student> student = new ArrayList<>();
		HashMap<String,Courses> map = new HashMap<>();
		HashMap<String, ArrayList<Integer>> studentCourse = new HashMap<>();
		HashMap<Integer ,Student> map2 = new HashMap<>();
		
		
		System.out.println("Please enter the no. of courses");
		int n = scn.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Please enter the id of course");
			int id = scn.nextInt();
			
			System.out.println("Please enter the name of course");
			String name = scn.next();
			
			System.out.println("Please enter the duration of course");
			int duration = scn.nextInt();
			
			System.out.println("Please enter the cost of course");
			int cost = scn.nextInt();
			
			Courses temp = new Courses(id,name,duration,cost);
			courses.add(temp);
			map.put(name, temp);
		}
		
		System.out.println("Please enter the no. of student");
		n = scn.nextInt();
		
		for(int i=0;i<n;i++) {
			
			String cname;
			String name;
			String gender;
			String college;
			int enrol;
			ArrayList<Courses> course = new ArrayList<>();
			
			
			System.out.println("Please enter the name of student");
			name = scn.next();
			
			System.out.println("Please enter the gender of student");
			gender = scn.next();
			
			System.out.println("Please enter the college of student");
			college = scn.next();
			
			System.out.println("Please enter the enrollment ID of student");
			enrol = scn.nextInt();
			
			
			
			System.out.println("Please enter the number of courses student is enrolled in");
			int k = scn.nextInt();
			for(int j =0;j<k;j++) {
				System.out.print("Please enter the name of course");
				cname = scn.next();
				course.add(map.get(cname));
				
				if(!studentCourse.containsKey(cname)) {
					studentCourse.put(cname, new ArrayList<>());
					studentCourse.get(cname).add(enrol);
				}
				else {
					studentCourse.get(cname).add(enrol);
				}
				
			}	
			
			Student temp = new Student(name,gender,enrol,course,college);
			student.add(temp);
			map2.put(enrol,temp);
		}
		
		
		
		
		//::::::::::::::::::::::::::::::::::::::::::::://
		
		System.out.println("Please enter the name of course you want see the details for");
		String name = scn.next();
		System.out.println(map.get(name).toString());
		
		try {
			System.out.println("Please enter the name of course you want see the students details for");
			String cname = scn.next();
			List<Student> result = Details.getStudentDetails(cname,student,studentCourse,map2);
			
			for(int i =0; i<result.size();i++) {
				Student temp = result.get(i);
				System.out.println(temp);
			}
		}
		catch (NullPointerException e){
			System.out.println("Please enter correct name of course");
			
		}
		
	}

}
