package problem;
import java.util.ArrayList;
import java.util.List;

import landowner.Circle;
import landowner.LandOwner;
import landowner.NaturalCircleGeometry;
import landowner.Rectangle;
import landowner.Shape;
import landowner.Square;
import landowner.Triangle;


public class Application {
    
	private LandOwner owner;
	
	public Application() {
		List<Shape>lands=new ArrayList<Shape>();
		owner=new LandOwner(lands);
	}
	public static void main(String[] args) {
		Application application = new Application();
		application.run();
	}

	private void run() {
		Rectangle land_1=new Rectangle(7, 6);
		Square land_2=new Square(4);
		Square land_3=new Square(2);
		owner.addLand(land_1);
		owner.addLand(land_2);
		owner.addLand(land_3);
		System.out.println("Total Area: " + owner.compute_total_area());
		owner.deleteLand(land_1);
		System.out.println("Total Area after deleting land_1: " + owner.compute_total_area());
		Rectangle land4=new Rectangle(5,3);
		owner.addLand(land4);
		System.out.println("Total Area after adding land_4: " + owner.compute_total_area());
		Triangle land_5=new Triangle(3,5);
		NaturalCircleGeometry circleGeometry_1=new NaturalCircleGeometry(3.1415);
		Circle land_6=new Circle(4,circleGeometry_1);
		owner.addLand(land_5);
		owner.addLand(land_6);
		System.out.println("Total Area after adding land_5 and land_6: " + owner.compute_total_area());
	}

}
