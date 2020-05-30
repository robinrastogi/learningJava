package practiceTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringConcat {

public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        
        String inputStr = br.readLine().toString().replace(" ", "");
        System.out.println(inputStr);

    }
}
