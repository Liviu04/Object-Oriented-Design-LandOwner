package landowner;

public class Triangle implements Shape {

	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double computeArea() {
		
		return (base*height)/2;
	}

}
