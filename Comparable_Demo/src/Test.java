import java.util.*;

class Student implements Comparable<Student>
{
	private int roll_no;
	private String name;
	private double percentage;
	
	public Student(int roll_no, String name, double percentage) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.percentage = percentage;
	}

	public double getPercentage()
	{
		return percentage;
	}
	
	public void display()
	{
		System.out.println("Roll no: "+roll_no +"Name: "+name +" "+"Percentage: "+percentage);
	}
	
	public int compareTo(Student other)
	{
		return Double.compare(this.percentage, other.percentage);
	}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> s = new ArrayList<>();
		s.add(new Student(101, "Ansh", 98.97));
		s.add(new Student(102, "Rahul", 89.67));
		s.add(new Student(103, "Kamal", 85.44));
		
		Collections.sort(s);
		
		for(Student s1: s)
		{
			s1.display();
		}

	}

}
