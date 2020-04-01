package java2novice;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//import java.util.Iterator;
import java.util.*;
 
public class DuplicateCharsInString {
 
    public void findDuplicateChars(String str) {
//      Map is defined with key as character type and value as integer type.         
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
//        Map<Character, Integer> dupMap = new TreeMap<Character, Integer>();
        

        System.out.println("Map is as "+dupMap); //displaying map
        char[] chrs = str.toCharArray(); //converting string to array
        int duplicacy=0; //initiating duplicacy variable to 0
//        displaying string
        for(int i=0; i<chrs.length;i++){					//for loop for traversing array
           	System.out.println("String is: "+chrs[i]);
        }
//        for(Character ch:chrs){
//           	System.out.println("String is: "+ch);
//        }
        for(int ch=0; ch<chrs.length;ch++){
            if(dupMap.containsKey(chrs[ch])) {										//checking for the key whether it is there in array or not
            	duplicacy=dupMap.get(chrs[ch]);										//if it is there add that character to key in the map
//            	System.out.println("duplicacy for "+chrs[ch]+" is "+duplicacy);
            	dupMap.put(chrs[ch], duplicacy+1);									//adding/updating the value in the map with the no. of repetitions 
//                dupMap.put(chrs[ch], dupMap.get(ch)+1);
            } else {
                dupMap.put(chrs[ch], 1);											//else updating the value in the map by 1 i.e no repetition
            }
        }
        Set<Character> keys = dupMap.keySet();										//as map does not extends collections interface. converting
        System.out.println("size of set is "+ keys.size());
        for(Character ch:keys){														//map to set to display the values.
            if(dupMap.get(ch) > 1){
                System.out.println(ch+" is coming "+dupMap.get(ch)+" times...");
            }
        }
        
//        //Displaying map using iterator
//        Set<Character> keys2 = dupMap.keySet();
//		Iterator<Character> it=keys2.iterator();
//		System.out.println("All the keys of a map using keySet() method of map are :");
//		while(it.hasNext()) {
//			System.out.println("123hello");
//			if(dupMap.get(it) > 1){
//				System.out.println(it.next()+" is coming "+dupMap.get(it.next())+" times...");
//			}		
//		}
//		//end of displaying using iterator
    }
     
    public static void main(String a[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars("RobinRastogirobinrastogi");
    }
}