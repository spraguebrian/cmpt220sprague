import java.util.Scanner;

public class MyString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String x = input.next();
		reverse(x);
	}
	
	public static String reverse(String s) {
		String reversed = "";
		for(int i = s.length(); i > 0; i--) {
			char temp = s.charAt(i-1);
			reversed += temp;
		}
		System.out.println(reversed);
		isPalindrome(s, reversed);
		return reversed;
	}
	
	public static boolean isPalindrome(String s, String t) {
		if(s.equalsIgnoreCase(t)) {
			System.out.println(s + " is a palindrome");
			return true;
		}
		else {
			System.out.println(s + " isn't a palindrome");
			return false;
		}
	}

}
