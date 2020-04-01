package myCollections_Advanced;

/**
 * 
 * @author Robin
 *
 */

public class LinearSearch {

	int searchElementLinear(int numList[], int toSearch) {
		int foundIndex = 0;
		for (int i = 0; i < numList.length; i++) {

			if (numList[i] == toSearch) {
				foundIndex = i;
			}
		}
		return foundIndex;
	}
}


