package in.mindcraft;

public class SalesPerson extends WageEmployee {
	
	private int sales;
	private int commission;
	
	public SalesPerson()
	{
		 sales = 5;
		 commission = 50;
	}

	public SalesPerson(int empId, String empName, int dd, int mm, int yy, int hours, int rate, int sales, int commission) {
		super(empId, empName, dd, mm, yy, hours, rate);
		this.sales = sales;
		this.commission = commission;
	}
	
	public int SalesCommission()
	{
		return calSalary() + sales * commission;
	}
	
	public void show()
	{
		System.out.println("Number of Sales: " + sales);
		 System.out.println("Number of Commission: "+commission);
	}
	
	
	

}
