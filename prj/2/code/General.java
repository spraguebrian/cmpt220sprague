
public class General extends Complaint{
	public static boolean emptyList;
	General(){
		super(password, employee, general);
	}
	public static void empty() {
		emptyList = general.isEmpty();
		if(emptyList == false) {
			printHelp();
			removeComplaint();
		}
	}
	public static void printHelp() {
		System.out.println("Thank you for your input, we will look at your general input shortly.");
	}
	public static void removeComplaint() {
		general.remove(0);
	}
}
