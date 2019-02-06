import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String first = input.next();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the second string: ");
		String second = input2.next();
		if(first.compareTo(second)<0) {
			System.out.println(first + ", " + second);
		}
		else if(first.compareTo(second)==0) {
			System.out.println("The strings are the same.");
		}
		else {
			System.out.println(second + ", " + first);
		}

	}

}
