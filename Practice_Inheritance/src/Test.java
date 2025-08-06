class Employee
{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void displayinfo()
	{
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee Salary: "+salary);
	}
	
}

class Manager extends Employee
{
	String department;
	
	public Manager(int id, String name, double salary, String department) {
		super(id, name, salary);
		this.department = department;
	}


	public void assignTask()
	{
		System.out.println("Manager Depatment: "+department);
		System.out.println("Conduct a Team meeting ");
	}
}

class Developer extends Employee
{
	String pLanguage;
	
	public Developer(int id, String name, double salary, String pLanguage) {
		super(id, name, salary);
		this.pLanguage = pLanguage;
	}


	void writeCode()
	{
		System.out.println("Programming Language: "+pLanguage);
		System.out.println("Develop a new feature");
	}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager(101, "Ansh", 20000, "Hr");
		Developer d1 = new Developer(102, "Rahul", 40000, "Java");
		
		System.out.println("Manager Info");
		m1.displayinfo();
		m1.assignTask();
		System.out.println();

		System.out.println("Developer Info");
		d1.displayinfo();
		d1.writeCode();
	}

}
