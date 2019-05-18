
public class Appliance implements Comparable{
	private double voltage;
	private String color;
	private String madeIn;
	private double price;
	public Appliance(double voltage, String color, String madeIn, double price){
		this.voltage = voltage;
		this.color = color;
		this.madeIn = madeIn;
		this.price = price;
	}
	public double getVoltage() {
		return voltage;
	}
	public String getColor() {
		return color;
	}
	public String getMadeIn() {
		return madeIn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		price = price;
	}
	public String toString() {
		return "Voltage: " + voltage + " Color: " + color + "MadeIn: " + madeIn +
				" Price: " + price;
	}
	@Override
	public int compareTo(Object o) {
		// JA: You should had implemented compareTo here
		return 0;
	}

}
