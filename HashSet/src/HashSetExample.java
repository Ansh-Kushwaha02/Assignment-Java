import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Mango");
		set.add("Cherry");
		set.add("Mango"); //Duplicate is not allowed

//		set.remove("Cherry");
		System.out.println(set);
		
		//Iterating the set element
//		for(String fruits: set)
//		{
//			System.out.println(set);
//		}

	}

}
