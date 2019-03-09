import java.util.Scanner;

public class LargestValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 doubles for the array: ");
		double[] numbers = new double[10];
		for(int i = 0; i < 10; i++) {
			numbers[i] = input.nextDouble();
		}
		max(numbers);
	}
	public static double max(double[] array) {
		double max = 0;
		for(int i = 0; i < 10; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The max value is " + max);
		return max;
	}
	
}
