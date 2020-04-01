package myCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class DuplicateWordsInString {
//    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
 
        String text = "robin ankit akshay robin ankit akshay akshay sagar";
        
        
        
        String[] arr= text.split(" ");
        Map<String, Integer> map= new HashMap<String, Integer>();
        //List<String> list = new ArrayList<String>();
        for(String s: arr)
        {
        	if(map.containsKey(s))
        	{
        		int i = map.get(s);
        		i++;
        		map.put(s, i);
        	}
        	else
        	{
        		map.put(s, 1);
        	}
        }
        
        System.out.println(map);
 
        //List<String> list = Arrays.asList(text.split(" "));
 
        /*Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));*/
        //}
        
        
        
        
        
        
    }
}