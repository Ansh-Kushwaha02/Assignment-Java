import java.util.List;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Coconut");
		
		System.out.println("Array List Element");
		for(String fruits : arrayList)
		{
			System.out.println(fruits);
		}

	}

}
