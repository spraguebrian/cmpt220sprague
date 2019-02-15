import java.util.Scanner;

public class PosIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer or 0 to stop: ");
		int num = input.nextInt();
		int countEven = 0;
		int sum = 0;
		int countTotal = 0;
		if(num > 0) {
			while(num>0) {
				if(num%2 == 0) {
					countEven++;
				}
				sum = sum + num;
				countTotal++;
				System.out.println("Enter a positive integer or 0 to stop: ");
				num = input.nextInt();
			}
		}
		System.out.println("The number of even integers: "+ countEven);
		System.out.println("The total sum: "+ sum);
		double average = (double) sum / countTotal;
		System.out.println("The average is: "+ average);

	}

}
