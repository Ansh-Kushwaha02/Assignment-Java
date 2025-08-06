class Person
{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void displayInfo()
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
	}
}
class Student extends Person
{
	int studentId;

	public Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	void displayStudentInfo()
	{
		System.out.println("Student id is: "+studentId);
	}
}
class GraduateStudent extends Student
{
	String thisisTitle;
	String advisorName;
	
	public GraduateStudent(String name, int age, int studentId, String thisisTitle, String advisorName) {
		super(name, age, studentId);
		this.thisisTitle = thisisTitle;
		this.advisorName = advisorName;
	}
	void displayThesisInfo()
	{
		System.out.println("This is Title: "+thisisTitle);
		System.out.println("Advisor Name: "+advisorName);
	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraduateStudent g1 = new GraduateStudent("Ansh", 24, 101, "Java", "abc");
		g1.displayInfo();
		g1.displayStudentInfo();
		g1.displayThesisInfo();

	}

}
