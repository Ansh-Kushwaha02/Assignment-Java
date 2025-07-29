package in.mindcraft;
class Employee{
	String empName = "Ansh";
	int empId = 101;
	double salary = 40000;
	
	void displayInfo()
	{
		System.out.println("empName: "+ empName + " " + "empId: " + empId +" "+ "Salary: " + salary);
	}
	void displayInfoUsingParameter(String empName, int empId, double salary) {
		
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		
		displayInfo();
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.displayInfo();
		
		Employee emp2 = new Employee();
		emp2.displayInfoUsingParameter("Rahul", 201, 45000);

	}

}
