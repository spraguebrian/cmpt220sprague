import java.util.*;
public class Course {
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();;
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		numberOfStudents++;
	}

	public String getCourseName() {
		return courseName;
	}

	// JA: You should not change the contract of the method
	public ArrayList<String> getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {
		students.remove(student);
		numberOfStudents--;
	}

}