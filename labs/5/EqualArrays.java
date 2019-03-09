import java.util.Arrays;
import java.util.Scanner;
public class EqualArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many values will be in the first array: ");
		int firstSize = input.nextInt();
		int[] first = new int[firstSize];
		System.out.println("Enter the values for the first array: ");
		for(int i = 0; i < firstSize; i++) {
			first[i] = input.nextInt();
		}
		System.out.println("How many values will be in the second array: ");
		int secondSize = input.nextInt();
		int[] second = new int[secondSize];
		System.out.println("Enter the values for the second array: ");
		for(int i = 0; i < secondSize; i++) {
			second[i] = input.nextInt();
		}
		equal(first, second);
	}
	public static boolean equal(int[] x, int[] y) {
		boolean equals = true;
		Arrays.sort(x);
		Arrays.sort(y);
		for(int i = 0; i < x.length; i++) {
			if(x.length != y.length) {
				equals = false;
				System.out.println("The two arrays are not identical.");
				break;
			}
			if(x[i] != y[i]) {
				equals = false;
				System.out.println("The two arrays are not identical.");
				break;
			}
		}
		if(equals) {
			System.out.println("The two arrays are identical.");
		}
		return equals;
	}

}
