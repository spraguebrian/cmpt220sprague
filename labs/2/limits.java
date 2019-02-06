import java.util.Scanner;

public class limits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lower limit: ");
		int lower = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the upper limit: ");
		int upper = input2.nextInt();
		int value1 = (int)(Math.random()*(upper-lower)) + lower;
		System.out.println(value1);
		int value2 = (int)(Math.random()*(upper-lower)) + lower;
		System.out.println(value2);
		int value3 = (int)(Math.random()*(upper-lower)) + lower;
		System.out.println(value3);

	}

}
