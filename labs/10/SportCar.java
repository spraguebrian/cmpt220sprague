
public class SportCar implements Printable{
	String name;
	int plate;
	SportCar(String name, int plate){
		this.name = name;
		this.plate = plate;
	}
	@Override
	public void print() {
		System.out.println("Name: " + name + " License Plate: " + plate);
	}

}
