package in.mindcraft;
 import java.util.*;

public class Student extends Date {
	
	private static int Roll_Norollcounter = 100;
	private int Roll_no;
	private String S_name;
	private Date dob;
	
	public static int count = 0;

	public Student()
	{
        Roll_no = ++Roll_Norollcounter;
		S_name = "Unknown";
		dob = new Date();
	}
	

	public Student(int roll_No, String s_name, Date dob, int dd, int mm, int yy) 
	{
		super();
		Roll_no = ++Roll_Norollcounter;
		this.S_name = s_name;
		dob = new Date(dd,mm,yy);
		
	}
	
	public void display() 
	{
        Scanner sc = new Scanner(System.in);
        Roll_no = ++Roll_Norollcounter;
        System.out.print("Enter student name: ");
        S_name = sc.nextLine();
        System.out.println("Enter date of birth:");
        dob = new Date(); // create new Date object
		dob.show();

		System.out.println("Roll No: " + Roll_no);
        System.out.println("Name: " + S_name);
        dob.show();
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.display();
		
//		System.out.println("Roll No: ");

	}

}
