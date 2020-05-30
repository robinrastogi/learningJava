package practiceTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Robin
 * This program is to encrypt(cipher) the message using basic encryption technique. 
 * A decoding key 'K' (number) would be sent secretly.
 * You are assigned to develop a cipher program to encrypt the message. 
 * Your cipher must rotate every character in the message by a fixed number making it unreadable by enemies.
 * Given a single line of string 'S' containing alpha, numeric and symbols, 
 * followed by a number '0<=N<=1000'. Encrypt and print the resulting string.
 * Note: The cipher only encrypts Alpha and Numeric. (A-Z, a-z, and 0-9). 
 * All Symbols, such as - , ; %, remain unencrypted.
 * --
 * SAMPLE INPUT:
 * 
 * All-convoYs-9-be:Alert1.
 * 4
 * --
 * SAMPLE OUTPUT
 * 
 * Epp-gsrzsCw-3-fi:Epivx5

 */
public class Cipher {

	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int k = Integer.parseInt(br.readLine());
		
		System.out.println("input: " + s + " | " + "key: " + k);
		
		// changed string  
        String newS = ""; 
  
        // iterate for every characters  
        for (int i = 0; i < s.length(); ++i) { 
            // ASCII value  
            int val = s.charAt(i);
            int dup = 0;            
            
            if(val >= 48 && val <= 57) {
            	// store the duplicate  
                dup = k; 
      
                // if k-th ahead character exceed 'z'
                if (val + k > 57) { 
                    //k = k - (122 - val);
                    k = val + k - 57; //or write like this
                    
                    k = k % 10; 
                      
                    //newS = newS + (char)(96 + k);
                    //modifying above changes as for upper and lower cases::
                    newS = newS + (char)(47 + k); 
                } else { 
                    newS = newS + (char)(val + k); 
                }
                
                k = dup;
                
            } else if(val >= 65 && val <=90) {

            	// store the duplicate  
                dup = k; 
      
                // if k-th ahead character exceed 'z'
                if (val + k > 90) { 
                    //k = k - (122 - val);
                    k = val + k - 90; //or write like this
                    
                    k = k % 26; 
                      
                    //newS = newS + (char)(96 + k);
                    //modifying above changes as for upper and lower cases::
                    newS = newS + (char)(64 + k); 
                } else { 
                    newS = newS + (char)(val + k); 
                }
                
                k = dup;
                
            
            } else if(val >= 97 && val <= 122) {

            	// store the duplicate  
                dup = k; 
      
                // if k-th ahead character exceed 'z'
                if (val + k > 122) { 
                    //k = k - (122 - val);
                    k = val + k - 122; //or write like this
                    
                    k = k % 26; 
                      
                    //newS = newS + (char)(96 + k);
                    //modifying above changes as for upper and lower cases::
                    newS = newS + (char)(96 + k); 
                } else { 
                    newS = newS + (char)(val + k); 
                }
                
                k = dup;
                
            
            }
            else {
            	newS = newS + (char)(val);
            } 
        } 
  
        // print the new string  
        System.out.println(newS); 
	}

}
