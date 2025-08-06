package in.mindcraft;

 abstract class Employee
{
	public int id;
	public String name;
	public double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public abstract double calculateBonus();
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
class FullTimeEmployee extends Employee
{
	public double annualBonus;

	public FullTimeEmployee(int id, String name, double salary, double annualBonus) {
		super(id, name, salary);
		this.annualBonus = annualBonus;
	}
	 public double calculateBonus()
	{
		return annualBonus;
	}
	
}
class PartTimeEmployee extends Employee
{
	public int hoursWorked;

	public PartTimeEmployee(int id, String name, double salary, int hoursWorked) {
		super(id, name, salary);
		this.hoursWorked = hoursWorked;
	}
	public double calculateBonus()
	{
		return hoursWorked * 100;
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee f1 = new FullTimeEmployee(101, "Ansh", 40000.66, 10);
		System.out.println(f1.calculateBonus());
		
		System.out.println("-------------------------------");
		
		PartTimeEmployee p1 = new PartTimeEmployee(102, "Deepak", 35000.86, 6);
		System.out.println(p1.calculateBonus());
	}
}

