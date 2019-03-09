import java.util.Scanner;
public class MeanAndSD {
	private static double meanValue;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 doubles for the array: ");
		double[] numbers = new double[10];
		for(int i = 0; i < 10; i++) {
			numbers[i] = input.nextDouble();
		}
		mean(numbers);
		deviation(numbers);
	}
	public static double mean(double[] x) {
		double total = 0;
		for(int i = 0; i < 10; i++) {
			total = total + x[i];
		}
		meanValue = total / 10.0;
		System.out.println("The mean is " + meanValue);
		return meanValue;
	}
	public static double deviation(double[] x) {
		double total = 0;
		double temp = 0;
		double newMean = 0;
		double sd = 0;
		for(int i = 0; i < 10; i++) {
			temp = x[i] - meanValue;
			temp = Math.pow(temp, 2);
			total += temp;
		}
		newMean = total / 10.0;
		sd = Math.sqrt(newMean);
		System.out.println("The standard deviation is " + sd);
		return sd;
	}

}
