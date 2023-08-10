import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		float array[] = new float[l];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextFloat();
		}
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}

			}
			float temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				System.out.println("There are same numbers in this array. ");
				break;
		}

	}
	}
}

