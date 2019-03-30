
public class TestSquare {

	public static void main(String[] args) {
		Square sq1 = new Square(40);
		Square sq2 = new Square(35.9);
		System.out.println("Square1 width, area, perimeter: " + sq1.width + ", "+sq1.getArea()+", "+sq1.getPerimeter());
		System.out.println("Square2 width, area, perimeter: " + sq2.width + ", "+sq2.getArea()+", "+sq2.getPerimeter());

	}

}
