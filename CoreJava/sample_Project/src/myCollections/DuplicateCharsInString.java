package myCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class DuplicateCharsInString {
 
    public void findDuplicateChars(String str) {
         
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
        System.out.println("Map is as "+dupMap);
        char[] chrs = str.toCharArray();
        int duplicacy=0;
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)) {
            	duplicacy=dupMap.get(ch);
            	System.out.println("duplicacy for "+ch+" is "+duplicacy);
            	dupMap.put(ch, duplicacy+1);
//                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+" is coming "+dupMap.get(ch)+" times...");
            }
        }
    }
     
    public static void main(String a[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars("RobinRastogirobinrastogi");
    }
}