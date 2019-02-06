import java.util.Scanner;

public class chars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first character: ");
		char first = input.next().charAt(0);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the second character: ");
		char second = input.next().charAt(0);
		int firstInt = (int) first;
		int secondInt = (int) second;
		int total = firstInt + secondInt;
		System.out.println("Result is: "+ total);

	}

}
