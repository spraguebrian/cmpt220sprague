import java.util.Scanner;

public class energy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a mass in kilograms as a double: ");
		double mass = input.nextDouble();
		double energy = mass * (299972458 * 299972458);
		System.out.println("The energy with a mass of " + mass + " kg is " + energy);

	}

}
