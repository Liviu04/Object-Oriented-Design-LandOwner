package landowner;

public class NaturalCircleGeometry implements CircleGeometryRole {

	
    double myPI;
	
	public NaturalCircleGeometry(double myPI) {
		super();
		this.myPI = myPI;
	}

	
	public double computeArea(double radius) {
		
		return myPI * radius * radius;
	}
	}


