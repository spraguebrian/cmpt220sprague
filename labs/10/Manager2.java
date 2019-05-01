
public class Manager2 implements Printable{
	String name;
	int age;
	Manager2(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public void print() {
		System.out.println("Name: " + name + " Age: " + age);
	}

}
