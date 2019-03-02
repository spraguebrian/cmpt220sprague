
public class AverageHigherLower {

	public static void main(String[] args) {
		int[] numbers = new int[1000];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*1000 + 1);
		}
		int total = 0;
		for(int j = 0; j < numbers.length; j++) {
			total = total + numbers[j];
		}
		double average = 0;
		average = (double) total / numbers.length;
		System.out.println("The averge is " + average);
		int[] belowAverage = new int[1000];
		int[] aboveAverage = new int[1000];
		int countBelow = 0;
		int countAbove = 0;
		for(int k = 0; k < numbers.length; k++) {
			if(numbers[k] < average) {
				belowAverage[countBelow] = numbers[k];
				countBelow++;
			}
			else if(numbers[k] > average) {
				aboveAverage[countAbove] = numbers[k];
				countAbove++;
			}
		}
		System.out.println("");
		System.out.print("The numbers below the average are ");
		for(int q = 0; q < belowAverage.length; q++) {
			System.out.print(belowAverage[q] + ", ");
		}
		System.out.println("");
		System.out.print("The numbers above the average are ");
		for(int p = 0; p < aboveAverage.length; p++) {
			System.out.print(aboveAverage[p] + ", ");
		}
	}

}
