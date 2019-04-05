import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer value: ");
		int num = input.nextInt();
		StackOfIntegers stack = new StackOfIntegers();
		for(int i = 2; i<=num; i++) {
			while(num%i==0) {
				stack.push(i);
				num = num/i;
			}
		}
		System.out.println("");
		int size = stack.getSize();
		for(int i = 0; i < size; i++) {
			System.out.print(stack.pop() + " ");
		}
	}
}