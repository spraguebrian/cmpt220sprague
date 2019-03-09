import java.util.Scanner;
public class StudentsArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many students will there be? ");
		int numOfStudents = input.nextInt();
		System.out.println("Enter the names of the students: ");
		String[] names = new String[numOfStudents];
		for(int i = 0; i < numOfStudents; i++) {
			names[i] = input.next();
		}
		System.out.println("Enter the scores of the students: ");
		int[] scores = new int[numOfStudents];
		for(int i = 0; i < numOfStudents; i++) {
			scores[i] = input.nextInt();
		}
		int temp = 0;
		String tempString = "";
		for(int i = 0; i < scores.length; i++) {
			int index = i;
			for(int j = i+1; j < scores.length; j++) {
				if(scores[j] < scores[index]) {
					index = j;
				}
			}
			temp = scores[index];
			tempString = names[index];
			scores[index] = scores[i];
			names[index] = names[i];
			scores[i] = temp;
			names[i] = tempString;
		}
		System.out.println("");
		for(int i = 0; i < numOfStudents; i++) {
			System.out.print(names[i] + ", ");
		}
		System.out.println("");
		for(int i = 0; i < numOfStudents; i++) {
			System.out.print(scores[i] + ", ");
		}

	}

}
