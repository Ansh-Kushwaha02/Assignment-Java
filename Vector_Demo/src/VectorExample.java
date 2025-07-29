import java.util.List;
import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vector = new Vector<>();
		
		vector.add("red");
		vector.add("Black");
		vector.add("Green");
		vector.add("Blue");
		
		for(String color:vector)
		{
			System.out.println(color);
		}
		
		//Adding new Element in the list
		vector.add("Navy");
		System.out.println(vector);

	}

}
