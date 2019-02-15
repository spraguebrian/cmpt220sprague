import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String word = input.nextLine();
		System.out.println(performCount(word));
		
	}
	
	public static int performCount(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

}
