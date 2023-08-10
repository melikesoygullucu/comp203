import java.util.Scanner;

public class AllBaseTypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer number : ");
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.print("Invalid integer number! Please enter an integer number: ");
		}
		int i = scan.nextInt();
		scan.nextLine();

		System.out.println("Please enter a double number : ");

		while (!scan.hasNextDouble()) {
			if (!scan.hasNextDouble()) {
				scan.nextLine();
				System.out.print("Invalid double number! Please enter a double number: ");
			}
		}
		double d = scan.nextDouble();
		scan.nextLine();

		System.out.println("Please enter a Boolean value : ");
		while (!scan.hasNextBoolean()) {
			scan.nextLine();
			System.out.print("Invalid boolean value! Please enter a boolean value : ");
		}
		boolean b = scan.nextBoolean();
		scan.nextLine();

		System.out.println("Please enter a line of text : ");
		while (!scan.hasNextLine()) {
			scan.nextLine();
			System.out.print("Invalid line of text! Please enter a line of text: ");
		}
		String t = scan.next();
		scan.nextLine();

		System.out.println("Please enter a word : ");
		while (!scan.hasNext()) {
			scan.nextLine();
			System.out.print("Invalid integer! Please enter an integer number: ");
		}
		String w = scan.next();
		scan.nextLine();

		System.out.println("Please enter a float number : ");
		while (!scan.hasNextFloat()) {
			scan.nextLine();
			System.out.print("Invalid float number! Please enter a float number: ");

		}
		float f = scan.nextFloat();
		scan.nextLine();

		System.out.println("Please enter a short number : ");
		while (!scan.hasNextShort()) {
			scan.nextLine();
			System.out.print("Invalid short number! Please enter a short number: ");

		}
		short s = scan.nextShort();
		scan.nextLine();

		System.out.println("Please enter a long number : ");
		while (!scan.hasNextLong()) {
			scan.nextLine();
			System.out.print("Invalid long number! Please enter a long number: ");
		}
		long l = scan.nextLong();
		scan.nextLine();
	}
}
