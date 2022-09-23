package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Details {

	public static List<Student> getStudentDetails(String cname, List<Student> student, HashMap<String,ArrayList<Integer>> studentCourse, HashMap<Integer, Student> map2) {
		
		List<Student> res = new ArrayList<>();
		
		ArrayList<Integer> st = studentCourse.get(cname);
		
		for(int i:st) {
			res.add(map2.get(i));
		}
		
		
		Collections.sort(res);
		return res;
	}

}
