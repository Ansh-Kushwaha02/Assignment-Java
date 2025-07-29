import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeMap is used to add key-value pair
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Apple",1);
		map.put("Banana", 2);
		map.put("Orange", 3);
		map.put("Mango", 4);
		System.out.println(map.get("Banana"));
//		System.out.println(map.remove("Orange"));
		System.out.println(map.size());
		
		System.out.println(map);

	}

}
