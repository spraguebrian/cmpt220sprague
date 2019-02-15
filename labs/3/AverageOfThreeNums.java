import java.util.Scanner;
public class AverageOfThreeNums {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first double: ");
		double num1 = input.nextDouble();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the second double: ");
		double num2 = input.nextDouble();
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter the thrid double: ");
		double num3 = input.nextDouble();
		System.out.println(average(num1, num2, num3));
	}
	public static double average(double a, double b, double c) {
		double sum = a + b + c;
		double average = sum / 3.0;
		return average;
	}

}
