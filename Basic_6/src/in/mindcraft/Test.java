package in.mindcraft;
class Student
{
	private int roll_no;
	private String name;
	private double percentage;
	
	public static int count;

	public Student(int roll_no, String name, double percentage) {
		this.roll_no = roll_no;
		this.name = name;
		this.percentage = percentage;
		count++;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	public static int getCount() {
		return count;
	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"Ansh",56.45);
		Student s2 = new Student(2, "Rahul", 90);
		
		System.out.println("Student object Count:"+Student.getCount());
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
