import java.util.Scanner;

public class inequalities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the first number: ");
		int firstNum = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.println("What is the second number: ");
		int secondNum = input2.nextInt();
		if(firstNum < secondNum) {
			System.out.println(firstNum + " is LESS THAN " + secondNum + "? true");
		}
		else {
			System.out.println(firstNum + " is LESS THAN " + secondNum + "? false");
		}
		if(firstNum <= secondNum) {
			System.out.println(firstNum + " is LESS THAN OR EQUAL TO" + secondNum + "? true");
		}
		else {
			System.out.println(firstNum + " is LESS THAN OR EQUAL TO" + secondNum + "? false");
		}
		if(firstNum == secondNum) {
			System.out.println(firstNum + " is EQUAL TO " + secondNum + "? true");
		}
		else {
			System.out.println(firstNum + " is EQUAL TO " + secondNum + "? false");
		}
		if(firstNum != secondNum) {
			System.out.println(firstNum + " is NOT EQUAL TO " + secondNum + "? true");
		}
		else {
			System.out.println(firstNum + " is NOT EQUAL TO " + secondNum + "? false");
		}
		if(firstNum > secondNum) {
			System.out.println(firstNum + " is GREATER THAN " + secondNum + "? true");
		}
		else {
			System.out.println(firstNum + " is GREATER THAN " + secondNum + "? false");
		}
		if(firstNum >= secondNum) {
			System.out.println(firstNum + " is GREATER THAN OR EQUAL TO " + secondNum + "? true");
		}
		else {
			System.out.println(firstNum + " is GREATER THAN OR EQUAL TO " + secondNum + "? false");
		}

	}

}
