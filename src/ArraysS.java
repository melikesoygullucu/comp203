import java.util.Arrays;
import java.util.Random;

public class ArraysS {

	/** Program showing some array uses. */

	public static void main(String[] args) {

		int data[] = new int[4096];
		Random rand = new Random(); // a pseudo-random number generator
		rand.setSeed(System.currentTimeMillis()); // use current time as a seed

		// fill the data array with pseudo-random numbers from 0 to 99, inclusive
		for (int i = 0; i < data.length; i++)
			data[i] = rand.nextInt(100); // the next pseudo-random number
		int[] orig = Arrays.copyOf(data, data.length); // make a copy of the data array

		long startTime = System.nanoTime();
		Arrays.sort(data); // sorting the data array (orig is unchanged)
		long endTime = System.nanoTime();
		long elapsed = endTime - startTime;

		System.out.println("orig = " + Arrays.toString(orig));
		System.out.println("data = " + Arrays.toString(data));
		System.out.println("elapsed time = " + elapsed);
	}
}
