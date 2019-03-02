import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of numbers you will enter: ");
		int numberCount = Integer.parseInt(input.nextLine());
		int[] numbers = new int[numberCount];
		System.out.println("Enter your values for the array: ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 1; j < numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					numbers[j] = -1;
				}
			}
		}
		System.out.println("");
		System.out.print("Values of -1 are removed values. The array consists of: " );
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}

	}

}
