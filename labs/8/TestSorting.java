import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class TestSorting{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 ints: ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) {
			i = input.nextInt();
			list.add(i);
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
