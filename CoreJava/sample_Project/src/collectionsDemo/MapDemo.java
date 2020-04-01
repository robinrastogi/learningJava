package collectionsDemo;

import java.util.*;
public class MapDemo{
	public static void main(String[] args){
		Map<String,String> hashMap = new HashMap<String,String>();
		Map<String,String> linkedHashMap = new LinkedHashMap<String,String>();
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();

		hashMap.put("1 ", "krishna");
		hashMap.put("2 ", "suman");
		hashMap.put("3 ","leezu");
		hashMap.put("4 ","sudha");
		System.out.println("HashMap(Inserted as 1, 2, 3, 4):");	// No order
		System.out.println(hashMap+"\n");

		linkedHashMap.put("1 ", "krishna");
		linkedHashMap.put("4 ", "suman");
		linkedHashMap.put("2 ","leezu");
		linkedHashMap.put("3 ","sudha");
		System.out.println("Linked HashMap(Inserted as 1, 4, 2, 3):"); // Maintains insertion order
		System.out.println(linkedHashMap+"\n");

		treeMap.put(1, "krishna");
		treeMap.put(4, "suman");
//		treeMap.put(2,"leezu");
		treeMap.put(3,"sudha");
		treeMap.put(2,"leezu");
//		System.out.println("TreeMap(Inserted as 1, 4, 2, 3):");
		System.out.println("TreeMap(Inserted as 1, 4, 3, 2):"); // Sort Values in the map
		System.out.println(treeMap);
	}
}



