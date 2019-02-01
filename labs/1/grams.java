import java.util.Scanner;

public class grams {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Eneter an amount of ounces as a double: ");
		double ounces = input.nextDouble();
		double grams = ounces * 28.3495;
		System.out.println(ounces + " ounces is equal to " + grams + " grams.");

	}

}
