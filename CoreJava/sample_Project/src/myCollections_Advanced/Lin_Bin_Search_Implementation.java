package myCollections_Advanced;

/**
 * 
 * @author Robin
 *
 */

public class Lin_Bin_Search_Implementation {

	public static void main(String args[]) {

		int numList[] = { 1, 3, 8, 12, 34, 56, 78, 87, 92 }; //already sorted array

//		int numList[] = { 2, 4, 9, 6, 23, 12, 34, 0, 1 }; //unsorted array
//		InsertionSortDemo in_obj = new InsertionSortDemo();
//		in_obj.insertionSort(numList);

		int toSearch = 34;

		LinearSearch linearSearch = new LinearSearch();
		BinarySearch binarySearch = new BinarySearch();

		System.out.println("Linear Search Index : "
				+ linearSearch.searchElementLinear(numList, toSearch));
		System.out.println("Binary Search Index : "
				+ binarySearch.searchElementBinary(numList, toSearch));

	}
}
