
public class Rectangle implements Printable{
	int side1;
	int side2;
	Rectangle(int side1, int side2){
		this.side1 = side1;
		this.side2 = side2;
	}
	@Override
	public void print() {
		System.out.println("Side1: " + side1 + " Side2: " + side2);
	}

}
