package testInterface;

/**
 * @author Robin
 * To find which bit is '1' we AND (multiply) with numbers from 0 to 2^n, and each time (i.e. 001, 010, 100)
 * it will provide the bit which is 1 in the numbers and is kept as the index to be passed to the array
 * and displayed.
 * 0 0 0 * (0 0 1, 0 1 0, 1 0 0) = (0 0 0, 0 0 0, 0 0 0) => { }
 * 0 0 1 * (0 0 1, 0 1 0, 1 0 0) = (0 0 1, 0 0 0, 0 0 0) => { a }
 * 0 1 0 * (0 0 1, 0 1 0, 1 0 0) = (0 0 0, 0 1 0, 0 0 0) => { b }
 * 0 1 1 * (0 0 1, 0 1 0, 1 0 0) = (0 0 1, 0 1 0, 0 0 0) => { a, b }
 * 1 0 0 * (0 0 1, 0 1 0, 1 0 0) = (0 0 0, 0 0 0, 1 0 0) => { c }
 * 1 0 1 * (0 0 1, 0 1 0, 1 0 0) = (0 0 1, 0 0 0, 1 0 0) => { a, c}
 * 1 1 0 * (0 0 1, 0 1 0, 1 0 0) = (0 0 0, 0 1 0, 1 0 0) => { b, c}
 * 1 1 1 * (0 0 1, 0 1 0, 1 0 0) = (0 0 1, 0 1 0, 1 0 0) => { a, b, c}
 * 
 */
public class SubsetsOfArray {
	// Print all subsets of given set[]
	static void printSubsets(char set[]) {
		
		int n = set.length;
		int m = n;
		System.out.println("Signed left shift of: " + m + " is: " + (1<<m));

		// Run a loop for printing all 2^n
		// subsets one by one
		for (int i = 0; i < (1<<n); i++)
		{
			System.out.print("{ ");

			// Print current subset
			for (int j = 0; j < n; j++) {

				// (1<<j) is a number with jth bit 1
				// so when we 'and' them with the
				// subset number we get which numbers
				// are present in the subset and which
				// are not
				int k = (i & (1 << j));
				if (k > 0) {
					System.out.print(set[j] + " ");
				}
			}
			System.out.println("}");
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		char set[] = {'a', 'b', 'c'};
		printSubsets(set);
	}
}
