package landowner;

public class Square implements Shape {
	private double length;

	public Square(double length) {
		this.length = length;
	}

	public double computeArea() {
		return length * length;
	}

}
