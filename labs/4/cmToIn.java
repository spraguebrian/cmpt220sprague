
public class cmToIn {

	public static void main(String[] args) {
		System.out.println("in       cm | cm       in ");
		System.out.println("--------------------------");
		int inch = 1;
		int cm = 1;
		for(int i = 0; i < 50; i++) {
			double inchToCm = inch * 2.54;
			double cmToInch = cm * .39;
			System.out.printf("%-5d%5.2f%5d%10.2f", inch, inchToCm, cm, cmToInch);
			System.out.println("");
			inch++;
			cm+=5;
		}
	}

}
