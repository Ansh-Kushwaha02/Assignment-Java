package in.mindcraft;

//import java.util.Date;

public class Employee {
	private int empId;
	private String empName;
	private Date dob;
	
	public Employee()
	{
		empId = 102;
		empName = "Ansh";
		dob = new Date();
	}
	

	public Employee(int empId, String empName, int dd, int mm,int yy)
	{
		this.empId = empId;
		this.empName = empName;
		dob = new Date(dd,mm,yy);
	}
	public void show() 
	{
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		dob.show();
		
	}

}
