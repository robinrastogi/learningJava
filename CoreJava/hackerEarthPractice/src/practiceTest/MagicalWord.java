package practiceTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MagicalWord {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//List inputArrAsASCIINumbers = new ArrayList<>();

		for(int i=0; i<n; i++) {
			int length =  Integer.parseInt(br.readLine());
			String inputString =  br.readLine();
			int inputArrAsASCIINumbers[] = new int[length];
			char outputArr[] = new char[length];

			/*for(int j=0;j<input.length();j++) {
				int asciiVal = input.charAt(j);
				inputArrAsASCIINumbers.add(asciiVal);
			}*/

			for(int j=0;j<length;j++) {
				int asciiVal = inputString.codePointAt(j);// charAt(j);
				inputArrAsASCIINumbers[j] = asciiVal;
			}
//			System.out.println("INPUT:: ");
			for(int a:inputArrAsASCIINumbers) {
//				System.out.print(a);System.out.print("|");
			}


			//List primeNumbers = new ArrayList<>();
			int totalPrime = 0;
			for(int p=0;p<127;p++) {
				if(checkPrime(p) == true) {
					totalPrime++;
				}
			}
//			System.out.println();
//			System.out.println("totalPrime: " + totalPrime);

			int primeNumbersArray[] = new int[totalPrime];
			int r = 0;
			for(int q=0;q<127;q++) {
				if(checkPrime(q) == true) {
					primeNumbersArray[r] = q;
					r++;
				}				
			}
//			System.out.println();
//			System.out.println("PRIMES:: ");
			for(int b:primeNumbersArray) {
//				System.out.print(b);System.out.print("|");
			}			

			int minDiff = 0;


			int diff = 0;
			int index = 0;

			for(int g=0;g<inputArrAsASCIINumbers.length;g++) {

				minDiff = Math.abs(inputArrAsASCIINumbers[g] - primeNumbersArray[0]);

				for(int h=0;h<primeNumbersArray.length;h++) {

					diff = Math.abs(inputArrAsASCIINumbers[g] - primeNumbersArray[h]);
					if(diff < minDiff) {
						minDiff = diff;

						index = h;


					}

				}

				outputArr[g] = (char)primeNumbersArray[index];
			}

//			System.out.println();
//			System.out.println("OUTPUT:: ");
			for(char c:outputArr) {
//				System.out.print(c);System.out.print("|");
			}
			StringBuilder s = new StringBuilder();
			s.append(outputArr);
			System.out.println(s);

		}

	}

	static boolean checkPrime(int n) {
		//System.out.println("number received:: " + n);

		int flag = 0;
		int sqrt = (int) Math.sqrt(n);

		if(n==0 || n==1) {
			flag = 1;
		}

		for(int i=2; i<sqrt; i++) {
			if(n%i == 0) {
				flag = 1;
				break;
			}
		}

		if(flag == 0) {
			return true;
		} else {
			return false;
		}
		
	}

}
