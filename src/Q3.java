import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of the array : ");
		int n = scan.nextInt();
		float array[] = new float[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i + 1) + ". element of the array. ");
			array[i] = scan.nextFloat();
		}
		Arrays.sort(array);
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				System.out.println("There are same numbers in this array. ");
				break;
			} else {
				System.out.println("Numbers are distinct. ");
				scan.nextLine();
			}
			scan.nextLine();
		}

	}

}
