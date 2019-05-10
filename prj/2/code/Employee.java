
public class Employee extends Complaint{
	public static boolean emptyList;
	Employee(){
		super(password, employee, general);
	}
	public static void empty() {
		emptyList = employee.isEmpty();
		if(emptyList == false) {
			printHelp();
			removeComplaint();
		}
	}
	public static void printHelp() {
		System.out.println("Thank you for your input, we will look at your comment on our employee.");
	}
	public static void removeComplaint() {
		employee.remove(0);
	}
}
