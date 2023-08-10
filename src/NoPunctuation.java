import java.util.Scanner;

public class NoPunctuation {

	public static StringBuilder removePunctuation(StringBuilder sent) {
		for (int i = 0; i <= sent.length(); i++) {
			if (sent.charAt(i) == '!' || sent.charAt(i) == ':' || sent.charAt(i) == '.' || sent.charAt(i) == ','
					|| sent.charAt(i) == '?' || sent.charAt(i) == ';' || sent.charAt(i) == '"' || sent.charAt(i) == '\'') {
				sent.deleteCharAt(i);
			}
		}
		return sent;
	}

	public static void main(String[] args) {
		StringBuilder sent = new StringBuilder("Let's try, Mike!");
		StringBuilder newSent = new StringBuilder();
		newSent = removePunctuation(sent);
		System.out.println("The new sentence is: " + newSent);
	}

}
