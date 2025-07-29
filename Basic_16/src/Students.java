import java.util.*;

class Student {
	private int roll_no;
	private String name;
	private double percentage;
	private Set<String> skillset;
	
//	public Student()
//	{
//		roll_no = 101;
//		name = "Ansh";
//		percentage = 80.87;
//		skillset = "Java";
//	}

	public Student(int roll_no, String name, double percentage, Set<String> skillset) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.percentage = percentage;
		this.skillset = skillset;
	}
	
	public void display()
	{
		System.out.println(roll_no);
		System.out.println(name);
		System.out.println(percentage);
		System.out.println(skillset);
	}
}
