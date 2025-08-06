import java.util.*;

class Student
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
		System.out.println("Roll no: "+roll_no +" " + "Name: " + name+" " + "Percentage: " + percentage);
	}
}

class PercentageComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getPercentage(), s2.getPercentage());
    }
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> s = new ArrayList<>();
		s.add(new Student(1,"Ansh",95.70));
		s.add(new Student(2,"Rahul",87.70));
		s.add(new Student(3,"Deepak",90.50));

		
		Collections.sort(s, new PercentageComparator());
		
		for(Student student: s)
		{
			student.display();
		}

	}

}
