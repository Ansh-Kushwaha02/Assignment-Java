import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee
{
	int empId;
	String empName;
	double Salary;

	public Employee()
	{
		empId = 101;
		empName = "Ansh";
		Salary = 35000;
	}

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + "]";
	}
	
	public void accept() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empId: ");
		empId = sc.nextInt();
		System.out.println("Enter EmpName: ");
		empName = sc.next();
		System.out.println("Enter Salary: ");
		Salary = sc.nextDouble();
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> e1 =  new ArrayList<Employee>();
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Add Employee details: ");
            System.out.println("2. Display Employee details");
            System.out.println("3. Update Employee Details");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            
            switch(choice)
            {
            case 1 :
            	Employee a1 = new Employee();
            	a1.accept();
            	e1.add(a1);
            	break;
            	
            case 2 :
            	System.out.println("Employee Details are");
            	for(int i =0; i<e1.size(); i++)
            	{
            		System.out.println(e1.get(i).empId+" "+e1.get(i).empName+" "+e1.get(i).Salary);
            	}
            	System.out.println(" ");
            	break;
            	
            case 3 :
            	System.out.println("Enter EmpId to Upadate");
            	int uempId = sc.nextInt();
            	boolean found = false;
            	for(int i=0; i<= e1.get(i).empId; i++)
            	{
            		if(uempId == e1.get(i).empId)
            		{
            			System.out.println("Enter that you want to update");
            			System.out.println("1.Salary");
            			System.out.println("2 Name");
            			System.out.println("3 Both");
            			int uchoice = sc.nextInt();
            			
            			if(uchoice == 1)
            			{
            				System.out.println("Enter salary to update");
            				double usalary = sc.nextDouble();
            				e1.get(i).Salary = usalary;
            				System.out.println("Salary updated");
            			}
            			
            			else if (uchoice == 2)
            			{
            				System.out.println("Enter name to update");
            				String uname = sc.next();
            				e1.get(i).empName = uname;
            				System.out.println("Name Updated");
						}
            			else if(uchoice == 3)
            			{
            				System.out.println("Enter salary to update");
            				double usalary = sc.nextDouble();
            				e1.get(i).Salary = usalary;
            				System.out.println("Salary updated");
            				
            				
            				System.out.println("Enter name to update");
            				String uname = sc.next();
            				e1.get(i).empName = uname;
            				System.out.println("Name Updated");
            		
            			}
            			else
            			{
            				System.out.println("You have Entered Choice! ");
            			}
            			
            		
            			break;
            		}
            		if (!found)
            		{
            	        System.out.println("Employee ID not found.");
            	    }
            	    break;
            	}
            case 4:
            	System.out.println("Exit");
            }
            
		}

	}

}
