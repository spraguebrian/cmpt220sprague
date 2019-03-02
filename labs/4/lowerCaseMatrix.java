import java.util.Random;

public class lowerCaseMatrix {

	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int length = alphabet.length();
		Random x = new Random();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(alphabet.charAt(x.nextInt(length)) + " ");
			}
			System.out.println("");
		}

	}

}
