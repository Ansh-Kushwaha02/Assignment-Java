class Student
{
	 int rollno;
	 String name;
	
	public void diaplayData()
	{
		System.out.println(name + " Play Crickete");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.name= "Ansh";
		std1.diaplayData();
	}

}
