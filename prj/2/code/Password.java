
public class Password extends Complaint{
	public static boolean emptyList;
	Password(){
		super(password, employee, general);
	}
	public static void empty() {
		emptyList = password.isEmpty();
		if(emptyList == false) {
			printHelp();
			removeComplaint();
		}
	}
	public static void printHelp() {
		System.out.println("Thank you for your input, help with your password will be emailed to you.");
	}
	public static void removeComplaint() {
		password.remove(0);
	}

}
