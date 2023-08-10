import java.util.Arrays;
import java.util.Random;

public class InsertionS {

	/** Insertion-sort of an array of characters into nondecreasing order */
	public static void insertionSort(int[] data) {
		int n = data.length;
		for (int k = 1; k < n; k++) { // begin with second character
			int cur = data[k]; // time to insert cur=data[k]
			int j = k; // find correct index j for cur
			while (j > 0 && data[j - 1] > cur) { // thus, data[j-1] must go after cur
				data[j] = data[j - 1]; // slide data[j-1] rightward
				j--; // and consider previous j for cur
			}
			data[j] = cur; // this is the proper place for cur
		}
	}

	public static void main(String[] args) {
		/*
		 * char[] a = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
		 * System.out.println(java.util.Arrays.toString(a)); insertionSort(a);
		 * System.out.println(java.util.Arrays.toString(a));
		 */

		int data[] = new int[256];
		Random rand = new Random(); // a pseudo-random number generator
		// rand.setSeed(System.currentTimeMillis( )); // use current time as a seed
		rand.setSeed(1);

		// fill the data array with pseudo-random numbers from 0 to 99, inclusive
		for (int i = 0; i < data.length; i++)
			data[i] = rand.nextInt(100); // the next pseudo-random number
		int[] orig = Arrays.copyOf(data, data.length); // make a copy of the data array

		insertionSort(data);
		long startTime = System.nanoTime();
		insertionSort(data); // sorting the data array (orig is unchanged)
		long endTime = System.nanoTime();
		long elapsed = endTime - startTime;

		// System.out.println("orig = " + Arrays.toString(orig));
		// System.out.println("data = " + Arrays.toString(data));
		System.out.println("elapsed time = " + elapsed);
	}
}
