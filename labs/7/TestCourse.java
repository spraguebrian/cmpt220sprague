
public class TestCourse {

	public static void main(String[] args) {
		Course c1 = new Course("CS");
		c1.addStudent("Brian");
		c1.addStudent("John");
		c1.addStudent("Mike");
		c1.dropStudent("John");
		c1.getStudents();

	}

}
