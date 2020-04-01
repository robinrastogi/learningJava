package java2novice;

public class MyInsertionSort {
	 
    public static void main(String[] args) {
         
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1, 14 };
        printNumbers(input);
        insertionSort(input);
    }
     
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
//        for (int i :input) {
//            System.out.print(input[i] + ", ");
//        }
//        System.out.println("\n");
    }
    

    public static void insertionSort(int array[]) {
        int n = array.length;
        System.out.print("length of array is "+n+"\n");
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
            printNumbers(array);
        }
    }
}
/*    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
            	System.out.println("array[j+1] is "+array[j+1]);
            	System.out.println("array[i] is "+array[i]);
                array [i+1] = array [i];
                i--;
            }
            System.out.println("array[i+1] is "+array[j+1]);
            array[i+1] = key;
        for (int j=1;j<n;j++) {
        	int k=array[j];
            for (int i=j-1;i>-1;i--) {
            	if (array[i] > k) {
            		array[j]=array[i];
            	}
            }
            array[j]=k;
        }
        printNumbers(array);
    }
}*/