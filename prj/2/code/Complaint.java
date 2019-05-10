import java.util.ArrayList;
import java.util.Scanner;
public abstract class Complaint {
	public static ArrayList<String> password = new ArrayList<String>();
	public static ArrayList<String> employee = new ArrayList<String>();
	public static ArrayList<String> general = new ArrayList<String>();
	public Complaint(ArrayList<String> password, ArrayList<String> employee, ArrayList<String> general) {
		this.password = password;
		this.employee = employee;
		this.general = general;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your complaint with one of the following "
				+ "key words in the front: Password, Employee, General");
		String complaint = input.next();
		if(complaint.contains("Password")) {
			password.add(complaint); 
			Password.empty();
		}
		else if(complaint.contains("Employee")) {
			employee.add(complaint);
			Employee.empty();
		}
		else if(complaint.contains("General")) {
			general.add(complaint);
			General.empty();
		}
		else {
			System.out.println("Sorry but a keyword is not present.");
		}

	}

}
