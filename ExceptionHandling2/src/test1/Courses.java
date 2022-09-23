package test1;

public class Courses {
	String name;
	int duration;
	int cost;
	int id;
	
	
	public Courses(int id,String name, int duration, int cost) {
		super();
		this.id =id;
		this.name = name;
		this.duration = duration;
		this.cost = cost;
	}
	
	
	@Override
	public String toString() {
		return "Courses [name=" + name + ", duration=" + duration + ", cost=" + cost + "]";
	}
	
	
	
}
