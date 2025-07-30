
public class Employee {
	private int emp_id;
	private String name;
	protected double basicsalary;
	

	public Employee(int emp_id, String name, double basicsalary) {
		this.emp_id = emp_id;
		this.name = name;
		this.basicsalary = basicsalary;
	}
	public void displayData()
	{
		System.out.println("Employee_Id: "+ emp_id);
		System.out.println("Employee Name: "+name);
		System.out.println("Basic Salary: "+basicsalary);
	}
	
	public double calPF()
	{
		return 12.5 * basicsalary / 100 ;
	}
	public double gross_Salary()
	{
		return basicsalary;
	}
	
	public double net_Salary()
	{
		return gross_Salary() - calPF();
	}
}

class Manager extends Employee
{
	private double PetrolA, FoodA, OtherA;

public Manager(int emp_id, String name, double basicsalary)
{
	super(emp_id, name, basicsalary);
	PetrolA = 8 * basicsalary / 100;
	FoodA = 12 * basicsalary / 100;
	OtherA = 4 * basicsalary / 100;
}
public double calGrossSalary()
{
	return  PetrolA + FoodA + OtherA + basicsalary;
}
public double netSalary()
{
	return gross_Salary() - calPF();
}
public void displayData() 
{
	super.displayData();
	System.out.println("Petrol Allowance: " + PetrolA);
	System.out.println("Food Allowance: " + FoodA);
	System.out.println("Othar Allowance: "+ OtherA);
	System.out.println("Tatal Salary of Manager: " + calGrossSalary());
	System.out.println("Toatal Net Salary: " +net_Salary());
	
}
}

class MarketingExecutive extends Employee
{
	double Kilometers_travelled;
	double  Tour_Allowance;
	int Telephone_Allowance = 2000;
	
	public MarketingExecutive(double kilometers_travelled, int emp_id, String name, double basicsalary) {
		super(emp_id , name, basicsalary);
		this.Kilometers_travelled = kilometers_travelled;
		this.Tour_Allowance = 5 * kilometers_travelled;
	}
	public double calGrossSalary() {
        return basicsalary + Tour_Allowance + Telephone_Allowance;
    }
	public double netSalary()
	{
		return calGrossSalary() - calPF();
	}

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Kilometers Traveled: " + Kilometers_travelled);
        System.out.println("Tour Allowance: "+ Tour_Allowance);
        System.out.println("Telephone Allowance: "+ Telephone_Allowance);
        System.out.println("Total Salary: " + calGrossSalary());
        System.out.println("Total Net Slaary: " + net_Salary());
    }
	
	

}
