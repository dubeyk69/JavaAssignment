package Assignment2;
import java.util.*;


public class Component {
		
	public static void main(String[] args) throws InvalidSalaryException {
		String name;
		String gender;
		int sal;
		Candidate can;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Candidate details");
		System.out.println("Enter Candidate Name");
		name = sc.next();
		System.out.println("Enter Candidate gender");
		gender = sc.next();
		System.out.println("Enter Candidate salary");
		sal = sc.nextInt();
		
		if(sal < 10000) {
			throw new InvalidSalaryException("Salary cannot be less than 10000");
		}
		else {
			can = new Candidate(name,gender,sal);
		}
	
		System.out.println(can);
		
	}
}

class InvalidSalaryException extends Exception{
	public InvalidSalaryException(String s) {
		super(s);
	}
}
