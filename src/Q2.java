import java.util.Scanner;

public class Q2 {
	public static double pNorm(double p, double vector[]) {
		double result = 0;
		double normR = 0;
		double constant = 1 / p;
		for (int i = 0; i < vector.length; i++) {
			result += Math.pow(vector[i], p);

		}
		normR = Math.pow(result, constant);
		return normR;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double p = scan.nextDouble();
		int l = scan.nextInt();
		double array[] = new double[l];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println(pNorm(p, array));

	}

}
