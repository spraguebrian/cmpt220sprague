
public class Circle {
	double x;
	double y;
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	double radius;
	double getRadius() {
		return radius;
	}
	Circle(){}
	Circle(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	double getArea() {
		return Math.PI * Math.pow(radius,  2);
	}
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	boolean contains(double x, double y) {
		return true;
	}
	boolean contains(Circle circle) {
		return false;
	}
	boolean overlaps(Circle circle) {
		return true;
	}

}
