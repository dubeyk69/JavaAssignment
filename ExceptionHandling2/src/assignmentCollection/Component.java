package assignmentCollection;
import java.util.*;

public class Component {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the no. of students");
		int n = scn.nextInt();
//		HashMap<String, ArrayList<Student>> map = new HashMap<>();
		
		ArrayList<Student> details = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			System.out.println("Please enter name of the student");
			String name = scn.next();
			System.out.println("Please enter college name of the student");
			String college = scn.next();
			System.out.println("Please enter roll number of the student");
			int rollNo = scn.nextInt();
			Student obj = new Student(name,college,rollNo);
			details.add(obj);
//			if(map.containsKey(college)) {
//				map.put(college, obj);
//			}
		}
		
		
		System.out.println("Please enter the name of college::");
		String search = scn.next();
		
		for(int i = 0;i<details.size();i++) {
			Student temp = details.get(i);
			if(temp.college.equals(search)) {
				System.out.println(temp);
			}
		}
		

	}

}
