import java.util.ArrayList;
import java.util.List;

public class UtilityList {
	
		private List<Student>list;

	public UtilityList()
	{
		list = new ArrayList<>();
	}

	public void addStudents(Student student) 
	{
		list.add(student);
	}
	public void displayAllStudent()
	{
		for(Student student : list)
			
		{
			student.display();
		}
	}
}
