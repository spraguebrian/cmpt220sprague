
public class Subclass1 extends AbstractClass{
	public void printMessage() {
		System.out.println("This is the first subclass.");
	}

	public static void main(String[] args) {
		AbstractClass c1 = new Subclass1();
		c1.printMessage();

	}

}
