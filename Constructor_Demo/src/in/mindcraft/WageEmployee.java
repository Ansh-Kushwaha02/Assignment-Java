package in.mindcraft;

public class WageEmployee extends Employee 
{
	private int hours;
	private int rate;
	
	public WageEmployee()
	{
		hours = 8;
		rate = 500;
	}

	public WageEmployee(int empId, String empName, int dd,int mm,int yy, int hours, int rate) {
		super(empId,empName,dd,mm,yy);
		this.hours = hours;
		this.rate = rate;
	}
	public int calSalary()
	{
		return hours*rate;
	}
	public void show() 
	{
	
		super.show();
		System.out.println("Total Work Hours: "+hours);
		System.out.println("Total Rate: "+rate);

	}
	
}
