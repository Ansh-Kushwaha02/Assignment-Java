import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Grapes", 1);
		map.put("Cherry", 2);
		map.put("Mango", 3);
		map.put("coconut", 4);
		
		
		//Methods of the Hashmap
		
		System.out.println(map.containsKey("Mango"));
		System.out.println(map.containsValue(3));
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
	}

}
