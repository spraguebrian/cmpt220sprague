import java.util.Scanner;

public class PentagonalN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer to find its pentagonal value, use a number from 1-50: ");
		double num = input.nextDouble();
		System.out.println(pentagonal(num));

	}
	public static double pentagonal(double n) {
		double value = 0;
		int count = 0;
		double userValue = 0;
		for(int i = 1; i < 51; i++) {
			value = 3 * Math.pow(i, 2);
			value = value - i;
			value = value / 2.0;
			System.out.print(value + " ");
			count++;
			if(count == 10) {
				System.out.println("");
				count = 0;
			}
		}
		userValue = 3 * Math.pow(n,  2);
		userValue = userValue - n;
		userValue = userValue / 2;
		return userValue;
	}

}
