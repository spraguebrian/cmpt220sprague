import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of numbers you will enter: ");
		int numberCount = Integer.parseInt(input.nextLine());
		int[] numbers = new int[numberCount];
		System.out.println("Enter your values for the array: ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		int temp = 0;
		for(int i = 0; i < numberCount; i++) {
			for(int j = 1; j < numberCount; j++) {
				if(numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("");
		System.out.print("The array consists of: " );
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		
	}

}
