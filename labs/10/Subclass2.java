
public class Subclass2 extends AbstractClass{
	public void printMessage() {
		System.out.println("This is the second subclass.");
	}

	public static void main(String[] args) {
		AbstractClass c2 = new Subclass2();
		c2.printMessage();

	}

}
