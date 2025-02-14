package Hashing;
import java.util.HashMap;


public class HashMapEx {

	public static void main(String[] args) {
		//Creating HasMap
		HashMap<String,Integer> peopleAge=new HashMap<>();
		//Adding values
		peopleAge.put("Ben",11);
		peopleAge.put("Ana",24);
		peopleAge.put("John",50);
		peopleAge.put("Ela",32);
		peopleAge.put("Heer",11);
		//Printing all the values
		System.out.println(peopleAge);	
		//Accessing value using key
		System.out.println(peopleAge.get("Ana"));
		
		//Checking if key exists
		System.out.println(peopleAge.containsKey("Ela"));
		
		//Removing key
		peopleAge.remove("Ben");
		System.out.println(peopleAge);
		
		//Iterating over a HashMap
		for(String key:peopleAge.keySet()) {
			System.out.println(key+"->"+peopleAge.get(key));
		}
	}
}
