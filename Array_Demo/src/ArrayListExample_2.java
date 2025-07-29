import java.util.List;
import java.util.*;

public class ArrayListExample_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("Tomato");
		arrayList.add("Potato");
		arrayList.add("chilli");
		arrayList.add("cabbage");
		
		//Accessing the element by index
		System.out.println("element at index 2: "+arrayList.get(2));
		
		for(String veg:arrayList)
		{
			System.out.println(veg);
		}
		
//		// Iterating the list using Iterator
//		Iterator<String> i =  arrayList.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(arrayList.contains(i));
//		}

	}

}
